<%-- 
    Document   : StockEntry
    Created on : Nov 30, 2014, 11:33:37 AM
    Author     : amos Mutale
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page language="java"%>
<%@page language="java" import="java.sql.*"%>
<html>
    <head>
 <title>Stock Entry Page</title>
    <style> 
  .textbox{ 
width: 275px; 
border:solid 1px #ccc; 
height: 26px; 
background: #D6D6FF; 

font-family: sans-serif;
font-size: 16px;
color: #000000; 
text-transform: uppercase; 
text-shadow: 0px -1px 0px #334F71; 
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
    <script type="text/javascript" language="javascript">
</script>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stlye.css" media="screen,projection" title="(screen)" />
        
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
        <form action="stockentryServlet" method="post">
            <div align="center">
                <table width="600" border="0" cellspacing="1" cellpadding="4">
                    <tr>
                        <th colspan="2"><h2>STOCK ENTRY</h2></th>
                    </tr>
                    <tr>
                        <td>Stock ID:</td>
                        <td width="400">
                            <select  class="textbox" NAME="StockID" SIZE=1>
                                <option selected="selected" value="">--Select a Item--</option> 
                                <option><font color="#000000">mtn01</font></option>
                                <option> mtn02</option>
                                <option> mtn05</option>
                                <option> mtn10</option>
                                <option> mtn20</option>
                                <option> mtn50</option>
                                <option> mtn100</option>
                                <option> airtelz01</option>
                                <option> airtelz02</option>
                                <option> airtelz05</option>
                                <option> airtelz10</option>
                                <option> airtelz20</option>
                                <option> airtelz50</option>
                                <option> airtelz100</option>
                                <option> celz01</option>
                                <option> celz02</option>
                                <option> celz05</option>
                                <option> celz10</option>
                                <option> celz20</option>
                                <option> celz50</option>
                                <option> celz100</option>  
                            </select>
                        </td>
                    </tr>  
                    <tr>
                        <td>Stock Description:</td>
                        <td>
                            <input  class="textbox" type="text" name="StockDescription" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>Stock Quantity:</td>
                        <td>
                            <input  class="textbox" type="text" name="StockQuantity" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>Stock Date:</td>
                        <td>
                        <input class="textbox"type="text" id="datepicker" name="StockDate" value="" /><b/>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>&nbsp;</td>
                        <td>
                            <input type="hidden" name="command" value="stockentryServlet" />
                            <input value="Submit" type="submit" class="button_example">&nbsp;&nbsp; 
                            <input value="Reset" type="reset" class="button_example">
                        </td>
                    </tr>    
                </table>
            </div>
    </form>
  </body>  
</html>
