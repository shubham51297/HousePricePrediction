<html>
<%
	String admin=request.getAttribute("admin").toString();
%>
<script language="JavaScript">
javascript:window.history.forward(-1);
</script>

<head>
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

    


	 <img src="<%=request.getContextPath() %>/Files/Images/1.png" width=1200px></img> 
	

<div style="position:absolute;top:140px;left:10px;">

<!-- <font style="font-family: Monotype Corsiva; font-size: 30px; color:purple;'>Welcome <%=admin %></font> -->

<font style='font-family: Monotype Corsiva; font-size: 25px; color: purple;'>Welcome<%=admin %></font> <br>

<button id="expand-navigation">-</button>

<section class="wrapper opened">
  <ul>
    <li><a href="<%=request.getContextPath() %>/AdminProfile?name=<%=admin %>" target="afrm"><label style="font-size:12px" >Profile</label></a></li>
    <li><a href="<%=request.getContextPath() %>/UserList?submit=get" target="afrm"><label style="font-size:12px" >User Details</label></a></li>
     <li><a href="<%=request.getContextPath() %>/Files/JSP/Admin/trans1.jsp" target="afrm"><label style="font-size:12px">Upload Dataset</label></a></li>
   
    <li><a href="<%=request.getContextPath() %>/Files/JSP/Admin/viewdataset.jsp" target="afrm"><label style="font-size:12px">View Dataset</label></a></li>
   
    <li><a href="<%=request.getContextPath() %>/index.jsp"><label style="font-size:12px">Sign Out</label></a></li>
  </ul>
</section>

<div class="overlay on-overlay"></div>
    
        <script src="js/index.js"></script>


<%-- 	<font style="font-family: Monotype Corsiva; font-size: 30px; color:;">Welcome <%=admin %></font>
	<br><br>	
	<a class="button_example" href="<%=request.getContextPath() %>/AdminProfile?name=<%=admin %>" target="afrm">Show Profile&nbsp;&nbsp;</a><br></br>
	<!--  <a class="button_example" href="<%=request.getContextPath()%>/GroupList?submit=get" target="afrm">Group List&nbsp;&nbsp;&nbsp;</a><br></br>-->
	 <a class="button_example" href="<%=request.getContextPath() %>/UserList?submit=get" target="afrm">User Details&nbsp;&nbsp;</a><br></br>
 	<a class="button_example" href="<%=request.getContextPath() %>/CloudList?submit=get" target="afrm">Cloud Details</a><br></br> 
    <a class="button_example" href="<%=request.getContextPath() %>/HashDetails?submit=get" target="afrm">Hash Details&nbsp;&nbsp;</a><br></br>
	<a class="button_example" href="<%=request.getContextPath() %>/Trans1?submit=get" target="afrm">Transactions&nbsp;</a><br></br>
	<a class="button_example" href="<%=request.getContextPath() %>/index.jsp">&nbsp;&nbsp;Sign Out&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a> --%>
</div>		
	
	
	<div style="position:absolute;top:140px;left:150px;">
		<iframe frameborder="0" scrolling="auto" name="afrm" height="470" width="800" style;>
		</iframe>
	</div>
</body>
</html>