<%-- 
    Document   : view
    Created on : 28 Feb, 2018, 4:59:01 PM
    Author     : student
--%>
<%@page import="p.DBConn" %>
<%@page import="java.sql.ResultSet" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EXPIRING PRODUCTS</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="newcss.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <h1>PRODUCTS</h1>
        <div class="table-responsive">
            <table class="table" border="1">
            <thead>
                <tr>
                <th>ID</th><th>Product</th><th>Company</th><th>Category</th><th>Sub-category</th><th>Price</th><th>Extra</th><th>#</th>
                </tr>
            </thead>
            <%
                DBConn d=new DBConn();
                ResultSet rs=d.viewexp();
                while(rs.next()){
            %>
            <tbody>
            <tr>
                <td><%=rs.getInt(9)%></td><td><%=rs.getString(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td><td><%=rs.getInt(5)%></td><td><%=rs.getString(6)%></td><td><%=rs.getInt(7)%></td>
            </tr>
            </tbody>
        </table>
        <%}%>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  
    </body>
</html>
