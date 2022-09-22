package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddStock_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div align=\"center\">\n");
      out.write("<table width=\"600\" border=\"0\" cellspacing=\"1\" cellpadding=\"4\">\n");
      out.write("    <tr>\n");
      out.write("                    <td><a href=\"sales.php\">Sales</a></td>\n");
      out.write("                    <td><a href=\"StockingItems.php\">Sales Register</a></td>\n");
      out.write("                    <td><a href=\"UserRegistration.php\">Add User</a></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        <td colspan=\"8\"><hr /></td>\n");
      out.write("       \n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("        <form name=\"StockForm\" method=\"post\" action=\"StockingItems.php\" onsubmit=\"return checkEmail(this);\" >\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <table width=\"600\" border=\"0\" cellspacing=\"1\" cellpadding=\"4\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\"><h2>STOCK REGISTRATION</h2></th>\n");
      out.write("                    </tr>\n");
      out.write("\t\t    <tr>\n");
      out.write("                        <td>Select Item:</td>\n");
      out.write("                        <td width=\"400\">\n");
      out.write("                            <select  class=\"textbox\" NAME=\"Item\" SIZE=1>\n");
      out.write("                                <option selected=\"selected\" value=\"\">--Select a Item--</option> \n");
      out.write("                                <option><font color=\"#000000\">MTN</font></option>\n");
      out.write("                                <option>Airtel</option>\n");
      out.write("\t\t\t\t<option>Celz</option>\n");
      out.write("\t\t\t\t<option>Sim Registration</option>\n");
      out.write("\t\t\t\t<option>Peter</option>\n");
      out.write("                                <option>Switch</option>\n");
      out.write("                                <option>Consulate</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Item Price:</td>\n");
      out.write("                        <td width=\"400\">\n");
      out.write("                            <select  class=\"textbox\" NAME=\"Price\" SIZE=1>\n");
      out.write("                                <option selected=\"selected\" value=\"\">--Select a Item--</option> \n");
      out.write("                                <option><font color=\"#000000\">0.50</font></option>\n");
      out.write("          \t\t\t<option>1</option>\n");
      out.write("                                <option>2</option>\n");
      out.write("\t\t\t\t<option>3</option>\n");
      out.write("\t\t\t\t<option>4</option>\n");
      out.write("\t\t\t\t<option>5</option>\n");
      out.write("                                <option>10</option>\n");
      out.write("\t\t\t\t<option>20</option>\n");
      out.write("\t\t\t\t<option>50</option>\n");
      out.write("\t\t\t\t<option>100</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Item Quantity:</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input  class=\"textbox\" type=\"text\" name=\"ItemQuantity\" value=\"\" />\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>&nbsp;</td>\n");
      out.write("                        <td>\n");
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
