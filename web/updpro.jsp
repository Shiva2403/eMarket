<%-- 
    Document   : updpro
    Created on : 28 Feb, 2018, 4:17:30 PM
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
        <title>Update</title>
    </head>
    <body style="background-image:url('images/bgup.jpg');background-size: 135%">
        <%
            String id=request.getParameter("i3");
            int i=Integer.parseInt(id);
            DBConn d=new DBConn();
            ResultSet rs=d.seapro(i);
            while(rs.next()){
        %>
        <h1>Product Details</h1>
        <div class="container-fluid"><div class="row"></div><h1> </h1></div>
        <div class="container">
            <div class="col-md-4">
                <img src="images/<%=rs.getString(8)%>" class="img-responsive" style="width: auto">    
            </div>
            <div class="col-md-8">
                <form action="updpro?iu=<%=rs.getInt(9)%>" method="post">
                    <div class="form-group">
                        <label>Product Name:</label>
                        <input type="text" class="form-control" name="pnu" value="<%=rs.getString(1)%>">
                    </div>
                    <div class="form-group">
                        <label>Company Name:</label>
                        <input type="text" class="form-control" name="cnu" value="<%=rs.getString(2)%>">
                    </div>
                    <div class="form-group">
                        <label>Category:</label>
                        <input type="text" class="form-control" name="cu" value="<%=rs.getString(3)%>">
                    </div>
                    <div class="form-group">
                        <label>Sub-category:</label>
                        <input type="text" class="form-control" name="scu" value="<%=rs.getString(4)%>">
                    </div>
                    <div class="form-group">
                        <label>Price:</label>
                        <input type="text" class="form-control" name="pu" value="<%=rs.getInt(5)%>">
                    </div>
                    <div class="form-group">
                        <label>Extra:</label>
                        <input type="text" class="form-control" name="eu" value="<%=rs.getString(6)%>">
                    </div>
                    <div class="form-group">
                        <label>No of Items:</label>
                        <input type="text" class="form-control" name="nu" value="<%=rs.getInt(7)%>">
                    </div>
                    <button type="submit" class="btn btn-default">Update</button><br>
                </form>
            </div>
        </div>
        <%}%>
    </body>
</html>
