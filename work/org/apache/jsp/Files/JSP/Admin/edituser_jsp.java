package org.apache.jsp.Files.JSP.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.*;
import java.sql.*;

public final class edituser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");

	ResultSet rs=(ResultSet)request.getAttribute("rs");
	int id=0;
	String userid="",add="",phone="",city="",name="",email="";
	while(rs.next())
	{
		id=rs.getInt(1);
		userid=rs.getString(2);
		name=rs.getString(4);
		add=rs.getString(6);
		city=rs.getString(7);
		email=rs.getString(8);
		phone=rs.getString(9);
	}

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/message.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/login.css\" type=\"text/css\"/>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JS/style.js\"></script>\r\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/logins.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/popup.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/Files/JS/jquery-1.6.4.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("table, tr, td\r\n");
      out.write("th, td\r\n");
      out.write("{\r\n");
      out.write("padding:8px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<style> \r\n");
      out.write("#popup {\r\n");
      out.write("\r\n");
      out.write("    box-shadow: 10px 10px 50px #1A1A14;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("\r\n");
      out.write("<div >\r\n");
      out.write("\t\t<div id=\"popup\" style=\"height: 400px; width: 600px; padding: 10px; background-color: #FFFFD1;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"");
      out.print(request.getContextPath() );
      out.write("/UserList\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"submit\" value=\"Edit\"></input>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"edit1\" value=\"YES\"></input>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(id );
      out.write("\"></input>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div style=\"position: absolute; top: 30px; left: 50px;\">\r\n");
      out.write("\t\t\t\t\t<table style=\"width: 100\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\" colspan=\"5\"><label>\r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"font-family: Monotype Corsiva; font-size: 35px; color: blue;\">Edit User</font></label></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<br><br/>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><label><font style=\"color: maroon;font-weight: bold;\">UserId</font></label></td><td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" value=\"");
      out.print(userid );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttabindex=\"1\" name=\"id\" class=\"input\" placeholder=\"User Id\"\r\n");
      out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\"></td><td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color: maroon;font-weight: bold;\">Name</font></label></td><td>\r\n");
      out.write("\t\t\t\t\t\t\t <input type=\"text\" value=\"");
      out.print(name );
      out.write("\" tabindex=\"1\" class=\"input\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\t\t required>\r\n");
      out.write("\t\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><label><font style=\"color: maroon;font-weight: bold;\">Address</font></label></td><td>\r\n");
      out.write("\t\t\t\t\t\t\t\t <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttabindex=\"1\" name=\"add\" class=\"input\" value=\"");
      out.print(add );
      out.write("\" \r\n");
      out.write("\t\t\t\t\t\t\t\trequired></td><td><label><font\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: maroon;font-weight: bold;\">City</font></label></td><td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"input\" tabindex=\"2\" name=\"city\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(city );
      out.write("\"required></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><label><font style=\"color: maroon;font-weight: bold;\">Email</font></label></td><td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" tabindex=\"1\" class=\"input\" name=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(email );
      out.write("\" \r\n");
      out.write("\t\t\t\t\t\t\t\tpattern=\"\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*\" required></td><td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label> <font style=\"color: maroon;font-weight: bold;\">Phone</font></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td><td> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input\" tabindex=\"2\" name=\"phone\" value=\"");
      out.print(phone );
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tpattern=\"[7-9]{1}[0-9]{9}\"\r\n");
      out.write("\t\t\t\t\t\t\t\trequired></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<br><br/>\r\n");
      out.write("\t\t\t\t\t<center><input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"image\" id=\"\" value=\"register\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Images/update.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"submit Button\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"gradientbuttons\" height=\"60\" width=\"80\"></center>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");

if(Utility.parse(request.getParameter("no"))==1)
{
      out.write("\r\n");
      out.write("\t<div class=\"error\" id=\"message\" style=\"position:absolute\">\t\r\n");
      out.write("\t\t<p>Sorry this user id is already exists.....!</p>\r\n");
      out.write("\t</div>\t\t\t\r\n");
}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
