package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.company.Company;
import model.engine.EngineType;
import model.manufacturer.Manufactures;
import user.UserBudget;
import utility.*;

public class ProcessFactoryReviewMarket extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		
		session.setAttribute("itelecOrder", "order");
		
		String selectedManufacturer = request.getParameter("selManufacturer");
		String selectedAircraftType = request.getParameter("selACType");
		String selectedAirline = request.getParameter("selAirline");
		String selectedEngineType = request.getParameter("selEng");
		
		session.setAttribute("selManufacturer", selectedManufacturer);
		session.setAttribute("selACType", selectedAircraftType);
		session.setAttribute("selAirline", selectedAirline);
		session.setAttribute("selEng", selectedEngineType);
		
		Manufactures manufacturer = new ManufacturingFactory().getAircraft(selectedManufacturer);
		manufacturer.setAircraft(new AircraftFactory().getAircraft(selectedAircraftType, manufacturer));
		Company company = new CompanyFactory().getCompany(selectedAirline, manufacturer);
		EngineType engineType = new EngineFactory().getEngineType(selectedEngineType, manufacturer);
		
		UserBudget userBudget = new UserBudget();
		
		session.setAttribute("manufacturer", manufacturer);
		session.setAttribute("company", company);
		session.setAttribute("engineType", engineType);
		request.setAttribute("userBudget", userBudget);
		
		request.getRequestDispatcher("displayDetails.jsp").forward(request, response);
		
	}

}
