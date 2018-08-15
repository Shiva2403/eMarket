<%-- 
    Document   : search
    Created on : 12 Mar, 2018, 4:32:57 PM
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
    <body>
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
                    <form action="search.jsp?ci=<%=c%>" class="navbar-form navbar-left" method="post">
                        <div class="form-group">
                            <input type="search" placeholder="Enter Product" name="pn" class="form-control" style="width: 400px">
                        </div>
                        <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span>SEARCH</button>
                    </form>
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
        <%
            String sn=request.getParameter("pn");
            ResultSet rs=d.search(sn);
            while(rs.next()){
        %>
        <div class="col-sm-3">
            <div class="panel panel-primary">
                <div class="panel-heading"><%=rs.getString(1)%><br><%=rs.getString(2)%></div>
                <div class="panel-body"><img src="images/<%=rs.getString(8)%>" class="img-responsive" style="width: 100%"></div>
                <div class="panel-footer">
                    Rs.<%=rs.getInt(5)%>
                    <a href="prod.jsp?ci=<%=c%>&ip=<%=rs.getInt(9)%>"><button type="button" class="btn btn-default">BUY</button></a>
                </div>
            </div>
        </div>
        <%}%>
    </body>
</html>
