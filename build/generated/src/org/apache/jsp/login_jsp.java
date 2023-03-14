package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Log in</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-login\">\r\n");
      out.write("            <div class=\"center\">\r\n");
      out.write("                <div class=\"ear ear--left\"></div>\r\n");
      out.write("                <div class=\"ear ear--right\"></div>\r\n");
      out.write("                <div class=\"face\">\r\n");
      out.write("                    <div class=\"eyes\">\r\n");
      out.write("                        <div class=\"eye eye--left\">\r\n");
      out.write("                            <div class=\"glow\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"eye eye--right\">\r\n");
      out.write("                            <div class=\"glow\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"nose\">\r\n");
      out.write("                        <svg width=\"38.161\" height=\"22.03\">\r\n");
      out.write("                        <path\r\n");
      out.write("                            d=\"M2.017 10.987Q-.563 7.513.157 4.754C.877 1.994 2.976.135 6.164.093 16.4-.04 22.293-.022 32.048.093c3.501.042 5.48 2.081 6.02 4.661q.54 2.579-2.051 6.233-8.612 10.979-16.664 11.043-8.053.063-17.336-11.043z\"\r\n");
      out.write("                            fill=\"#243946\"></path>\r\n");
      out.write("                        </svg>\r\n");
      out.write("                        <div class=\"glow\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mouth\">\r\n");
      out.write("                        <svg class=\"smile\" viewBox=\"-2 -2 84 23\" width=\"84\" height=\"23\">\r\n");
      out.write("                        <path d=\"M0 0c3.76 9.279 9.69 18.98 26.712 19.238 17.022.258 10.72.258 28 0S75.959 9.182 79.987.161\"\r\n");
      out.write("                              fill=\"none\" stroke-width=\"3\" stroke-linecap=\"square\" stroke-miterlimit=\"3\"></path>\r\n");
      out.write("                        </svg>\r\n");
      out.write("                        <div class=\"mouth-hole\"></div>\r\n");
      out.write("                        <div class=\"tongue breath\">\r\n");
      out.write("                            <div class=\"tongue-top\"></div>\r\n");
      out.write("                            <div class=\"line\"></div>\r\n");
      out.write("                            <div class=\"median\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"hands\">\r\n");
      out.write("                    <div class=\"hand hand--left\">\r\n");
      out.write("                        <div class=\"finger\">\r\n");
      out.write("                            <div class=\"bone\"></div>\r\n");
      out.write("                            <div class=\"nail\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"finger\">\r\n");
      out.write("                            <div class=\"bone\"></div>\r\n");
      out.write("                            <div class=\"nail\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"finger\">\r\n");
      out.write("                            <div class=\"bone\"></div>\r\n");
      out.write("                            <div class=\"nail\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"hand hand--right\">\r\n");
      out.write("                        <div class=\"finger\">\r\n");
      out.write("                            <div class=\"bone\"></div>\r\n");
      out.write("                            <div class=\"nail\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"finger\">\r\n");
      out.write("                            <div class=\"bone\"></div>\r\n");
      out.write("                            <div class=\"nail\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"finger\">\r\n");
      out.write("                            <div class=\"bone\"></div>\r\n");
      out.write("                            <div class=\"nail\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form action=\"login\" method=\"post\" class=\"login\" >\r\n");
      out.write("                    <label class=\"khung-user\">\r\n");
      out.write("                        <div class=\"\"></div>\r\n");
      out.write("                        <input name=\"username\" class=\"username\" type=\"text\" autocomplete=\"on\" placeholder=\"User name\" />\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label class=\"khung-pass\">\r\n");
      out.write("                        <div class=\"\"></div>\r\n");
      out.write("                        <input name=\"pass\" class=\"password\" type=\"password\" autocomplete=\"off\" placeholder=\"Password\" />\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label>\r\n");
      out.write("                        <input type=\"submit\" value=\"Login\" class=\"login-button\">\r\n");
      out.write("                    </label>\r\n");
      out.write("                </form>\r\n");
      out.write("                \r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${thongbao}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                <div class=\"social-buttons\">\r\n");
      out.write("                    <h3>Don't have any account yet? <a href=\"register.jsp\">Sign up</a></h3>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <script src=\"js/login.js\"></script>\r\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("                    integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("            crossorigin=\"anonymous\"></script>\r\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\r\n");
      out.write("                    integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("            crossorigin=\"anonymous\"></script>\r\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\r\n");
      out.write("                    integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("            crossorigin=\"anonymous\"></script>\r\n");
      out.write("            <script src=\"https://kit.fontawesome.com/78025ca858.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
