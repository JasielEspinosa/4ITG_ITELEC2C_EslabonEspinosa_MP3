package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utility.*;

import model.company.Company;
import model.engine.EngineType;
import model.manufacturer.*;
import user.UserBudget;

public class ProcessSold extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		// try {

		if (session.getAttribute("itelecOrder") == null) {
			response.sendRedirect("errorOrderTransacted.jsp");
		} else {

			/*
			 * String selectedManufacturer =
			 * request.getParameter("selManufacturer"); String
			 * selectedAircraftType = request.getParameter("selACType"); String
			 * selectedAirline = request.getParameter("selAirline"); String
			 * selectedEngineType = request.getParameter("selEng");
			 */

			String manufacturerSession = session.getAttribute("selManufacturer").toString();
			String aircraftTypeSession = session.getAttribute("selACType").toString();
			String companySession = session.getAttribute("selAirline").toString();
			String engineTypeSession = session.getAttribute("selEng").toString();

			Manufactures manufacturer = new ManufacturingFactory().getAircraft(manufacturerSession);
			manufacturer.setAircraft(new AircraftFactory().getAircraft(aircraftTypeSession, manufacturer));
			Company company = new CompanyFactory().getCompany(companySession, manufacturer);
			EngineType engineType = new EngineFactory().getEngineType(engineTypeSession, manufacturer);

			UserBudget userBudget = new UserBudget();

			// Number of Orders
			double orderCount = Double.parseDouble(request.getParameter("noOfOrders"));
			userBudget.setOrderCount(orderCount);

			// Calculation of the aircraft price times the number of order/s
			double finalPrice = manufacturer.getAircraft().viewAircraftPrice() * orderCount;
			userBudget.setFinalPrice(finalPrice);

			double calculate = UserBudget.getBudget() - (finalPrice);

			if (calculate < 0) {

				// If the budget reaches below 0, the order will repeat
				/*
				 * request.setAttribute("manufacturer", manufacturer);
				 * request.setAttribute("company", company);
				 * request.setAttribute("engineType", engineType);
				 */
				request.setAttribute("userBudget", userBudget);
				request.getRequestDispatcher("displayRevive.jsp").forward(request, response);

			} else {

				// Sets the calculation of the final price
				UserBudget.setBudget(calculate);

				// passes the details to the output
				request.setAttribute("manufacturer", manufacturer);
				request.setAttribute("company", company);
				request.setAttribute("engineType", engineType);
				request.setAttribute("userBudget", userBudget);

				for (int i = 0; i < orderCount; i++) {
					SingletonDatabase.insertRecord(manufacturer, company, engineType,
							getServletContext().getInitParameter("jdbcDriver"),
							getServletConfig().getInitParameter("jdbcUrl"),
							getServletConfig().getInitParameter("dbUserName"),
							getServletConfig().getInitParameter("dbUserPassword"));
				}

				Connection x = SingletonDatabase.getConnection();
				Connection y = SingletonDatabase.getConnection();
				Connection z = SingletonDatabase.getConnection();

				if (x.equals(y) || y.equals(z) && x.equals(z)) {
					System.out.println("ProcessSold Connection");
					System.out.println("Connection to the database established");
				} else {
					System.out.println("ProcessSold Connection");
					System.out.println("Connection to the database failed");
				}

				session.invalidate();

				request.getRequestDispatcher("displaySuccessOrder.jsp").forward(request, response);

			}

		}

		/*
		 * } catch (NullPointerException e) {
		 * response.sendRedirect("errorOrderTransacted.jsp"); } catch
		 * (Exception e) { response.sendRedirect("errorOrderTransacted.jsp");
		 * }
		 */

	}

}
