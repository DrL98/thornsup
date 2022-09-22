package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class StockEntry_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write(" <title>Stock Entry Page</title>\n");
      out.write("    <style> \n");
      out.write("  .textbox{ \n");
      out.write("width: 275px; \n");
      out.write("border:solid 1px #ccc; \n");
      out.write("height: 26px; \n");
      out.write("background: #D6D6FF; \n");
      out.write("\n");
      out.write("font-family: sans-serif;\n");
      out.write("font-size: 16px;\n");
      out.write("color: #000000; \n");
      out.write("text-transform: uppercase; \n");
      out.write("text-shadow: 0px -1px 0px #334F71; \n");
      out.write("} \n");
      out.write(" \n");
      out.write("\n");
      out.write("</style> \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("\n");
      out.write(".button_example{\n");
      out.write("border:1px solid #7d99ca; -webkit-border-radius: 3px; -moz-border-radius: 3px;border-radius: 3px;font-size:12px;font-family:arial, helvetica, sans-serif; padding: 10px 10px 10px 10px; text-decoration:none; display:inline-block;text-shadow: -1px -1px 0 rgba(0,0,0,0.3);font-weight:bold; color: #FFFFFF;\n");
      out.write(" background-color: #a5b8da; background-image: -webkit-gradient(linear, left top, left bottom, from(#a5b8da), to(#7089b3));\n");
      out.write(" background-image: -webkit-linear-gradient(top, #a5b8da, #7089b3);\n");
      out.write(" background-image: -moz-linear-gradient(top, #a5b8da, #7089b3);\n");
      out.write(" background-image: -ms-linear-gradient(top, #a5b8da, #7089b3);\n");
      out.write(" background-image: -o-linear-gradient(top, #a5b8da, #7089b3);\n");
      out.write(" background-image: linear-gradient(to bottom, #a5b8da, #7089b3);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#a5b8da, endColorstr=#7089b3);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button_example:hover{\n");
      out.write(" border:1px solid #5d7fbc;\n");
      out.write(" background-color: #819bcb; background-image: -webkit-gradient(linear, left top, left bottom, from(#819bcb), to(#536f9d));\n");
      out.write(" background-image: -webkit-linear-gradient(top, #819bcb, #536f9d);\n");
      out.write(" background-image: -moz-linear-gradient(top, #819bcb, #536f9d);\n");
      out.write(" background-image: -ms-linear-gradient(top, #819bcb, #536f9d);\n");
      out.write(" background-image: -o-linear-gradient(top, #819bcb, #536f9d);\n");
      out.write(" background-image: linear-gradient(to bottom, #819bcb, #536f9d);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#819bcb, endColorstr=#536f9d);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    <!-- CSS goes in the document HEAD or added to your external stylesheet -->\n");
      out.write("<style type=\"text/css\">\n");
      out.write("table.hovertable {\n");
      out.write("\tfont-family: verdana,arial,sans-serif;\n");
      out.write("\tfont-size:11px;\n");
      out.write("\tcolor:#333333;\n");
      out.write("\tborder-width: 1px;\n");
      out.write("\tborder-color: #999999;\n");
      out.write("\tborder-collapse: collapse;\n");
      out.write("}\n");
      out.write("table.hovertable th {\n");
      out.write("\tbackground-color:#c3dde0;\n");
      out.write("\tborder-width: 1px;\n");
      out.write("\tpadding: 8px;\n");
      out.write("\tborder-style: solid;\n");
      out.write("\tborder-color: #a9c6c9;\n");
      out.write("}\n");
      out.write("table.hovertable tr {\n");
      out.write("\tbackground-color:#d4e3e5;\n");
      out.write("}\n");
      out.write("table.hovertable td {\n");
      out.write("\tborder-width: 1px;\n");
      out.write("\tpadding: 8px;\n");
      out.write("\tborder-style: solid;\n");
      out.write("\tborder-color: #a9c6c9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.9.1.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/ui/1.10.4/jquery-ui.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("<script>\n");
      out.write("$(function() {\n");
      out.write("$( \"#datepicker\" ).datepicker();\n");
      out.write("});\n");
      out.write("  \n");
      out.write("</script>\n");
      out.write("    <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("</script>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"stlye.css\" media=\"screen,projection\" title=\"(screen)\" />\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("  \n");
      out.write("<body>\n");
      out.write("<div align=\"center\">\n");
      out.write("<table width=\"600\" border=\"0\" cellspacing=\"1\" cellpadding=\"4\">\n");
      out.write("    <tr>\n");
      out.write("        <td><a href=\"index.jsp\">Home</a></td>\n");
      out.write("        <td><a href=\"StockEntry.jsp\">Stock Entry Page</a></td>\n");
      out.write("        <td><a href=\"StockLevels.jsp\">Stock Levels</a></td>\n");
      out.write("        <td><a href=\"index.jsp\">Logout</a></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td colspan=\"8\"><hr /></td>\n");
      out.write("       \n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("        <form action=\"stockentryServlet\" method=\"post\">\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <table width=\"600\" border=\"0\" cellspacing=\"1\" cellpadding=\"4\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\"><h2>STOCK ENTRY</h2></th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Stock ID:</td>\n");
      out.write("                        <td width=\"400\">\n");
      out.write("                            <select  class=\"textbox\" NAME=\"StockID\" SIZE=1>\n");
      out.write("                                <option selected=\"selected\" value=\"\">--Select a Depot--</option> \n");
      out.write("                                <option><font color=\"#000000\">mtn01</font></option>\n");
      out.write("                                <option> mtn02</option>\n");
      out.write("                                <option> mtn05</option>\n");
      out.write("                                <option> mtn10</option>\n");
      out.write("                                <option> mtn20</option>\n");
      out.write("                                <option> mtn50</option>\n");
      out.write("                                <option> mtn100</option>\n");
      out.write("                                <option> airtelz01</option>\n");
      out.write("                                <option> airtelz02</option>\n");
      out.write("                                <option> airtelz05</option>\n");
      out.write("                                <option> airtelz10</option>\n");
      out.write("                                <option> airtelz20</option>\n");
      out.write("                                <option> airtelz50</option>\n");
      out.write("                                <option> airtelz100</option>\n");
      out.write("                                <option> celz01</option>\n");
      out.write("                                <option> celz02</option>\n");
      out.write("                                <option> celz05</option>\n");
      out.write("                                <option> celz10</option>\n");
      out.write("                                <option> celz20</option>\n");
      out.write("                                <option> celz50</option>\n");
      out.write("                                <option> celz100</option>  \n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>  \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Stock Description:</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input  class=\"textbox\" type=\"text\" name=\"StockDescription\" value=\"\" />\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Stock Quantity:</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input  class=\"textbox\" type=\"text\" name=\"StockQuantity\" value=\"\" />\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Stock Date:</td>\n");
      out.write("                        <td>\n");
      out.write("                        <input class=\"textbox\"type=\"text\" id=\"datepicker\" name=\"StockDate\" value=\"\" /><b/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>&nbsp;</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"hidden\" name=\"command\" value=\"stockentryServlet\" />\n");
      out.write("                            <input value=\"Submit\" type=\"submit\" class=\"button_example\">&nbsp;&nbsp; \n");
      out.write("                            <input value=\"Reset\" type=\"reset\" class=\"button_example\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>    \n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("    </form>\n");
      out.write("  </body>  \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
