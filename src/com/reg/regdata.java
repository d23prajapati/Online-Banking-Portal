package com.reg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class regdata
 */
@WebServlet("/regdata")
public class regdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regdata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//JDBC driver name and url name
			final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
			final String DB_URL = "jdbc:mysql://localhost/pro1";
			
			//Database credentials
			final String USER = "root";
			final String PASS = "root12345678";
			System.out.println("hi");
			
			Connection conn = null;
			PreparedStatement stmt = null;
			
			//register Driver
			Class.forName(JDBC_DRIVER);
			
			//open a Connection
			System.out.println("Connecting to Database...");
			conn = DriverManager.getConnection(DB_URL,USER, PASS);
			System.out.println("Connected to Database successfully...");
			
			System.out.println("Inserting values in table...");
			stmt = conn.prepareStatement("INSERT INTO customer values(?,?,?,?,?,?,?)");
			stmt.setString(1,request.getParameter("accno"));
			stmt.setString(2,request.getParameter("email"));
			stmt.setString(3,request.getParameter("name"));
			stmt.setString(4,request.getParameter("pass"));
			stmt.setString(5,request.getParameter("balance"));
			stmt.setString(6,request.getParameter("phno"));
			stmt.setString(7,request.getParameter("address"));
			
			stmt.executeUpdate();
			System.out.println("Inserted into database");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
