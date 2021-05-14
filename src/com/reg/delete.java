package com.reg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class delete
 */
@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			final String JDBC_Driver="com.mysql.jdbc.Driver";
			final String DB_URL="jdbc:mysql://localhost/pro1";
			
			//Database credentials
			final String USER="root";
			final String PASS="root12345678";
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			System.out.println("hi");
			
			Connection conn = null;
			PreparedStatement stmt = null;
			
			//STEP:2 Register for Driver
			Class.forName(JDBC_Driver);
			
			//step3 open a connection
			System.out.println("Connection to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Database connected successfully");
			
			System.out.println("Deleting records from database...");
			stmt = conn.prepareStatement("DELETE FROM customer WHERE accno = ?");
			
			int accno = Integer.parseInt(request.getParameter("accno"));
			stmt.setInt(1, accno);
			stmt.executeUpdate();
			
			out.print("<h2>Account deleted Successfully.</h2>");
			out.print("<a href=\"home.jsp\">Home</a>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
