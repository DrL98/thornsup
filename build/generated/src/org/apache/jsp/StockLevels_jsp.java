package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class StockLevels_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String DateofStockF;
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("            \n");
      out.write('\n');
 DateofStockF = request.getParameter("DateofStockStart"); 
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head><title>Stock Level </title>\n");
      out.write("    <style> \n");
      out.write("    .textbox{ \n");
      out.write("    width: 275px; \n");
      out.write("    border:solid 1px #ccc; \n");
      out.write("    height: 26px; \n");
      out.write("    background: #5E768D; \n");
      out.write("    background: -moz-linear-gradient(top, #546A7F 0%, #5E768D 20%); \n");
      out.write("    background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#546A7F), color-stop(20%,#5E768D)); \n");
      out.write("    border-radius: 5px;\n");
      out.write("    -moz-border-radius: 5px;\n");
      out.write("    -webkit-border-radius: 5px;\n");
      out.write("    -moz-box-shadow: 0px 1px 0px #f2f2f2;\n");
      out.write("    -webkit-box-shadow: 0px 1px 0px #F2F2F2;\n");
      out.write("    font-family: sans-serif;\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: #F2F2F2; \n");
      out.write("    text-transform: uppercase; \n");
      out.write("    text-shadow: 0px -1px 0px #334F71; \n");
      out.write("    } \n");
      out.write("    .textbox:focus { \n");
      out.write("    background: #728EAA; \n");
      out.write("    background: -moz-linear-gradient(top, #668099 0%, #728EAA 20%); \n");
      out.write("    background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#668099), color-stop(20%,#728EAA)); \n");
      out.write("        outline:0; \n");
      out.write("    } \n");
      out.write("    </style> \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("    .button_example{\n");
      out.write("    border:1px solid #7d99ca; -webkit-border-radius: 3px; -moz-border-radius: 3px;border-radius: 3px;font-size:12px;font-family:arial, helvetica, sans-serif; padding: 10px 10px 10px 10px; text-decoration:none; display:inline-block;text-shadow: -1px -1px 0 rgba(0,0,0,0.3);font-weight:bold; color: #FFFFFF;\n");
      out.write("    background-color: #a5b8da; background-image: -webkit-gradient(linear, left top, left bottom, from(#a5b8da), to(#7089b3));\n");
      out.write("    background-image: -webkit-linear-gradient(top, #a5b8da, #7089b3);\n");
      out.write("    background-image: -moz-linear-gradient(top, #a5b8da, #7089b3);\n");
      out.write("    background-image: -ms-linear-gradient(top, #a5b8da, #7089b3);\n");
      out.write("    background-image: -o-linear-gradient(top, #a5b8da, #7089b3);\n");
      out.write("    background-image: linear-gradient(to bottom, #a5b8da, #7089b3);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#a5b8da, endColorstr=#7089b3);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .button_example:hover{\n");
      out.write("    border:1px solid #5d7fbc;\n");
      out.write("    background-color: #819bcb; background-image: -webkit-gradient(linear, left top, left bottom, from(#819bcb), to(#536f9d));\n");
      out.write("    background-image: -webkit-linear-gradient(top, #819bcb, #536f9d);\n");
      out.write("    background-image: -moz-linear-gradient(top, #819bcb, #536f9d);\n");
      out.write("    background-image: -ms-linear-gradient(top, #819bcb, #536f9d);\n");
      out.write("    background-image: -o-linear-gradient(top, #819bcb, #536f9d);\n");
      out.write("    background-image: linear-gradient(to bottom, #819bcb, #536f9d);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#819bcb, endColorstr=#536f9d);\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("        <!-- CSS goes in the document HEAD or added to your external stylesheet -->\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("    table.hovertable {\n");
      out.write("            font-family: verdana,arial,sans-serif;\n");
      out.write("            font-size:11px;\n");
      out.write("            color:#333333;\n");
      out.write("            border-width: 1px;\n");
      out.write("            border-color: #999999;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("    }\n");
      out.write("    table.hovertable th {\n");
      out.write("            background-color:#c3dde0;\n");
      out.write("            border-width: 1px;\n");
      out.write("            padding: 8px;\n");
      out.write("            border-style: solid;\n");
      out.write("            border-color: #a9c6c9;\n");
      out.write("    }\n");
      out.write("    table.hovertable tr {\n");
      out.write("            background-color:#d4e3e5;\n");
      out.write("    }\n");
      out.write("    table.hovertable td {\n");
      out.write("            border-width: 1px;\n");
      out.write("            padding: 8px;\n");
      out.write("            border-style: solid;\n");
      out.write("            border-color: #a9c6c9;\n");
      out.write("    }\n");
      out.write("    ");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("    <script src=\"//code.jquery.com/jquery-1.9.1.js\"></script>\n");
      out.write("    <script src=\"//code.jquery.com/ui/1.10.4/jquery-ui.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("    <script>\n");
      out.write("    $(function() {\n");
      out.write("    $( \"#datepicker\" ).datepicker();\n");
      out.write("    });\n");
      out.write("    ");
      out.write("  \n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div align=\"center\">\n");
      out.write("<table width=\"600\" border=\"0\" cellspacing=\"1\" cellpadding=\"4\">\n");
      out.write("    <tr>\n");
      out.write("        <td><a href=\"Sales.jsp\">Home</a></td>\n");
      out.write("        <td><a href=\"StockEntry.jsp\">Stock Entry Page</a></td>\n");
      out.write("        <td><a href=\"StockLevels.jsp\">Stock Levels</a></td>\n");
      out.write("        <td><a href=\"PriceManagement.jsp\">Price Management</a></td>\n");
      out.write("        <td><a href=\"Changeprice.jsp\">Change Price</a></td>\n");
      out.write("        <td><a href=\"PriceList.jsp\">Price List</a></td>\n");
      out.write("        <td><a href=\"Sales.jsp\">Logout</a></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td colspan=\"8\"><hr /></td>\n");
      out.write("       \n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("<form action=\"StockLevels.jsp\" method=\"post\" >\n");
      out.write("     \n");
      out.write("        <div ALIGN=\"center\">\n");
      out.write("          <table \n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"2\"><h2>STOCK LEVELS</h2></th>\n");
      out.write("                </tr> \n");
      out.write("         </table>\n");
      out.write("        </div>    \n");
      out.write("</form>   \n");
      out.write("\n");
      out.write("    \n");
      out.write("</tr>  </table>\n");
      out.write("\n");
      out.write("<table class=\"hovertable\" border=\"1\" bordercolor=\"#0000FF\" style=\"\" width=\"700\" cellpadding=\"8\" cellspacing=\"0\" ALIGN=\"center\" width=\"700\">\n");

   try
    {//open try
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//loading the Sun's JDBC ODBC Driver
               Connection databaseConnection = DriverManager.getConnection("jdbc:odbc:thornsup","admin","");
               Statement state=databaseConnection.createStatement();

               //
               {String writeString ="SELECT * FROM StockLevels " ;
                    ResultSet Result=state.executeQuery(writeString);//     
                    //Result.next(); 
     
      out.write("                                 \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("              \n");
      out.write("\n");
      out.write("\n");

     
     
        ResultSetMetaData metaDatat = Result.getMetaData();
        int numberOfColumnst = metaDatat.getColumnCount();
        
      out.write("\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("        <td>");
      out.print(metaDatat.getColumnName(1) );
      out.write(" </td>\n");
      out.write("        <td>");
      out.print(metaDatat.getColumnName(2) );
      out.write(" </td>\n");
      out.write("        <td>");
      out.print(metaDatat.getColumnName(3) );
      out.write(" </td>\n");
      out.write("        <td>");
      out.print(metaDatat.getColumnName(4) );
      out.write(" </td>\n");
      out.write("        <td>");
      out.print(metaDatat.getColumnName(5) );
      out.write(" </td>\n");
      out.write("        \n");
      out.write("          \n");
      out.write("        ");

        while(Result.next())
            //testvariable=Result.getString(1);
            //Result.getString(6);
        {
      out.write("\n");
      out.write("              \n");
      out.write("        <tr>         \n");
      out.write("            <td> ");
      out.print(Result.getString(1));
      out.write(" </td>\n");
      out.write("            <td> ");
      out.print(Result.getString(2));
      out.write(" </td>\n");
      out.write("            <td> ");
      out.print(Result.getString(3));
      out.write(" </td>   \n");
      out.write("            <td> ");
      out.print(Result.getString(4));
      out.write(" </td> \n");
      out.write("            <td> ");
      out.print(Result.getString(5));
      out.write(" </td> \n");
      out.write("        </tr>\n");
      out.write("        ");
 
           }//close thread
        
      out.write(" \n");
      out.write("        ");
}
        
        //state.close();//closing the statement
        }
        catch(Exception e)
        {
        //out.println(passwd);
        //out.println("Could not connect to db");
        } 
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
