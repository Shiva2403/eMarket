package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import p.DBConn;
import p.Product;
import java.sql.ResultSet;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      p.DBConn d = null;
      synchronized (_jspx_page_context) {
        d = (p.DBConn) _jspx_page_context.getAttribute("d", PageContext.PAGE_SCOPE);
        if (d == null){
          d = new p.DBConn();
          _jspx_page_context.setAttribute("d", d, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      p.Product pr = null;
      synchronized (_jspx_page_context) {
        pr = (p.Product) _jspx_page_context.getAttribute("pr", PageContext.PAGE_SCOPE);
        if (pr == null){
          pr = new p.Product();
          _jspx_page_context.setAttribute("pr", pr, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>SHIVA e-MARKET</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"newcss.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

                            String cid=request.getParameter("ci");
                            int c=Integer.parseInt(cid);
        
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">SHIVA e-MARKET</a>\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNav\">\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"myNav\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">HOME</a></li>\n");
      out.write("                        <li><a href=\"#collap\" data-toggle=\"collapse\">PRODUCTS</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <form action=\"search.jsp?ci=");
      out.print(c);
      out.write("\" class=\"navbar-form navbar-left\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"search\" placeholder=\"Enter Product\" name=\"pn\" class=\"form-control\" style=\"width: 400px\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-search\"></span>SEARCH</button>\n");
      out.write("                    </form>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a><span class=\"glyphicon glyphicon-user\"></span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                        <li><a href=\"cart.jsp?ci=");
      out.print(c);
      out.write("\"><span class=\"glyphicon glyphicon-shopping-cart\"></span>CART<span class=\"badge\">\n");
      out.write("                                    ");

                                        int n=d.carno(c);
                                    
      out.write("\n");
      out.write("                                    ");
      out.print(n);
      out.write("\n");
      out.write("                                </span></a></li>\n");
      out.write("                        <li><a href=\"logout\"><span class=\"glyphicon glyphicon-user\"></span>LOGOUT</a></li>                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>     \n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <h1>SHIVA e-MARKET</h1>\n");
      out.write("                <p>Online Shopping Center</p>\n");
      out.write("            </div>\n");
      out.write("        </div>  \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"carousel slide\" id=\"carous\" data-ride=\"carousel\">\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li class=\"active\" data-target=\"#carous\" data-slide-to=\"0\"></li>\n");
      out.write("                    <li data-target=\"#carous\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#carous\" data-slide-to=\"2\"></li>\n");
      out.write("                </ol>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"item active\">\n");
      out.write("                        <img src=\"images/a.jpg\" style=\"width: 100%;\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"images/b.jpg\" style=\"width: 100%;\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"images/c.jpg\" style=\"width: 100%;\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"left carousel-control\" href=\"#carous\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"right carousel-control\" href=\"#carous\" data-slide=\"next\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("                </a>            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"m\">\n");
      out.write("            <h4>Mens</h4>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("            ");

                String cat1="Mens";
                ResultSet rs1=d.viewm(cat1);
                while(rs1.next()){
            
      out.write("\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\">");
      out.print(rs1.getString(1));
      out.write("<br>");
      out.print(rs1.getString(2));
      out.write("</div>\n");
      out.write("                            <div class=\"panel-body\"><img src=\"images/p.png\" class=\"img-responsive\" style=\"width: 100%\"></div>\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                Rs.");
      out.print(rs1.getInt(5));
      out.write("\n");
      out.write("                                <a href=\"prod.jsp?ci=");
      out.print(c);
      out.write("&ip=");
      out.print(rs1.getInt(9));
      out.write("\"><button type=\"button\" class=\"btn btn-default\">BUY</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>   \n");
      out.write("        </div>\n");
      out.write("        <div id=\"l\">\n");
      out.write("            <h4>Ladies</h4>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("            ");

                String cat2="Ladies";
                ResultSet rs2=d.viewm(cat2);
                while(rs2.next()){
            
      out.write("\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\">");
      out.print(rs2.getString(1));
      out.write("<br>");
      out.print(rs2.getString(2));
      out.write("</div>\n");
      out.write("                            <div class=\"panel-body\"><img src=\"images/p.png\" class=\"img-responsive\" style=\"width: 100%\"></div>\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                Rs.");
      out.print(rs2.getInt(5));
      out.write("\n");
      out.write("                                <a href=\"prod.jsp?ci=");
      out.print(c);
      out.write("&ip=");
      out.print(rs2.getInt(9));
      out.write("\"><button type=\"button\" class=\"btn btn-default\">BUY</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"k\">\n");
      out.write("            <h4>Kids</h4>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("            ");

                String cat3="Kids";
                ResultSet rs3=d.viewm(cat3);
                while(rs3.next()){
            
      out.write("        \n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\">");
      out.print(rs3.getString(1));
      out.write("<br>");
      out.print(rs3.getString(2));
      out.write("</div>\n");
      out.write("                            <div class=\"panel-body\"><img src=\"images/p.png\" class=\"img-responsive\" style=\"width: 100%\"></div>\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                Rs.");
      out.print(rs3.getInt(5));
      out.write("\n");
      out.write("                                <a href=\"prod.jsp?ci=");
      out.print(c);
      out.write("&ip=");
      out.print(rs3.getInt(9));
      out.write("\"><button type=\"button\" class=\"btn btn-default\">BUY</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"e\">\n");
      out.write("            <h4>Electronics</h4>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("            ");

                String cat4="Electronics";
                ResultSet rs4=d.viewm(cat4);
                while(rs4.next()){
            
      out.write("   \n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\">");
      out.print(rs4.getString(1));
      out.write("<br>");
      out.print(rs4.getString(2));
      out.write("</div>\n");
      out.write("                            <div class=\"panel-body\"><img src=\"images/p.png\" class=\"img-responsive\" style=\"width: 100%\"></div>\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                Rs.");
      out.print(rs4.getInt(5));
      out.write("\n");
      out.write("                                <a href=\"prod.jsp?ci=");
      out.print(c);
      out.write("&ip=");
      out.print(rs4.getInt(9));
      out.write("\"><button type=\"button\" class=\"btn btn-default\">BUY</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"h\">\n");
      out.write("            <h4>Household</h4>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("            ");

                String cat5="Household";
                ResultSet rs5=d.viewm(cat5);
                while(rs5.next()){
            
      out.write(" \n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\">");
      out.print(rs5.getString(1));
      out.write("<br>");
      out.print(rs5.getString(2));
      out.write("</div>\n");
      out.write("                            <div class=\"panel-body\"><img src=\"images/p.png\" class=\"img-responsive\" style=\"width: 100%\"></div>\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                Rs.");
      out.print(rs5.getInt(5));
      out.write("\n");
      out.write("                                <a href=\"prod.jsp?ci=");
      out.print(c);
      out.write("&ip=");
      out.print(rs5.getInt(9));
      out.write("\"><button type=\"button\" class=\"btn btn-default\">BUY</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                 ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"s\">\n");
      out.write("            <h4>Sports</h4>\n");
      out.write("             <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("            ");

                String cat6="Sports";
                ResultSet rs6=d.viewm(cat6);
                while(rs6.next()){
            
      out.write("\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"panel panel-primary\">\n");
      out.write("                            <div class=\"panel-heading\">");
      out.print(rs6.getString(1));
      out.write("<br>");
      out.print(rs6.getString(2));
      out.write("</div>\n");
      out.write("                            <div class=\"panel-body\"><img src=\"images/p.png\" class=\"img-responsive\" style=\"width: 100%\"></div>\n");
      out.write("                            <div class=\"panel-footer\">\n");
      out.write("                                Rs.");
      out.print(rs6.getInt(5));
      out.write("\n");
      out.write("                                <a href=\"prod.jsp?ci=");
      out.print(c);
      out.write("&ip=");
      out.print(rs6.getInt(9));
      out.write("\"><button type=\"button\" class=\"btn btn-default\">BUY</button></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>                        \n");
      out.write("        <div id=\"d1\" class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div id=\"d11\" class=\"col-lg-4\">\n");
      out.write("                    <h4><b>FOLLOW US</b></h4>\n");
      out.write("                    <blockquote class=\"blockquote\"><b>SHIVA e-MARKET</b></blockquote>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"d12\" class=\"col-lg-4\">\n");
      out.write("                    <h4><b>MENU</b></h4>\n");
      out.write("                    <a href=\"#\">Home</a><br>\n");
      out.write("                    <a>About Us</a><br>\n");
      out.write("                    <a>Contact Us</a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"d13\" class=\"col-lg-4\">\n");
      out.write("                    <h4><b>ABOUT US</b></h4>\n");
      out.write("                    <p id=\"p1\">SHIVA e-MARKET is an online market web-page created by SHIVA SUNDAR as a project at Quest Innovative Solutions Pvt. Ltd.</p><br>\n");
      out.write("                    <h5><b>Email:</b></h5>shivasundar18@gmail.com<br>\n");
      out.write("                    <h5><b>Website:</b></h5>www.shivaemarket.com<br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
