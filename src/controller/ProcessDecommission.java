package controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.*;

public class ProcessDecommission extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Remove all aircraft logic
		SingletonDatabase.deleteRecord(getServletContext().getInitParameter("jdbcDriver"),
				getServletConfig().getInitParameter("jdbcUrl"), getServletConfig().getInitParameter("dbUserName"),
				getServletConfig().getInitParameter("dbUserPassword"));

		Connection x = SingletonDatabase.getConnection();
		Connection y = SingletonDatabase.getConnection();
		Connection z = SingletonDatabase.getConnection();

		if (x.equals(y) || y.equals(z) && x.equals(z)) {
			System.out.println("ProcessDecommission Connection");
			System.out.println("Connection to the database established");
		} else {
			System.out.println("ProcessDecommission Connection");
			System.out.println("Connection to the database failed");
		}

		String redirectURL = "index.jsp";
		response.sendRedirect(redirectURL);

	}

}
