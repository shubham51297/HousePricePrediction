<%@ page import="com.util.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.DAOFactory.User" %>
<html>
<%

User usr=new User();
	ResultSet rs1=usr.getCities();
	ResultSet rs2=usr.getAreas();
	ResultSet rs3=usr.getHType();
	int count=1;
%>
<head>
<link href="<%=request.getContextPath() %>/Files/CSS/message.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath() %>/Files/CSS/button.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="<%=request.getContextPath() %>/Files/JS/style.js"></script>
<link href="<%=request.getContextPath()%>/Files/CSS/logins.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/Files/CSS/popup.css"
	rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath()%>/Files/JS/jquery-1.6.4.min.js"
	type="text/javascript"></script>
<style>
table, tr, td
th, td
{
padding:8px;
}

</style>
<style> 
#popup {

    box-shadow: 10px 10px 50px #1A1A14;
}
</style>
</head>
<body onload="startTimer()">
	<div>
		<div id="popup" style="height: 400px; width: 600px; padding: 10px; background-color: #FFFFD1;">
			


			

			<form action="<%=request.getContextPath() %>/Prediction">
					
					<input type="hidden" name="no" value="3"></input>
					
					<center>
				<table style="width: 100">
					
					<input type="submit" value="Predict" class="button_example" id="a1"/>&nbsp;&nbsp;&nbsp;&nbsp;
						
					</center>
					
					<tr>
							<td align="center" colspan="5"><label><font
									style="font-family: Monotype Corsiva; font-size: 35px; color: blue;">Prediction 3&nbsp;&nbsp; </font></label></td>
						</tr>



					
					<tr>
					<td><label><font style="color: maroon;font-weight: bold;">Enter City
								</font></label></td>
								<td>
								<select name="city" id="city" style="color: maroon;font-weight: bold;">
								<option value="select" selected="selected" readonly="readonly">--Select--</option>
								<%while(rs1.next())
									{%>
								
								<option value="<%=rs1.getString(1)%>"><%=rs1.getString(1)%></option>
								<%} %>
								</select>
								&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; 
						<label></td>
					</tr>
					
					<tr>
					
					<%
	if(Utility.parse(request.getParameter("no"))==3)
    {
		double prediction3=Double.parseDouble(request.getParameter("prediction3"));
    %>
					<td><font style="color: maroon;font-weight: bold;">Prediction 3</font></td>
					<td></td>
					<td><font style="color: maroon;font-weight: bold;"><%=prediction3%> per Sqft</font></td>
					<%} %>
					</tr>
					

				</table>
		</div>

		</form>
		
		

	</div>
	
	
</body>
</html>