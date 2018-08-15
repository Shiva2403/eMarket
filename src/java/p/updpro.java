package p;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import p.DBConn;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author student
 */
public class updpro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String id=request.getParameter("iu");
            int i=Integer.parseInt(id);
            String pn=request.getParameter("pnu");
            String cn=request.getParameter("cnu");
            String c=request.getParameter("cu");
            String sc=request.getParameter("scu");
            String pr=request.getParameter("pu");
            int p=Integer.parseInt(pr);
            String e=request.getParameter("eu");
            String no=request.getParameter("nu");
            int n=Integer.parseInt(no);
            Product pro=new Product();
            pro.setId(i);
            pro.setP_name(pn);
            pro.setC_name(cn);
            pro.setCategory(c);
            pro.setSubcategory(sc);
            pro.setPrice(p);
            pro.setExtra(e);
            pro.setNo(n);
            DBConn d=new DBConn();
            int a=d.updpro(pro);
            if(a>0){
                response.sendRedirect("adminhome.jsp");
            }
            else{
                out.println("PRODUCT NOT UPDATED");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
