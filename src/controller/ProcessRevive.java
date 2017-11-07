package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.UserBudget;

public class ProcessRevive extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		if (session.getAttribute("itelecOrder") == null) {
			response.sendRedirect("errorOrderTransacted.jsp");
		} else {
			UserBudget userBudget = new UserBudget();
			
			// Sets the calculation of the final price
			UserBudget.setBudget(userBudget.getCurrentBudget() + 350000000);
			
			// Passes the details to the output
			request.setAttribute("userBudget", userBudget);
			request.getRequestDispatcher("displayConfirmOrder.jsp").forward(request, response);
		}

		//@formatter:off
/*		String selectedManufacturer = request.getParameter("selManufacturer");
		String selectedAircraftType = request.getParameter("selACType");
		String selectedAirline = request.getParameter("selAirline");
		String selectedEngineType = request.getParameter("selEng");
		
		Manufactures manufacturer = new ManufacturingFactory().getAircraft(selectedManufacturer);
		manufacturer.setAircraft(new AircraftFactory().getAircraft(selectedAircraftType, manufacturer));
		Company company = new CompanyFactory().getCompany(selectedAirline, manufacturer);
		EngineType engineType = new EngineFactory().getEngineType(selectedEngineType, manufacturer);
		
		UserBudget userBudget = new UserBudget();

		// Sets the calculation of the final price
		UserBudget.setBudget(userBudget.getCurrentBudget() + 350000000);

		// passes the details to the output
		request.setAttribute("manufacturer", manufacturer);
		request.setAttribute("company", company);
		request.setAttribute("engineType", engineType);
		request.setAttribute("userBudget", userBudget);
		
		request.getRequestDispatcher("displayConfirmOrder.jsp").forward(request, response);*/
		//@formatter:on

	}
}
