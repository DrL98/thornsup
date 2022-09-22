<%-- 
    Document   : index
    Created on : Nov 26, 2014, 11:08:22 PM
    Author     : amos Mutale
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sales Page</title>
    </head>
    <body>
<div align="center">
<table width="600" border="0" cellspacing="1" cellpadding="4">
    <tr>
        <td><a href="index.jsp">Home</a></td>
        <td><a href="StockEntry.jsp">Stock Entry Page</a></td>
        <td><a href="StockLevels.jsp">Stock Levels</a></td>
        <td><a href="index.jsp">Logout</a></td>
    </tr>
    
    <tr>
        <td colspan="8"><hr /></td>
       
    </tr>
</table>
</div>
        <form name="SalesForm" method="post" action="sales.php" onsubmit="return checkEmail(this);" >
            <div align="center">
                <table width="600" border="0" cellspacing="1" cellpadding="4">
                    <tr>
                        <th colspan="2"><h2>SALES</h2></th>
                    </tr>
		    <tr>
                        <td>Item Name:</td>
                        <td width="400">
                            <select  class="textbox" NAME="itemname" SIZE=1>
                                <option selected="selected" value="">--Select a Item--</option> 
                                <option><font color="#000000"> MTN </font></option>
                                <option> Airtel </option>
				<option> Celz </option>
				<option> Sim Registration </option>
				<option> Peter </option>
                                <option> Switch </option>
                                <option> Consulate </option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Amount:</td>
                        <td>
                            <input  class="textbox" type="text" name="amount" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>Value:</td>
                        <td>
                            <input  class="textbox" type="text" name="value" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>Quantity:</td>
                        <td>
                            <input  class="textbox" type="text" name="quantity" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>
                            <input value="Submit" type="submit" class="button_example">&nbsp;&nbsp; 
                            <input value="Reset" type="reset" class="button_example">
                        </td>
                    </tr>    
                </table>
            </div>
    </form>
  </body>  
</html>
