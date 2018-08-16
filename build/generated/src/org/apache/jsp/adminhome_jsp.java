package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a><span class=\"glyphicon glyphicon-user\"></span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                        <li><a href=\"logout\"><span class=\"glyphicon glyphicon-user\"></span>LOGOUT</a></li>                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav> \n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <h1>SHIVA e-MARKET</h1>\n");
      out.write("                <p>Online Shopping Center</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div id=\"flip1\"><button type=\"button\" class=\"btn btn-lg btn-primary text-center\" style=\"width: 1200px\">ADD PRODUCTS</button></div><br>\n");
      out.write("            <div id=\"slide1\" style=\"display: none\">\n");
      out.write("                <form action=\"addpro\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Product Name:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter product name\" name=\"pn1\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Company Name:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter company name\" name=\"cn1\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Category:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter category\" name=\"c1\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Sub-category:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter sub-category\" name=\"sc1\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Price:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter price\" name=\"p1\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Extra:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter other details\" name=\"e1\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>No of Items:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter no\" name=\"n1\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Image:</label>\n");
      out.write("                        <input type=\"file\" name=\"photo\">\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Submit</button><br>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"flip2\"><button type=\"button\" class=\"btn btn-lg btn-primary text-center\" style=\"width: 1200px\">REMOVE PRODUCTS</button></div><br>\n");
      out.write("            <div id=\"slide2\" style=\"display: none\">\n");
      out.write("                <form action=\"rempro\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Product Name:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter product name\" name=\"pn2\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Company Name:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter company name\" name=\"cn2\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Category:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter category\" name=\"c2\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Sub-category:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter sub-category\" name=\"sc2\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>No of Items:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter no\" name=\"n2\">\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Submit</button><br>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"flip3\"><button type=\"button\" class=\"btn btn-lg btn-primary text-center\" style=\"width: 1200px\">UPDATE PRODUCTS</button></div><br>\n");
      out.write("            <div id=\"slide3\" style=\"display: none\">\n");
      out.write("                <form action=\"seapro\" method=\"post\" name=\"fs\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Product ID:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter product id\" name=\"is\">\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\" onclick=\"search()\">Submit</button><br>\n");
      out.write("                </form>\n");
      out.write("                <form action=\"updpro\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\" id=\"pnd\">\n");
      out.write("                        <label>Product Name:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter product name\" name=\"pn3\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" id=\"cnd\">\n");
      out.write("                        <label>Company Name:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter company name\" name=\"cn3\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" id=\"cd\">\n");
      out.write("                        <label>Category:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter category\" name=\"c3\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" id=\"scd\">\n");
      out.write("                        <label>Sub-category:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter sub-category\" name=\"sc3\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" id=\"pd\">\n");
      out.write("                        <label>Price:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter price\" name=\"p3\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" id=\"ed\">\n");
      out.write("                        <label>Extra:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter other details\" name=\"e3\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\" id=\"nd\">\n");
      out.write("                        <label>No of Items:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter no\" name=\"n3\">\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Submit</button><br>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"flip4\"><button type=\"button\" class=\"btn btn-lg btn-primary text-center\" style=\"width: 1200px\">VIEW EXPIRING PRODUCTS</button></div><br>\n");
      out.write("            <div id=\"slide4\" style=\"display: none\">VIEW</div>\n");
      out.write("        </div>\n");
      out.write("        <script> \n");
      out.write("            var request;\n");
      out.write("            function search(){\n");
      out.write("                var name=document.fs.is.value;\n");
      out.write("                var url=\"seapro.java?name=\"+name;\n");
      out.write("                request=new XMLHttpRequest();\n");
      out.write("                request.onreadystatechange=getInfo();\n");
      out.write("                request.open(\"POST\",url,true);\n");
      out.write("                request.send();\n");
      out.write("            }\n");
      out.write("            function getInfo(){\n");
      out.write("                if(request.readyState===4){\n");
      out.write("                    var res=request.responseText;\n");
      out.write("                    document.getElementById(\"pnd\").innerHTML=res;\n");
      out.write("                    document.getElementById(\"cnd\").innerHTML=res;\n");
      out.write("                    document.getElementById(\"cd\").innerHTML=res;\n");
      out.write("                    document.getElementById(\"scd\").innerHTML=res;\n");
      out.write("                    document.getElementById(\"pd\").innerHTML=res;\n");
      out.write("                    document.getElementById(\"ed\").innerHTML=res;\n");
      out.write("                    document.getElementById(\"nd\").innerHTML=res;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(\"#flip1\").click(function(){\n");
      out.write("                    $(\"#slide1\").slideToggle(\"slow\");\n");
      out.write("                });\n");
      out.write("                $(\"#flip2\").click(function(){\n");
      out.write("                    $(\"#slide2\").slideToggle(\"slow\");\n");
      out.write("                });\n");
      out.write("                $(\"#flip3\").click(function(){\n");
      out.write("                    $(\"#slide3\").slideToggle(\"slow\");\n");
      out.write("                });\n");
      out.write("                $(\"#flip4\").click(function(){\n");
      out.write("                    $(\"#slide4\").slideToggle(\"slow\");\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" ");
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
