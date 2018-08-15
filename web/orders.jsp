<%-- 
    Document   : orders
    Created on : 15 Mar, 2018, 2:32:08 PM
    Author     : student
--%>
<jsp:useBean class="p.DBConn" id="d"></jsp:useBean>
<jsp:useBean class="p.Product" id="pr"></jsp:useBean>
<%@page import="java.sql.ResultSet" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SHIVA e-MARKET</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="newcss.css" rel="stylesheet" type="text/css">
    </head>
    <body style="background-image:url('images/bgc.jpg');background-size: 120%">
        <%
            String cid=request.getParameter("ci");
            int c=Integer.parseInt(cid);
        %>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">SHIVA e-MARKET</a>
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNav">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>     
                <div class="collapse navbar-collapse" id="myNav">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="welcome.jsp?ci=<%=c%>">HOME</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a><span class="glyphicon glyphicon-user"></span>${uname}</a></li>
                        <li><a href="cart.jsp?ci=<%=c%>"><span class="glyphicon glyphicon-shopping-cart"></span>CART<span class="badge">
                            <%
                                int n=d.carno(c);
                            %>
                            <%=n%>
                            </span></a></li>
                        <li><a href="logout"><span class="glyphicon glyphicon-user"></span>LOGOUT</a></li>                        
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container-fluid"><div class="row"></div><h1> </h1></div>
        <h1>Previous Orders</h1>
        <div class="table-responsive">
        <table class="table" border="1">
            <thead>
            <tr>
                <th>ID</th><th>Product</th><th>Company</th><th>Category</th><th>Sub-category</th><th>Extra</th><th>Price</th><th>#</th>
            </tr>
            </thead>
            <%
                ResultSet rs=d.vieworders(c);
                while(rs.next()){
            %>
            <tbody>
            <tr>
                <td><%=rs.getInt(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td><td><%=rs.getString(5)%></td><td><%=rs.getString(6)%></td><td><%=rs.getInt(7)%></td><td><%=rs.getInt(8)%></td>
            </tr>
            </tbody>
            <%}%>
        </table>
        </div>
    </body>
</html>
