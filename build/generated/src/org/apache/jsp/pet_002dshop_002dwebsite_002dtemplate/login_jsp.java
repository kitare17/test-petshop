package org.apache.jsp.pet_002dshop_002dwebsite_002dtemplate;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Log in</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/login.style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"form-login\">\n");
      out.write("            <div class=\"center\">\n");
      out.write("                <div class=\"ear ear--left\"></div>\n");
      out.write("                <div class=\"ear ear--right\"></div>\n");
      out.write("                <div class=\"face\">\n");
      out.write("                    <div class=\"eyes\">\n");
      out.write("                        <div class=\"eye eye--left\">\n");
      out.write("                            <div class=\"glow\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"eye eye--right\">\n");
      out.write("                            <div class=\"glow\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"nose\">\n");
      out.write("                        <svg width=\"38.161\" height=\"22.03\">\n");
      out.write("                        <path\n");
      out.write("                            d=\"M2.017 10.987Q-.563 7.513.157 4.754C.877 1.994 2.976.135 6.164.093 16.4-.04 22.293-.022 32.048.093c3.501.042 5.48 2.081 6.02 4.661q.54 2.579-2.051 6.233-8.612 10.979-16.664 11.043-8.053.063-17.336-11.043z\"\n");
      out.write("                            fill=\"#243946\"></path>\n");
      out.write("                        </svg>\n");
      out.write("                        <div class=\"glow\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mouth\">\n");
      out.write("                        <svg class=\"smile\" viewBox=\"-2 -2 84 23\" width=\"84\" height=\"23\">\n");
      out.write("                        <path d=\"M0 0c3.76 9.279 9.69 18.98 26.712 19.238 17.022.258 10.72.258 28 0S75.959 9.182 79.987.161\"\n");
      out.write("                              fill=\"none\" stroke-width=\"3\" stroke-linecap=\"square\" stroke-miterlimit=\"3\"></path>\n");
      out.write("                        </svg>\n");
      out.write("                        <div class=\"mouth-hole\"></div>\n");
      out.write("                        <div class=\"tongue breath\">\n");
      out.write("                            <div class=\"tongue-top\"></div>\n");
      out.write("                            <div class=\"line\"></div>\n");
      out.write("                            <div class=\"median\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"hands\">\n");
      out.write("                    <div class=\"hand hand--left\">\n");
      out.write("                        <div class=\"finger\">\n");
      out.write("                            <div class=\"bone\"></div>\n");
      out.write("                            <div class=\"nail\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"finger\">\n");
      out.write("                            <div class=\"bone\"></div>\n");
      out.write("                            <div class=\"nail\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"finger\">\n");
      out.write("                            <div class=\"bone\"></div>\n");
      out.write("                            <div class=\"nail\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"hand hand--right\">\n");
      out.write("                        <div class=\"finger\">\n");
      out.write("                            <div class=\"bone\"></div>\n");
      out.write("                            <div class=\"nail\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"finger\">\n");
      out.write("                            <div class=\"bone\"></div>\n");
      out.write("                            <div class=\"nail\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"finger\">\n");
      out.write("                            <div class=\"bone\"></div>\n");
      out.write("                            <div class=\"nail\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <form action=\"\" method=\"\" class=\"login\">\n");
      out.write("                    <label class=\"khung-user\">\n");
      out.write("                        <div class=\"fa fa-phone\"></div>\n");
      out.write("                        <input name=\"username\" class=\"username\" type=\"text\" autocomplete=\"on\" placeholder=\"User name\" />\n");
      out.write("                    </label>\n");
      out.write("                    <label class=\"khung-pass\">\n");
      out.write("                        <div class=\"fa fa-commenting\"></div>\n");
      out.write("                        <input name=\"pass\" class=\"password\" type=\"password\" autocomplete=\"off\" placeholder=\"Password\" />\n");
      out.write("                    </label>\n");
      out.write("                    <label>\n");
      out.write("                        <input type=\"submit\" value=\"Login\" class=\"login-button\">\n");
      out.write("                    </label>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"social-buttons\">\n");
      out.write("                    <div class=\"social\">\n");
      out.write("                        <div class=\"fa fa-wechat\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"social\">\n");
      out.write("                        <div class=\"fa fa-weibo\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"social\">\n");
      out.write("                        <div class=\"fa fa-paw\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script src=\"js/login.js\"></script>\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\n");
      out.write("                    integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\n");
      out.write("                    integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\n");
      out.write("                    integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://kit.fontawesome.com/78025ca858.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
