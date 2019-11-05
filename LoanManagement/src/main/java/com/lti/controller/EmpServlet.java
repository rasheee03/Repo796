package com.lti.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpServlet
 */
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		int empId=Integer.parseInt(request.getParameter("empId"));
		String ename=request.getParameter("ename");
		PrintWriter out=response.getWriter();
		
		InputStream is=getClass().getClassLoader().getResourceAsStream("config.properties");
		
		Properties prop= new Properties();
		prop.load(is);
		
		@SuppressWarnings("unused")
		String driver=(String)prop.get("db.driver");
		String url=(String)prop.get("db.url");
		String user=(String)prop.get("db.user");
		String pass=(String)prop.get("db.pass");
		
		try {
			Class.forName(driver);
		
		Connection con=DriverManager.getConnection(url,user,pass);
		out.print("Connection established");
		PreparedStatement ps=con.prepareStatement("insert into loan values(?,?)");
	
		
		ps.setInt(1,empId); 
		ps.setString(2,ename); 
		int i=ps.executeUpdate();
		if(i>0)
		{
			out.print("Data updated");
		}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		out.println(empId);
		out.println(ename);
		
		

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
