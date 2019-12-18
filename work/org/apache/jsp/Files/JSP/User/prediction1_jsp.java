package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.*;
import java.sql.*;
import com.DAOFactory.User;

public final class prediction1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");


User usr=new User();
	ResultSet rs1=usr.getCities();
	ResultSet rs2=usr.getAreas();
	ResultSet rs3=usr.getHType();
	int count=1;

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/message.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/button.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JS/style.js\"></script>\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/logins.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/popup.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/Files/JS/jquery-1.6.4.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("table, tr, td\r\n");
      out.write("th, td\r\n");
      out.write("{\r\n");
      out.write("padding:8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<style> \r\n");
      out.write("#popup {\r\n");
      out.write("\r\n");
      out.write("    box-shadow: 10px 10px 50px #1A1A14;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div id=\"popup\" style=\"height: 400px; width: 600px; padding: 10px; background-color: #FFFFD1;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath() );
      out.write("/Prediction\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"no\" value=\"1\"></input>\r\n");
      out.write("\t\t\t\t\t<center>\r\n");
      out.write("\t\t\t\t<table style=\"width: 100\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Predict\" class=\"button_example\" id=\"a1\"/>&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</center>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\" colspan=\"5\"><label><font\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"font-family: Monotype Corsiva; font-size: 35px; color: blue;\">Prediction 1</font></label></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label><font style=\"color: maroon;font-weight: bold;\">Enter City\r\n");
      out.write("\t\t\t\t\t\t\t\t</font></label></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"city\" id=\"city\" style=\"color: maroon;font-weight: bold;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"select\" selected=\"selected\" readonly=\"readonly\">--Select--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
while(rs1.next())
									{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(rs1.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs1.getString(1));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;&nbsp; \r\n");
      out.write("\t\t\t\t\t\t<label></td><td>\r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color: maroon;font-weight: bold;\">Enter Area</font>\r\n");
      out.write("\t\t\t\t\t</label></td><td> <select name=\"area\" id=\"area\" style=\"color: maroon;font-weight: bold;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"select\" selected=\"selected\" readonly=\"readonly\">--Select--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
while(rs2.next())
									{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(rs2.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs2.getString(1));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td> <label><font\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: maroon;font-weight: bold;\">Type</font></label></td><td>\r\n");
      out.write("\t\t\t\t\t\t\t <select name=\"type\" id=\"type\" style=\"color: maroon;font-weight: bold;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"select\" selected=\"selected\" readonly=\"readonly\">--Select--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
while(rs3.next())
									{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(rs3.getString(1));
      out.write('"');
      out.write('>');
      out.print(rs3.getString(1));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");

	if(Utility.parse(request.getParameter("no"))==1)
    {
		double prediction1=Double.parseDouble(request.getParameter("prediction1"));
    
      out.write("\r\n");
      out.write("\t\t\t\t\t<td><font style=\"color: maroon;font-weight: bold;\">Prediction</font></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td><font style=\"color: maroon;font-weight: bold;\">");
      out.print(prediction1);
      out.write(" per Sqft</font></td>\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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
