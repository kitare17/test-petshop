package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class information_005fuser_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<!--        <form action=\"\">\n");
      out.write("            <input type=\"text\" value=\"\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"password\" value=\"\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" >\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" >\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" >       \n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" >           \n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" >    \n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"change\">\n");
      out.write("        </form>\n");
      out.write("            -->\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"container-fluid pt-5\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"border-start border-5 border-primary ps-5 mb-5\" style=\"max-width: 600px;\">\n");
      out.write("            <h6 class=\"text-primary text-uppercase\">Contact Us</h6>\n");
      out.write("            <h1 class=\"display-5 text-uppercase mb-0\">Sign up</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row g-5\">\n");
      out.write("            <div class=\"col-lg-7\">\n");
      out.write("                <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                <form onsubmit=\"return validateForm()\" action=\"register\" method=\"post\">\n");
      out.write("                    <div class=\"row g-3\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"hidden\" name =\"username\" minlength=\"7\" maxlength=\"50\" required pattern=\"[a-zA-Z0-9]+\" class=\"form-control bg-light border-0 px-4\" placeholder=\"User Name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"height: 55px;\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"password\" minlength=\"7\" maxlength=\"50\" name =\"password\" id=\"password\" class=\"form-control bg-light border-0 px-4\" placeholder=\"Password\" style=\"height: 55px;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userPass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"password\" minlength=\"7\" maxlength=\"50\" name =\"confirmPassword\" id=\"confirm-password\" class=\"form-control bg-light border-0 px-4\" placeholder=\"Confirm Password\" style=\"height: 55px;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userPass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"text\" name =\"fullName\" class=\"form-control bg-light border-0 px-4\" placeholder=\"Full Name\" style=\"height: 55px;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userFullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"number\" name =\"age\" class=\"form-control bg-light border-0 px-4\" placeholder=\"Age\" min=\"10\" max=\"100\" style=\"height: 55px;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userAge}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"email\" name =\"email\" class=\"form-control bg-light border-0 px-4\" placeholder=\"Your Email\" style=\"height: 55px;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"tel\" maxlength=\"10\" minlength=\"10\" required pattern=\"[0-9]{10}\" name = \"phone\" class=\"form-control bg-light border-0 px-4\" placeholder=\"Phone number\" style=\"height: 55px;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userPhone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <input type=\"text\" name =\"address\" class=\"form-control bg-light border-0 px-4\" placeholder=\"Address\" style=\"height: 55px;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userAdress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <button class=\"btn btn-primary w-100 py-3\" type=\"submit\">Accept change</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-5\">\n");
      out.write("                <div class=\"bg-light mb-5 p-5\">\n");
      out.write("                    <div class=\"d-flex align-items-center mb-2\">\n");
      out.write("                        <i class=\"bi bi-geo-alt fs-1 text-primary me-3\"></i>\n");
      out.write("                        <div class=\"text-start\">\n");
      out.write("                            <h6 class=\"text-uppercase mb-1\">Our Office</h6>\n");
      out.write("                            <span>123 Street, Danang, VietNam</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex align-items-center mb-2\">\n");
      out.write("                        <i class=\"bi bi-envelope-open fs-1 text-primary me-3\"></i>\n");
      out.write("                        <div class=\"text-start\">\n");
      out.write("                            <h6 class=\"text-uppercase mb-1\">Email Us</h6>\n");
      out.write("                            <span>info@fpt.edu.vn</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex align-items-center mb-4\">\n");
      out.write("                        <i class=\"bi bi-phone-vibrate fs-1 text-primary me-3\"></i>\n");
      out.write("                        <div class=\"text-start\">\n");
      out.write("                            <h6 class=\"text-uppercase mb-1\">Call Us</h6>\n");
      out.write("                            <span>+012 345 6789</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <iframe class=\"position-relative w-100\"\n");
      out.write("                                src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3835.863822872289!2d108.25633498226848!3d15.968486316307787!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3142116949840599%3A0x365b35580f52e8d5!2zxJDhuqFpIGjhu41jIEZQVCAoRlBUIHVuaXZlcnNpdHkp!5e0!3m2!1sen!2s!4v1677941614321!5m2!1sen!2s\"\n");
      out.write("                                frameborder=\"0\" style=\"height: 205px; border:0;\" allowfullscreen=\"\" aria-hidden=\"false\"\n");
      out.write("                                tabindex=\"0\"></iframe>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function validateForm() {\n");
      out.write("            var password = document.getElementById(\"password\").value;\n");
      out.write("            var confirmPassword = document.getElementById(\"confirm-password\").value;\n");
      out.write("\n");
      out.write("            if (password!==confirmPassword) {\n");
      out.write("                alert(\"Mật khẩu nhập lại không khớp!\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</div>\n");
      out.write("<!-- Contact End -->\n");
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
