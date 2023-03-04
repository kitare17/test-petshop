package org.apache.jsp.pet_002dshop_002dwebsite_002dtemplate.header_002dfooter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>PET SHOP - Pet Shop Website Template</title>\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("    <meta content=\"Free HTML Templates\" name=\"keywords\">\n");
      out.write("    <meta content=\"Free HTML Templates\" name=\"description\">\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("    <!-- Google Web Fonts -->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins&family=Roboto:wght@700&display=swap\" rel=\"stylesheet\">  \n");
      out.write("\n");
      out.write("    <!-- Icon Font Stylesheet -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"lib/flaticon/font/flaticon.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Libraries Stylesheet -->\n");
      out.write("    <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Template Stylesheet -->\n");
      out.write("    <link href=\"../css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <!-- Topbar Start -->\n");
      out.write("    <div class=\"container-fluid border-bottom d-none d-lg-block\">\n");
      out.write("        <div class=\"row gx-0\">\n");
      out.write("            <div class=\"col-lg-4 text-center py-2\">\n");
      out.write("                <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                    <i class=\"bi bi-geo-alt fs-1 text-primary me-3\"></i>\n");
      out.write("                    <div class=\"text-start\">\n");
      out.write("                        <h6 class=\"text-uppercase mb-1\">Our Office</h6>\n");
      out.write("                        <span>123 Street, Da Nang, Viet Nam</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 text-center border-start border-end py-2\">\n");
      out.write("                <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                    <i class=\"bi bi-envelope-open fs-1 text-primary me-3\"></i>\n");
      out.write("                    <div class=\"text-start\">\n");
      out.write("                        <h6 class=\"text-uppercase mb-1\">Email Us</h6>\n");
      out.write("                        <span>info@fpt.edu.vn</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 text-center py-2\">\n");
      out.write("                <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                    <i class=\"bi bi-phone-vibrate fs-1 text-primary me-3\"></i>\n");
      out.write("                    <div class=\"text-start\">\n");
      out.write("                        <h6 class=\"text-uppercase mb-1\">Call Us</h6>\n");
      out.write("                        <span>+012 345 6789</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Topbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Navbar Start -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-white navbar-light shadow-sm py-3 py-lg-0 px-3 px-lg-0\">\n");
      out.write("        <a href=\"index.html\" class=\"navbar-brand ms-lg-5\">\n");
      out.write("            <h1 class=\"m-0 text-uppercase text-dark\"><i class=\"bi bi-shop fs-1 text-primary me-3\"></i>Pet Shop</h1>\n");
      out.write("        </a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("            <div class=\"navbar-nav ms-auto py-0\">\n");
      out.write("                <a href=\"index.html\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                <a href=\"about.html\" class=\"nav-item nav-link\">About</a>\n");
      out.write("                <a href=\"service.html\" class=\"nav-item nav-link\">Service</a>\n");
      out.write("                <a href=\"product.html\" class=\"nav-item nav-link\">Product</a>\n");
      out.write("                <div class=\"nav-item dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Pages</a>\n");
      out.write("                    <div class=\"dropdown-menu m-0\">\n");
      out.write("                        <a href=\"team.html\" class=\"dropdown-item\">The Team</a>\n");
      out.write("                        <a href=\"testimonial.html\" class=\"dropdown-item\">Testimonial</a>\n");
      out.write("                        <a href=\"blog.html\" class=\"dropdown-item\">Blog Grid</a>\n");
      out.write("                        <a href=\"detail.html\" class=\"dropdown-item\">Blog Detail</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"contact.html\" class=\"nav-item nav-link nav-contact bg-primary text-white px-5 ms-lg-5\">Log in <i class=\"bi bi-arrow-right\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
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
