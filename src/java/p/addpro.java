package p;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import p.DBConn;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author student
 */
@MultipartConfig
public class addpro extends HttpServlet {

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
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String pn=request.getParameter("pn1");
            String cn=request.getParameter("cn1");
            String c=request.getParameter("c1");
            String sc=request.getParameter("sc1");
            String pr=request.getParameter("p1");
            int p=Integer.parseInt(pr);
            String e=request.getParameter("e1");
            String no=request.getParameter("n1");
            int n=Integer.parseInt(no);
            Product pro=new Product();
            pro.setP_name(pn);
            pro.setC_name(cn);
            pro.setCategory(c);
            pro.setSubcategory(sc);
            pro.setPrice(p);
            pro.setExtra(e);
            pro.setNo(n);
            
//            String sp = "/home/student/NetBeansProjects/Shiva_eMarket/build/web/images/";
//            File fileSaveDir = new File(sp);
//            if (!fileSaveDir.exists()) {
//                fileSaveDir.mkdir();
//            }
            Part part = request.getPart("photo");
            String fn = extractFileName(part);
//            String s=sp.concat(fn);
            DBConn d=new DBConn();
            int a=d.addpro(pro,fn);
            if(a>0){
                response.sendRedirect("adminhome.jsp");
            }
            else{
                out.println("PRODUCT NOT ADDED");
            }
        } catch (SQLException | NumberFormatException ex) {
            System.out.println(ex);
        }
    }
    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
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
