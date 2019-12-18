<html>
<%
	String user=request.getAttribute("user").toString();
	System.out.println("user name isss "+user);
%>
<script language="JavaScript" type="text/javascript">
javascript:window.history.forward(-1);
</script>

<head>
<link href="<%=request.getContextPath() %>/Files/CSS/style.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="<%=request.getContextPath() %>/Files/CSS/button.css"
	type="text/css" />
	
	<link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">
    
    
    
        <link rel="stylesheet" href="css/style.css">
	
	
	
</head>
<body>
	<img src="<%=request.getContextPath() %>/Files/Images/1.png" width="1200px" alt=""></img>


	<div style="position: absolute; top: 190px; left: 10px;">
	
	
	<button id="expand-navigation">-</button>

<section class="wrapper opened">

<font style='font-family: Monotype Corsiva; font-size: 25px; color: purple;'>Welcome<%=user %></font> <br>
  <ul>
    <li><a href="<%=request.getContextPath() %>/UserProfile?name=<%=user %>"target="afrm"><label style="font-size:12px" >Show Profile</label></a></li>
    <li><a href="<%=request.getContextPath() %>/Files/JSP/User/prediction1.jsp" target="afrm"><label style="font-size:12px" >Prediction 1</label></a></li>
    <li><a href="<%=request.getContextPath() %>/Files/JSP/User/prediction2.jsp" target="afrm"><label style="font-size:12px">Prediction 2</label></a></li>
    <li><a href="<%=request.getContextPath() %>/Files/JSP/User/prediction3.jsp" target="afrm"><label style="font-size:12px">Prediction 3</label></a></li>
    <li><a href="<%=request.getContextPath() %>/Files/JSP/User/logout.jsp?name=<%=user %>"><label style="font-size:12px">Sign Out</label></a></li>
    <li><a href="#"><span class=""></span></a></li>
  </ul>
</section>

<div class="overlay on-overlay"></div>
    
        <script src="js/index.js"></script>
	
	
	
	<%-- 	<font
			style='font-family: Monotype Corsiva; font-size: 25px; color: purple;'>Welcome
			<%=user %></font> <br>
		<br /> <a class="button_example"
			href="<%=request.getContextPath() %>/UserProfile?name=<%=user %>"
			target="afrm">&nbsp;Show Profile &nbsp;</a><br></br> <a
			class="button_example"
			href="<%=request.getContextPath() %>/UploadFile?name=<%=user %>&amp;submit=get"
			target="afrm">&nbsp;Upload File &nbsp;&nbsp;</a><br></br> <a
			class="button_example"
			href="<%=request.getContextPath() %>/DownloadFile?name=<%=user %>&amp;submit=get"
			target="afrm">Download File</a><br></br> <a class="button_example"
			href="<%=request.getContextPath() %>/Trans?name=<%=user%>"
			target="afrm">&nbsp;Transactions</a><br></br> <a>
			 
			
			<!--   <a class="button_example"
			href="<%=request.getContextPath() %>/AuditRequest?name=<%=user%>"
			target="afrm">&nbsp;Send Request &nbsp;</a><br></br> <a> -->
			
			
			
			<a class="button_example" href="<%=request.getContextPath() %>/Files/JSP/User/logout.jsp?name=<%=user %>">&nbsp;&nbsp;&nbsp;Sign Out&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
 --%>
	</div>


	<div style="position: absolute; top: 140px; left: 150px;">
		<iframe frameborder="0" scrolling="auto" name="afrm" height="470"
			width="900"></iframe>
	</div>
</body>
</html>