package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");

	String user=request.getAttribute("user").toString();
	System.out.println("user name isss "+user);

      out.write("\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("javascript:window.history.forward(-1);\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/style.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/button.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("\t\r\n");
      out.write("\t<link href=\"//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/Images/1.png\" width=\"1200px\" alt=\"\"></img>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"position: absolute; top: 190px; left: 10px;\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<button id=\"expand-navigation\">-</button>\r\n");
      out.write("\r\n");
      out.write("<section class=\"wrapper opened\">\r\n");
      out.write("\r\n");
      out.write("<font style='font-family: Monotype Corsiva; font-size: 25px; color: purple;'>Welcome");
      out.print(user );
      out.write("</font> <br>\r\n");
      out.write("  <ul>\r\n");
      out.write("    <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/UserProfile?name=");
      out.print(user );
      out.write("\"target=\"afrm\"><label style=\"font-size:12px\" >Show Profile</label></a></li>\r\n");
      out.write("    <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JSP/User/prediction1.jsp\" target=\"afrm\"><label style=\"font-size:12px\" >Prediction 1</label></a></li>\r\n");
      out.write("    <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JSP/User/prediction2.jsp\" target=\"afrm\"><label style=\"font-size:12px\">Prediction 2</label></a></li>\r\n");
      out.write("    <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JSP/User/prediction3.jsp\" target=\"afrm\"><label style=\"font-size:12px\">Prediction 3</label></a></li>\r\n");
      out.write("    <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JSP/User/logout.jsp?name=");
      out.print(user );
      out.write("\"><label style=\"font-size:12px\">Sign Out</label></a></li>\r\n");
      out.write("    <li><a href=\"#\"><span class=\"\"></span></a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<div class=\"overlay on-overlay\"></div>\r\n");
      out.write("    \r\n");
      out.write("        <script src=\"js/index.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"position: absolute; top: 140px; left: 150px;\">\r\n");
      out.write("\t\t<iframe frameborder=\"0\" scrolling=\"auto\" name=\"afrm\" height=\"470\"\r\n");
      out.write("\t\t\twidth=\"900\"></iframe>\r\n");
      out.write("\t</div>\r\n");
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
