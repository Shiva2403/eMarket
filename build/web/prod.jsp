<%-- 
    Document   : prod
    Created on : 7 Mar, 2018, 4:37:23 PM
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
    <body style="background-image:url('images/bgp.jpg');background-size: 125%">
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
        <%
            String id=request.getParameter("ip");
            int i=Integer.parseInt(id);
            ResultSet rs=d.viewm(i);
            while(rs.next()){
        %>
        <div class="container-fluid"><div class="row"></div><h1> </h1></div>
        <div class="container">
            <div class="col-md-4">
                <img src="images/<%=rs.getString(8)%>" class="img-responsive" style="width: 100%">    
            </div>
            <div class="col-md-8">
                <h1>Product Name: <%=rs.getString(1)%></h1>
                <h2>Company Name: <%=rs.getString(2)%></h2>
                <h2>Details: <%=rs.getString(6)%></h2>
                <h2>Price: Rs.<%=rs.getInt(5)%></h2>
            </div>
        </div>
        <div class="container-fluid"><div class="row"></div><h1> </h1></div>
        <div class="container">
            <form action="addcart" method="post">
            #: <input type="text" placeholder="# of items" id="no" name="n" style="width: 30%"><br>
            <input type="hidden" value="<%=c%>" name="ci"><br>
            <input type="hidden" value="<%=rs.getInt(9)%>" name="pi">
            <button type="submit" class="btn btn-default">ADD TO CART</button> 
        </form>
        </div>
        <%}%>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  
    </body>
</html>
