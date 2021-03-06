<%-- 
    Document   : newjsp
    Created on : 12 Jan, 2018, 1:56:26 PM
    Author     : student
--%>
<%@page import="p.DBConn" %>
<%@page import="p.Product" %>
<jsp:useBean class="p.DBConn" id="d"></jsp:useBean>
<jsp:useBean class="p.Product" id="pr"></jsp:useBean>
<%@page import="java.sql.ResultSet" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>SHIVA e-MARKET</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="newcss.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>
    <body style="background-image:url('images/bgp.jpg');background-size: 125%">
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="newjsp.jsp">SHIVA e-MARKET</a>
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNav">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <div class="collapse navbar-collapse" id="myNav">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="newjsp.jsp">HOME</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a data-toggle="modal" data-target="#myMod1"><span class="glyphicon glyphicon-user"></span>LOGIN</a></li>
                        <li><a data-toggle="modal" data-target="#myMod2"><span class="glyphicon glyphicon-user"></span>SIGNUP</a></li>                        
                    </ul>
                </div>
            </div>
        </nav>     
        <div id="myMod1" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="login" method="post">
                        <div class="modal-header">
                            <button class="close" type="button" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">LOG IN</h4>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <label for="email">Email:</label><br>
                                <input type="email" placeholder="Enter email" class="form-control" id="email" name="e1"><br>
                                <label for="pwd">Password:</label><br>
                                <input type="password" placeholder="Enter password" class="form-control" id="pwd" name="p1"><br>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="submit" class="btn">LOGIN</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div id="myMod2" class="modal fade" role="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="signup" method="post">
                        <div class="modal-header">
                            <button class="close" type="button" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">SIGN UP</h4>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <label for="name">Name:</label><br>
                                <input type="text" placeholder="Enter name" class="form-control" id="name" name="n2"><br>
                                <label for="email">Email:</label><br>
                                <input type="email" placeholder="Enter email" class="form-control" id="email" name="e2"><br>
                                <label for="pwd">Password:</label><br>
                                <input type="password" placeholder="Enter password" class="form-control" id="pwd" name="p2"><br>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="submit" class="btn">SIGNUP</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="jumbotron">
            <div class="container text-center">
                <h1>SHIVA e-MARKET</h1>
                <p>Online Shopping Center</p>
            </div>
        </div>  
        <div class="container">
            <div class="carousel slide" id="carous" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li class="active" data-target="#carous" data-slide-to="0"></li>
                    <li data-target="#carous" data-slide-to="1"></li>
                    <li data-target="#carous" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="item active">
                        <img src="images/a.jpg" style="width: 100%;">
                    </div>
                    <div class="item">
                        <img src="images/b.jpg" style="width: 100%;">
                    </div>
                    <div class="item">
                        <img src="images/c.jpg" style="width: 100%;">
                    </div>
                </div>
                <a class="left carousel-control" href="#carous" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left"></span>
                </a>
                <a class="right carousel-control" href="#carous" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right"></span>
                </a>            
            </div>
        </div>
        <div id="m">
            <h4>Mens</h4>
            <div class="container">
                <div class="row">
            <%
                String cat1="Mens";
                ResultSet rs1=d.viewm(cat1);
                while(rs1.next()){
            %>
                    <div class="col-sm-3">
                        <div class="panel panel-primary">
                            <div class="panel-heading"><%=rs1.getString(1)%><br><%=rs1.getString(2)%></div>
                            <div class="panel-body"><img src="images/<%=rs1.getString(8)%>" class="img-responsive" style="width: 100%"></div>
                            <div class="panel-footer">
                                Rs.<%=rs1.getInt(5)%>
                            </div>
                        </div>
                    </div>
            <%}%>
                </div>
            </div>   
        </div>
        <div id="l">
            <h4>Ladies</h4>
            <div class="container">
                <div class="row">
            <%
                String cat2="Ladies";
                ResultSet rs2=d.viewm(cat2);
                while(rs2.next()){
            %>
                    <div class="col-sm-3">
                        <div class="panel panel-primary">
                            <div class="panel-heading"><%=rs2.getString(1)%><br><%=rs2.getString(2)%></div>
                            <div class="panel-body"><img src="images/<%=rs2.getString(8)%>" class="img-responsive" style="width: 100%"></div>
                            <div class="panel-footer">
                                Rs.<%=rs2.getInt(5)%>
                            </div>
                        </div>
                    </div>
            <%}%>
                </div>
            </div>
        </div>
        <div id="k">
            <h4>Kids</h4>
            <div class="container">
                <div class="row">
            <%
                String cat3="Kids";
                ResultSet rs3=d.viewm(cat3);
                while(rs3.next()){
            %>        
                    <div class="col-sm-3">
                        <div class="panel panel-primary">
                            <div class="panel-heading"><%=rs3.getString(1)%><br><%=rs3.getString(2)%></div>
                            <div class="panel-body"><img src="images/<%=rs3.getString(8)%>" class="img-responsive" style="width: 100%"></div>
                            <div class="panel-footer">
                                Rs.<%=rs3.getInt(5)%>
                            </div>
                        </div>
                    </div>
                    <%}%>
                </div>
            </div>
        </div>
        <div id="e">
            <h4>Electronics</h4>
            <div class="container">
                <div class="row">
            <%
                String cat4="Electronics";
                ResultSet rs4=d.viewm(cat4);
                while(rs4.next()){
            %>   
                    <div class="col-sm-3">
                        <div class="panel panel-primary">
                            <div class="panel-heading"><%=rs4.getString(1)%><br><%=rs4.getString(2)%></div>
                            <div class="panel-body"><img src="images/<%=rs4.getString(8)%>" class="img-responsive" style="width: 100%"></div>
                            <div class="panel-footer">
                                Rs.<%=rs4.getInt(5)%>
                            </div>
                        </div>
                    </div>
            <%}%>
                </div>
            </div>
        </div>
        <div id="h">
            <h4>Household</h4>
            <div class="container">
                <div class="row">
            <%
                String cat5="Household";
                ResultSet rs5=d.viewm(cat5);
                while(rs5.next()){
            %> 
                    <div class="col-sm-3">
                        <div class="panel panel-primary">
                            <div class="panel-heading"><%=rs5.getString(1)%><br><%=rs5.getString(2)%></div>
                            <div class="panel-body"><img src="images/<%=rs5.getString(8)%>" class="img-responsive" style="width: 100%"></div>
                            <div class="panel-footer">
                                Rs.<%=rs5.getInt(5)%>
                            </div>
                        </div>
                    </div>
                 <%}%>
                </div>
            </div>
        </div>
        <div id="s">
            <h4>Sports</h4>
             <div class="container">
                <div class="row">
            <%
                String cat6="Sports";
                ResultSet rs6=d.viewm(cat6);
                while(rs6.next()){
            %>
                    <div class="col-sm-3">
                        <div class="panel panel-primary">
                            <div class="panel-heading"><%=rs6.getString(1)%><br><%=rs6.getString(2)%></div>
                            <div class="panel-body"><img src="images/<%=rs6.getString(8)%>" class="img-responsive" style="width: 100%"></div>
                            <div class="panel-footer">
                                Rs.<%=rs6.getInt(5)%>
                            </div>
                        </div>
                    </div>
                    <%}%>
                </div>
            </div>
        </div>
        <div id="d1" class="container-fluid">
            <div class="row">
                <div id="d11" class="col-lg-4">
                    <h4><b>FOLLOW US</b></h4>
                    <blockquote class="blockquote"><b>SHIVA e-MARKET</b></blockquote>
                </div>
                <div id="d12" class="col-lg-4">
                    <h4><b>MENU</b></h4>
                    <a href="newjsp.jsp">Home</a><br>
                    <a>About Us</a><br>
                    <a>Contact Us</a>
                </div>
                <div id="d13" class="col-lg-4">
                    <h4><b>ABOUT US</b></h4>
                    <p id="p1">SHIVA e-MARKET is an online market web-page created by SHIVA SUNDAR as a project at Quest Innovative Solutions Pvt. Ltd.</p><br>
                    <h5><b>Email:</b></h5>shivasundar18@gmail.com<br>
                    <h5><b>Website:</b></h5>www.shivaemarket.com<br>
                </div>
            </div>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
    </body>
</html>