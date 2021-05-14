package com.reg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public search() {
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
			
			//Database Credentials
			final String USER="root";
			final String PASS="root12345678";
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			System.out.println("Hi");
			Connection conn = null;
			PreparedStatement stmt = null;
			
			//step2 register JDBC_Driver
			Class.forName(JDBC_Driver);
			
			//step3 open a connection
			System.out.println("Connection to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Database connected successfully");
			
			System.out.println("Get Records from table");
			stmt = conn.prepareStatement("SELECT * FROM customer WHERE accno = ?");
			int accno = Integer.parseInt(request.getParameter("accno"));
			stmt.setInt(1, accno);
			
			out.print("<table width=25% border=1");
			out.print("<center><h1>Customer Detail</h1></center>");
			
			ResultSet rs = stmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			out.print("<tr>");
			
			out.print("<th>" + rsmd.getColumnName(1) + "</th>");
			out.print("<th>" + rsmd.getColumnName(2) + "</th>");
			out.print("<th>" + rsmd.getColumnName(3) + "</th>");
			out.print("<th>" + rsmd.getColumnName(5) + "</th>");
			out.print("<th>" + rsmd.getColumnName(6) + "</th>");
			out.print("<th>" + rsmd.getColumnName(7) + "</th></tr>");
			
			while(rs.next()) {
				out.print("<tr><td>" + rs.getInt(1) + "</td>");
				out.print("<td>" + rs.getString(2) + "</td>");
				out.print("<td>" + rs.getString(3) + "</td>");
				out.print("<td>" + rs.getString(5) + "</td>");
				out.print("<td>" + rs.getString(6) + "</td>");
				out.print("<td>" + rs.getString(7) + "</td></tr>");
			}
			
			out.print("</table>");
			
			out.print("<a href=\"details.jsp\">Back</a><br>");
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
