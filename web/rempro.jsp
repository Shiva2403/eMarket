<%-- 
    Document   : rempro
    Created on : 1 Mar, 2018, 1:57:02 PM
    Author     : student
--%>
<%@page import="p.DBConn" %>
<%@page import="p.Product" %>
<%@page import="java.sql.ResultSet" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Product</title>
    </head>
    <body style="background-image:url('images/bgap.jpg');background-size: 135%">
        <h1>Product Details</h1>
        <%
            String id=request.getParameter("i2");
            int i=Integer.parseInt(id);
            DBConn d=new DBConn();
            ResultSet rs=d.seapro(i);
            while(rs.next()){
        %>
        <div class="container-fluid"><div class="row"></div><h1> </h1></div>
        <div class="container">
            <div class="col-md-4">
                <img src="images/<%=rs.getString(8)%>" class="img-responsive" style="width: auto">    
            </div>
            <div class="col-md-8">
                <form action="rempro?ir=<%= rs.getInt(9)%>" method="post">
                    <div class="form-group">
                        <label>Product Name:</label>
                        <input type="text" class="form-control" name="pnr" value="<%=rs.getString(1) %>">
                    </div>
                    <div class="form-group">
                        <label>Company Name:</label>
                        <input type="text" class="form-control" name="cnr" value="<%= rs.getString(2) %>">
                    </div>
                    <div class="form-group">
                        <label>Category:</label>
                        <input type="text" class="form-control" name="cr" value="<%= rs.getString(3)%>">
                    </div>
                    <div class="form-group">
                        <label>Sub-category:</label>
                        <input type="text" class="form-control" name="scr" value="<%= rs.getString(4)%>">
                    </div>
                    <div class="form-group">
                        <label>Price:</label>
                        <input type="text" class="form-control" name="pr" value="<%= rs.getInt(5)%>">
                    </div>
                    <div class="form-group">
                        <label>Extra:</label>
                        <input type="text" class="form-control" name="er" value="<%=rs.getString(6)%>">
                    </div>
                    <div class="form-group">
                        <label>No of Items:</label>
                        <input type="text" class="form-control" name="nr" value="<%= rs.getInt(7)%>">
                    </div>
                    <button type="submit" class="btn btn-default">Remove</button><br>
                </form>
            </div>
        </div>
        <%}%>
    </body>
</html>
