package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>PET SHOP</title>\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"keywords\">\r\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Google Web Fonts -->\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins&family=Roboto:wght@700&display=swap\" rel=\"stylesheet\">  \r\n");
      out.write("\r\n");
      out.write("        <!-- Icon Font Stylesheet -->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"lib/flaticon/font/flaticon.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Libraries Stylesheet -->\r\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Template Stylesheet -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Topbar Start -->\r\n");
      out.write("        <div class=\"container-fluid border-bottom d-none d-lg-block\">\r\n");
      out.write("            <div class=\"row gx-0\">\r\n");
      out.write("                <div class=\"col-lg-4 text-center py-2\">\r\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\">\r\n");
      out.write("                        <i class=\"bi bi-geo-alt fs-1 text-primary me-3\"></i>\r\n");
      out.write("                        <div class=\"text-start\">\r\n");
      out.write("                            <h6 class=\"text-uppercase mb-1\">Our Office</h6>\r\n");
      out.write("                            <span>123 Street, Da Nang, Viet Nam</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 text-center border-start border-end py-2\">\r\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\">\r\n");
      out.write("                        <i class=\"bi bi-envelope-open fs-1 text-primary me-3\"></i>\r\n");
      out.write("                        <div class=\"text-start\">\r\n");
      out.write("                            <h6 class=\"text-uppercase mb-1\">Email Us</h6>\r\n");
      out.write("                            <span>info@fpt.edu.vn</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 text-center py-2\">\r\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\">\r\n");
      out.write("                        <i class=\"bi bi-phone-vibrate fs-1 text-primary me-3\"></i>\r\n");
      out.write("                        <div class=\"text-start\">\r\n");
      out.write("                            <h6 class=\"text-uppercase mb-1\">Call Us</h6>\r\n");
      out.write("                            <span>+012 345 6789</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Topbar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Navbar Start -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg bg-white navbar-light shadow-sm py-3 py-lg-0 px-3 px-lg-0\">\r\n");
      out.write("            <a href=\"index.jsp\" class=\"navbar-brand ms-lg-5\">\r\n");
      out.write("                <h1 class=\"m-0 text-uppercase text-dark\"><i class=\"bi bi-shop fs-1 text-primary me-3\"></i>Pet Shop</h1>\r\n");
      out.write("            </a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("                <div class=\"navbar-nav ms-auto py-0\">\r\n");
      out.write("                    <a href=\"index.jsp\" class=\"nav-item nav-link active\">Home</a>\r\n");
      out.write("                    <a href=\"about.jsp\" class=\"nav-item nav-link\">About</a>\r\n");
      out.write("                    <a href=\"service.jsp\" class=\"nav-item nav-link\">Service</a>\r\n");
      out.write("                    <a href=\"product.jsp\" class=\"nav-item nav-link\">Product</a>\r\n");
      out.write("                    <div class=\"nav-item dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Pages</a>\r\n");
      out.write("                        <div class=\"dropdown-menu m-0\">\r\n");
      out.write("                            <a href=\"testmonial.jsp\" class=\"dropdown-item\">Testimonial</a>\r\n");
      out.write("                            <a href=\"blog.jsp\" class=\"dropdown-item\">Blog Grid</a>\r\n");
      out.write("                            <a href=\"detail.jsp\" class=\"dropdown-item\">Blog Detail</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <a href=\"login.jsp\" class=\"nav-item nav-link nav-contact bg-primary text-white px-5 ms-lg-5\">Log in <i class=\"bi bi-arrow-right\"></i></a>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
