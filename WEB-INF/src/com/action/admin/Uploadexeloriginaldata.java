package com.action.admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.DAOFactory.Admin;





public class Uploadexeloriginaldata extends HttpServlet
{
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	
			throws IOException 
			{
		PrintWriter out = response.getWriter();
		try {
			boolean flag1=false;
			boolean flag11=false;
			boolean flag22=false;
			boolean flag33=false;
			
			boolean flag44=false;
			String fileName = "", root = "", md = "", dir = "cloud_iseive",root1 = "",root2="";
			String status; 
			String[] name = new String[2];
			int i = 0;
			File uploadedFile = null;
			File uploadedFile1=null;
			ResultSet rs = null;
			boolean flag = false;
			boolean flag_upload = false;
			RequestDispatcher rd = null;
			Random random = new Random();
			int num, num1 = 0;
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			String name1=request.getParameter("name");
			System.out.println("value of name1 is  "+name1);
			//String grpname=CommonDAO.getGroupName(name1);

	
	
	if (isMultipart)
	{
		
		
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		
			
			List items = upload.parseRequest(request);
			Iterator iterator = items.iterator();
			while (iterator.hasNext())
			{
				FileItem item = (FileItem) iterator.next();
				if (item.isFormField())
				{
					name[i] = item.getString();
					i++;
				} 
				else 
				{
					fileName = item.getName();
					System.out.println("filename iss" + fileName);
					root = getServletContext().getRealPath("/Excel");
					
					
					uploadedFile = new File(root +"/"+fileName);
					
					System.out.println("Directory name iss" + uploadedFile);
					item.write(uploadedFile);
				}
			}
		
	}
	
	
		ArrayList data=new ArrayList();
		String memb_code=null;
		String policy_mem_code="AB";
		int row11=0;
		FileInputStream file=null;
		XSSFWorkbook workbook=null;
		int i1=0;


		file = new FileInputStream(new File(root +"/"+fileName));
			 workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			int count=0;
			for(Row row : sheet) 
			{count++;
				StringBuffer sb1= new StringBuffer();
         if(i1==0)
					
				{
				
				 row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				
				while (cellIterator.hasNext()) 
				{
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) 
					{
						case Cell.CELL_TYPE_NUMERIC:
							break;
						case Cell.CELL_TYPE_STRING:
							break;
					}
				}
				i1=1;	
			  }
               else{
				   for(int cn=0; cn<8; cn++) 
				   {
				       
				       Cell cell = row.getCell(cn, Row.CREATE_NULL_AS_BLANK);
				       // Print the cell for debugging
				       System.out.println("CELL: " + cn + " --> " + cell.toString());
				       
				       if (cn==0||cn==1 || cn==2||cn==3 || cn==4||cn==5 || cn==6||cn==7)
				       {
				    	   if(cell.toString().isEmpty())
				    	   {
				    		   sb1.append("null");
				    	   }
				       }
				       sb1.append(cell.toString());
				       sb1.append("~~");
				       
				   }
				   StringBuffer buf = null;
				   String ss=sb1.toString();
			        // System.out.println("||||||||||||||||||||||||||||||||||||||||||||"+ss);
			         String[] splits = ss.split("~~");
			         
			           String part1 = splits[0]; 
			          
						String part2 = splits[1];
						
						  String part3 = splits[2]; 
				          
							String part4 = splits[3];
							
							
							
							  String part5 = splits[4]; 
					          
								String part6 = splits[5];
								
								
								  String part7 = splits[6]; 
						          
									String part8 = splits[7];
									
						
									 flag1=Admin.storedataset(part1,part2,part3,part4,part5,part6,part7,part8);
					
						
						
						
               }
         


		}



			if(flag1)
			{
				RequestDispatcher rd1=request.getRequestDispatcher("/Files/JSP/Admin/trans1.jsp?no=2");
				
				rd1.forward(request, response);
			}else
			{
          RequestDispatcher rd1=request.getRequestDispatcher("/Files/JSP/Admin/trans1.jsp?no=3");
				
				rd1.forward(request, response);	
			}	

				
		
		
		
	}
	
	
	catch (Exception e) {
		
	}
	
			}
}
