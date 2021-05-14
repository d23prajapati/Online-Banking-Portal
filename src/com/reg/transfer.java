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
 * Servlet implementation class transfer
 */
@WebServlet("/transfer")
public class transfer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public transfer() {
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
			final String JDBC_Driver="com.mysql.jdbc.Driver";
			final String DB_URL="jdbc:mysql://localhost/pro1";
			
			//Database Credentials
			final String USER="root";
			final String PASS="root12345678";
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			System.out.println("Hi");
			Connection conn = null;
			PreparedStatement stmt1 = null;
			PreparedStatement stmt2 = null;
			
			//step2 register JDBC_Driver
			Class.forName(JDBC_Driver);
			
			//step3 open a connection
			System.out.println("Connection to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Database connected successfully");
			
			System.out.println("Update table");
			stmt1 = conn.prepareStatement("UPDATE customer SET balance = balance - ? WHERE accno= ?");
			int transferMoney = Integer.parseInt(request.getParameter("balance"));
			int accno1 = Integer.parseInt(request.getParameter("accno1"));
			int accno2 = Integer.parseInt(request.getParameter("accno2"));
			stmt1.setInt(1, transferMoney);
			stmt1.setInt(2, accno1);
			stmt1.executeUpdate();
			
			stmt2 = conn.prepareStatement("UPDATE customer SET balance = balance + ? WHERE accno= ?");
			stmt2.setInt(1, transferMoney);
			stmt2.setInt(2, accno2);
			stmt2.executeUpdate();
			
			out.print("Transferred " + transferMoney + " Rs Successfully");
			
			out.print("<br><a href=\"transfer.jsp\">Back</a><br>");
			out.print("<a href=\"home.jsp\">Home</a>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
