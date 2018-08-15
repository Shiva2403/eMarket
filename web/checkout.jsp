<%-- 
    Document   : checkout
    Created on : 12 Mar, 2018, 4:44:50 PM
    Author     : student
--%>
<jsp:useBean class="p.DBConn" id="d"></jsp:useBean>
<jsp:useBean class="p.Product" id="pr"></jsp:useBean>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.util.HashMap" %>
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
            HttpSession ses=request.getSession(false);
            String cid=request.getParameter("ci");
            int c=Integer.parseInt(cid);
            HashMap<Integer,Integer> hm=(HashMap<Integer,Integer>)ses.getAttribute("pmap");
            int a=d.update(hm,c);
            ses.invalidate();
            if(a>0){
                response.sendRedirect("welcome.jsp?ci="+c);
            }
        %>
    </body>
</html>
