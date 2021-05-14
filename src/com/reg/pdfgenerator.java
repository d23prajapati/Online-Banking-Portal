package com.reg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reg.DBConnection;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

/**
 * Servlet implementation class pdfgenerator
 */
@WebServlet("/pdfgenerator")
public class pdfgenerator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pdfgenerator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str="pdf";

		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try
		{
		    Document document=new Document();
		    if(str.equals("pdf"))
		    {
		        response.setContentType("application/pdf");
		        PdfWriter.getInstance(document,response.getOutputStream());
		    }
		    conn= DBConnection.getConnection();
		    String query = "select * from customer";          //Fetching data from table
		       ps=conn.prepareStatement(query);                // executing query
		       rs=ps.executeQuery();
		      
		    document.open();

		    /* new paragraph instance initialized and add function write in pdf file*/
		    document.add(new Paragraph("---------------------------------------------------------REPORT---------------------------------------------------------\n\n"));
		    document.add(new Paragraph("                                                  CUSTOMERS DATA\n\n"));
		    document.add(new Paragraph("---------------------------------------------------------------------------------------------------------------------------------"));
		    document.addCreationDate();
		   
		    while(rs.next())
		    {
		          // fetch & writing records in pdf files
		        document.add(new Paragraph("ACC NO ::"+rs.getInt(1)+"\n Email ::"+rs.getString(2)+"\n Name ::"+rs.getString(3)+ "\n Pass ::"+rs.getString(4)+ "\n Balance ::"+rs.getString(5)+"\n Ph No. ::"+rs.getString(6)+ "\n Address ::"+rs.getString(7)+ "\n\n"));
		    }
		    document.add(new Paragraph("---------------------------------------------------------PAGE NO::"+document.getPageNumber()+"------------------------------------------------------"));
		   
		    document.close(); //document instance closed
		    conn.close();  //db connection close
		}
		catch(Exception de)
		{
		        de.printStackTrace();
		            System.err.println("document: " + de.getMessage());
		           
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
