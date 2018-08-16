<%-- 
    Document   : adminhome
    Created on : 25 Jan, 2018, 3:11:58 PM
    Author     : student
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
    </head>
    <body>
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
                    <ul class="nav navbar-nav navbar-right">
                        <li><a><span class="glyphicon glyphicon-user"></span>${uname}</a></li>
                        <li><a href="logout"><span class="glyphicon glyphicon-user"></span>LOGOUT</a></li>                        
                    </ul>
                </div>
            </div>
        </nav> 
        <div class="jumbotron">
            <div class="container text-center">
                <h1>SHIVA e-MARKET</h1>
                <p>Online Shopping Center</p>
            </div>
        </div>
        <div class="container">
            <div id="flip1"><button type="button" class="btn btn-lg btn-primary text-center" style="width: 500px">ADD PRODUCTS</button></div><br>
            <div id="slide1" style="display: none">
                <form action="addpro" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <label>Product Name:</label>
                        <input type="text" class="form-control" placeholder="Enter product name" name="pn1" style="width: 500px">
                    </div>
                    <div class="form-group">
                        <label>Company Name:</label>
                        <input type="text" class="form-control" placeholder="Enter company name" name="cn1" style="width: 500px">
                    </div>
                    <div class="form-group">
                        <label>Category:</label>
                        <input type="text" class="form-control" placeholder="Enter category" name="c1" style="width: 500px">
                    </div>
                    <div class="form-group">
                        <label>Sub-category:</label>
                        <input type="text" class="form-control" placeholder="Enter sub-category" name="sc1" style="width: 500px">
                    </div>
                    <div class="form-group">
                        <label>Price:</label>
                        <input type="text" class="form-control" placeholder="Enter price" name="p1" style="width: 500px">
                    </div>
                    <div class="form-group">
                        <label>Extra:</label>
                        <input type="text" class="form-control" placeholder="Enter other details" name="e1" style="width: 500px">
                    </div>
                    <div class="form-group">
                        <label>No of Items:</label>
                        <input type="text" class="form-control" placeholder="Enter no" name="n1" style="width: 500px">
                    </div>
                    <div class="form-group">
                        <label>Image:</label>
                        <input type="file" name="photo">
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button><br>
                </form>
                    
            </div>
            <div id="flip2"><button type="button" class="btn btn-lg btn-primary text-center" style="width: 500px">REMOVE PRODUCTS</button></div><br>
            <div id="slide2" style="display: none">
                <form action="rempro.jsp" method="post" name="fr">
                    <div class="form-group">
                        <label>Product ID:</label>
                        <input type="text" class="form-control" placeholder="Enter product id" name="i2" style="width: 500px">
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button><br>
                </form>
            </div>
            <div id="flip3"><button type="button" class="btn btn-lg btn-primary text-center" style="width: 500px">UPDATE PRODUCTS</button></div><br>
            <div id="slide3" style="display: none">
                <form action="updpro.jsp" method="post" name="fu">
                    <div class="form-group">
                        <label>Product ID:</label>
                        <input type="text" class="form-control" placeholder="Enter product id" name="i3" style="width: 500px">
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button><br>
                </form>
            </div>
            <a href="viewexp.jsp"><button type="button" class="btn btn-lg btn-primary text-center" style="width: 500px">VIEW EXPIRING PRODUCTS</button></a><br>
        </div>
        <script>
            $(document).ready(function(){
                $("#flip1").click(function(){
                    $("#slide1").slideToggle("slow");
                });
                $("#flip2").click(function(){
                    $("#slide2").slideToggle("slow");
                });
                $("#flip3").click(function(){
                    $("#slide3").slideToggle("slow");
                });
            });
        </script>
    </body>
</html>
 