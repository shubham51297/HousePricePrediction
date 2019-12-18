/**
 * 
 */
package com.action.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAOFactory.Admin;
import com.DAOFactory.DAO;
import com.DAOFactory.DAOFactory;
import com.util.LinearRegression;
import com.util.Utility;


public class Prediction extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException 
	{
		PrintWriter out=response.getWriter();
		try
		{
			int no=Integer.parseInt(request.getParameter("no"));
			DAOFactory factory=new DAOFactory();
			DAO dao=factory.getInstance("User");
			if(no==1)
			{
				String city=request.getParameter("city");
				String area=request.getParameter("area");
				String type=request.getParameter("type");
			    
				double sqft[]=new double[2000];
				double year[]=new double[2000];
				ArrayList list1=new ArrayList();
			
				list1=Admin.getPredictData1(city, area,type);
				for(int i=0;i<list1.size();i++)
				{
					String a=list1.get(0).toString();
					String arr[]=a.split("~~");
					
					sqft[i]=Double.parseDouble(arr[0]) ;
					year[i]=Double.parseDouble(arr[1]) ;
				}
				double prediction1=LinearRegression.yield_predict(sqft, year);
				prediction1=round(prediction1, 2);
				
					RequestDispatcher rd=request.getRequestDispatcher("/Files/JSP/User/prediction1.jsp?no=1&prediction1="+prediction1+"");
					rd.forward(request, response);
				

			}
			if(no==2)
			{
				String city=request.getParameter("city");
				String area=request.getParameter("area");
				String budget=request.getParameter("budget");
				
				double sqft[]=new double[2000];
				double year[]=new double[2000];
				ArrayList list1=new ArrayList();
			
				list1=Admin.getPredictData1(city, area,budget);
				for(int i=0;i<list1.size();i++)
				{
					String a=list1.get(0).toString();
					String arr[]=a.split("~~");
					
					sqft[i]=Double.parseDouble(arr[0]) ;
					year[i]=Double.parseDouble(arr[1]) ;
				}
				double prediction2=LinearRegression.yield_predict(sqft, year);
				prediction2=round(prediction2, 2);
			
				RequestDispatcher rd=request.getRequestDispatcher("/Files/JSP/User/prediction2.jsp?no=2&prediction2="+prediction2+"");
				rd.forward(request, response);
				
			}
			
			if(no==3)
			{
				String city=request.getParameter("city");
				
				double sqft[]=new double[2000];
				double year[]=new double[2000];
				ArrayList list1=new ArrayList();
			
				list1=Admin.getPredictData3(city);
				System.out.println(list1.size());
				for(int i=0;i<list1.size();i++)
				{
					String a=list1.get(0).toString();
					String arr[]=a.split("~~");
					
					sqft[i]=Double.parseDouble(arr[0]) ;
					year[i]=Double.parseDouble(arr[1]) ;
				}
				double prediction3=LinearRegression.yield_predict(sqft, year);
				prediction3=round(prediction3, 2);
			
					RequestDispatcher rd=request.getRequestDispatcher("/Files/JSP/User/prediction3.jsp?no=3&prediction3="+prediction3+"");
					rd.forward(request, response);
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in User EditProfile Servlet......"+e);
			out.println("Opps's Error is in User EditProfile Servlet......"+e);
		}
		
		
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
}
