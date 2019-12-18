<%@ page import="com.DAOFactory.*"%>
<%@ page import="java.sql.*"%>

<%@ page import="com.util.*" %>
<html>

<head>

<link rel="stylesheet"
	href="<%=request.getContextPath() %>/Files/CSS/button.css"
	type="text/css" />
	
		<link href="<%=request.getContextPath() %>/Files/CSS/style.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="<%=request.getContextPath() %>/Files/CSS/button.css" type="text/css"/>
	<link href="<%=request.getContextPath()%>/Files/CSS/styles.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath()%>/Files/CSS/logins.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath()%>/Files/CSS/popup.css" rel="stylesheet" type="text/css" />
	<script src="<%=request.getContextPath()%>/Files/JS/jquery-1.6.4.min.js" type="text/javascript"></script>
	
	 <link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">
    
    
    
        <link rel="stylesheet" href="css/style.css">
	
</head>
<body>
	 <form data-scroll-reveal="enter from the bottom after 0.3s" action="<%=request.getContextPath() %>/Uploadexeloriginaldata" method="post" enctype="multipart/form-data">
                    
                  
                        <div class="form-group">
                        <label><font style="color: maroon;font-weight: bold;">Select Your Excel File</font></label>
                           <input type="file"  name="file"  accept=".xlsx"  required="required" width="200px"></input>
                        </div>
                        
                        <div class="form-group">
                          
                            
                            <input type="submit" class="button_example" value="upload"  />
                           
                           
                        </div>

                    </form>
</body>

<%
		int no=Utility.parse(request.getParameter("no"));
		
		if(no==3)
		{
%>
			<div class="error" id="message" style="position:absolute;top:600px;left:50px">
				<script type="text/javascript">
				
				
				alert("opps something went wrong");</script>
			</div>
<%
		}
		if(no==4)
		{
%>
			<div class="error" id="message" style="position:absolute;top:600px;left:50px">
				<script type="text/javascript">
				
				
				alert("Password changed succssfully");</script>
			</div>
<%
		}	
		if(no==2)
		{
%>
			<div class="error" id="message" style="position:absolute;top:600px;left:50px">
				<script type="text/javascript">
				
				
				alert(" House Dataset imported from excel sheet to database correctly");</script>
			</div>
<%
		}
%>   
</html>