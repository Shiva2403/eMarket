package p;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import p.DBConn;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author student
 */
@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {
    
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
            String email=request.getParameter("e1");
            String pass=request.getParameter("p1");
            int ci=0;
            if(email.equals("admin@sem.com")&&pass.equals("pass")){
                HttpSession a=request.getSession();
                RequestDispatcher ard=request.getRequestDispatcher("adminhome.jsp");
                a.setAttribute("uname", "Admin");
                ard.forward(request, response);
            }
            else{
                User u=new User();
                u.setEmail(email);
                u.setPass(pass);
                DBConn d=new DBConn();
                ResultSet rs=d.login(u);
                while(rs.next()){
                    if(email.equals(rs.getString(3))&&pass.equals(rs.getString(4))){
                        ResultSet rs1=d.getC(rs.getInt(1));
                        while(rs1.next()){
                            ci=rs1.getInt(1);
                        }
                        HttpSession s=request.getSession();
                        RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp?ci="+ci);
                        s.setAttribute("uname", rs.getString(2));
                        rd.forward(request, response);
                    }
                }
//                if(rs==null){
//                    out.println("");
//                }
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
