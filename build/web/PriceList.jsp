<%-- 
    Document   : PriceList
    Created on : Mar 12, 2015, 4:25:18 PM
    Author     : amos Mutale
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.sql.*" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
            

<%! String DateofStockF;%>
<% DateofStockF = request.getParameter("DateofStockStart"); %>

<html>
<head><title> Price List </title>
    <style> 
    .textbox{ 
    width: 275px; 
    border:solid 1px #ccc; 
    height: 26px; 
    background: #5E768D; 
    background: -moz-linear-gradient(top, #546A7F 0%, #5E768D 20%); 
    background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#546A7F), color-stop(20%,#5E768D)); 
    border-radius: 5px;
    -moz-border-radius: 5px;
    -webkit-border-radius: 5px;
    -moz-box-shadow: 0px 1px 0px #f2f2f2;
    -webkit-box-shadow: 0px 1px 0px #F2F2F2;
    font-family: sans-serif;
    font-size: 16px;
    color: #F2F2F2; 
    text-transform: uppercase; 
    text-shadow: 0px -1px 0px #334F71; 
    } 
    .textbox:focus { 
    background: #728EAA; 
    background: -moz-linear-gradient(top, #668099 0%, #728EAA 20%); 
    background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#668099), color-stop(20%,#728EAA)); 
        outline:0; 
    } 
    </style> 
        <style type="text/css">

    .button_example{
    border:1px solid #7d99ca; -webkit-border-radius: 3px; -moz-border-radius: 3px;border-radius: 3px;font-size:12px;font-family:arial, helvetica, sans-serif; padding: 10px 10px 10px 10px; text-decoration:none; display:inline-block;text-shadow: -1px -1px 0 rgba(0,0,0,0.3);font-weight:bold; color: #FFFFFF;
    background-color: #a5b8da; background-image: -webkit-gradient(linear, left top, left bottom, from(#a5b8da), to(#7089b3));
    background-image: -webkit-linear-gradient(top, #a5b8da, #7089b3);
    background-image: -moz-linear-gradient(top, #a5b8da, #7089b3);
    background-image: -ms-linear-gradient(top, #a5b8da, #7089b3);
    background-image: -o-linear-gradient(top, #a5b8da, #7089b3);
    background-image: linear-gradient(to bottom, #a5b8da, #7089b3);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#a5b8da, endColorstr=#7089b3);
    }

    .button_example:hover{
    border:1px solid #5d7fbc;
    background-color: #819bcb; background-image: -webkit-gradient(linear, left top, left bottom, from(#819bcb), to(#536f9d));
    background-image: -webkit-linear-gradient(top, #819bcb, #536f9d);
    background-image: -moz-linear-gradient(top, #819bcb, #536f9d);
    background-image: -ms-linear-gradient(top, #819bcb, #536f9d);
    background-image: -o-linear-gradient(top, #819bcb, #536f9d);
    background-image: linear-gradient(to bottom, #819bcb, #536f9d);filter:progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr=#819bcb, endColorstr=#536f9d);
    }
    </style>
        <!-- CSS goes in the document HEAD or added to your external stylesheet -->
    <style type="text/css">
    table.hovertable {
            font-family: verdana,arial,sans-serif;
            font-size:11px;
            color:#333333;
            border-width: 1px;
            border-color: #999999;
            border-collapse: collapse;
    }
    table.hovertable th {
            background-color:#c3dde0;
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #a9c6c9;
    }
    table.hovertable tr {
            background-color:#d4e3e5;
    }
    table.hovertable td {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #a9c6c9;
    }
    <%-- Source of code: http://www.textfixer.com/tutorials/css-tables.php#css-table01 --%>
    </style>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
    <script src="//code.jquery.com/jquery-1.9.1.js"></script>
    <script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script>
    $(function() {
    $( "#datepicker" ).datepicker();
    });
    <%--Source of code: http://jqueryui.com/datepicker/ --%>  
    </script>
</head>
<body>
    <div align="center">
<table width="600" border="0" cellspacing="1" cellpadding="4">
    <tr>
        <td><a href="Sales.jsp">Home</a></td>
        <td><a href="StockEntry.jsp">Stock Entry Page</a></td>
        <td><a href="StockLevels.jsp">Stock Levels</a></td>
        <td><a href="PriceManagement.jsp">Price Management</a></td>
        <td><a href="Changeprice.jsp">Change Price</a></td>
        <td><a href="PriceList.jsp">Price List</a></td>
        <td><a href="Sales.jsp">Logout</a></td>
    </tr>
    <tr>
        <td colspan="8"><hr /></td>
       
    </tr>
</table>
</div>
    
<form action="PriceList.jsp" method="post" >
     
        <div ALIGN="center">
          <table 
                <tr>
                    <th colspan="2"><h2>PRICE LIST</h2></th>
                </tr> 
         </table>
        </div>    
</form>   

    
</tr>  </table>

<table class="hovertable" border="1" bordercolor="#0000FF" style="" width="700" cellpadding="8" cellspacing="0" ALIGN="center" width="700">
<%
   try
    {//open try
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//loading the Sun's JDBC ODBC Driver
               Connection databaseConnection = DriverManager.getConnection("jdbc:odbc:thornsup","admin","");
               Statement state=databaseConnection.createStatement();

               //
               {String writeString ="SELECT * FROM Prices " ;
                    ResultSet Result=state.executeQuery(writeString);//     
                    //Result.next(); 
     %>                                 
                    
                    
              


<%
     
     
        ResultSetMetaData metaDatat = Result.getMetaData();
        int numberOfColumnst = metaDatat.getColumnCount();
        %>
        
        <tr>
        <td><%=metaDatat.getColumnName(1) %> </td>
        <td><%=metaDatat.getColumnName(2) %> </td>

        
          
        <%
        while(Result.next())
            //testvariable=Result.getString(1);
            //Result.getString(6);
        {%>
              
        <tr>         
            <td> <%=Result.getString(1)%> </td>
            <td> <%=Result.getString(2)%> </td>

        </tr>
        <% 
           }//close thread
        %> 
        <%}
        
        //state.close();//closing the statement
        }
        catch(Exception e)
        {
        //out.println(passwd);
        //out.println("Could not connect to db");
        } %>
	

</table>
</body>

</html>

