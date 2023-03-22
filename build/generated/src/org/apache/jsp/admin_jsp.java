package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/include/header.jsp");
    _jspx_dependants.add("/include/admin_form.jsp");
    _jspx_dependants.add("/include/chart.jsp");
    _jspx_dependants.add("/include/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("              integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.15.4/css/all.css\">\r\n");
      out.write("        <!-- Google Web Fonts -->\r\n");
      out.write("        <!--        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">-->\r\n");
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
      out.write("        <link href=\"css/pluscharts.css\"\r\n");
      out.write("        <script src=\"https://d3js.org/d3.v5.min.js\"></script>\r\n");
      out.write("        <script src=\"dist/pluscharts.js\"></script>\r\n");
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
      out.write("                    <a href=\"product\" class=\"nav-item nav-link\">Product</a>\r\n");
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
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      model.repository.AdminRepository show = null;
      synchronized (_jspx_page_context) {
        show = (model.repository.AdminRepository) _jspx_page_context.getAttribute("show", PageContext.PAGE_SCOPE);
        if (show == null){
          show = new model.repository.AdminRepository();
          _jspx_page_context.setAttribute("show", show, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid pt-5 \">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"border-start border-5 border-primary ps-5 mb-5\" style=\"max-width: 600px;\">\r\n");
      out.write("                <h6 class=\"text-primary text-uppercase\">Welcome admin</h6>\r\n");
      out.write("                <h1 class=\"display-5 text-uppercase mb-0\">Admin management page</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-12 statistical d-flex justify-content-around mb-5\">\r\n");
      out.write("                <div class=\"d-flex register m-1\">\r\n");
      out.write("                    <div style=\"background-color: orange;\" class=\"icon\"><i class=\"fa-solid fa-person-circle-check\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"detail\">\r\n");
      out.write("                        <div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.getAmountUser()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    <div>account registrant</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"d-flex user m-1\">\r\n");
      out.write("                <div style=\"background-color: rgba(0, 0, 255, 0.726);\" class=\"icon\"><i\r\n");
      out.write("                        class=\" fa-solid fa-user\"></i></div>\r\n");
      out.write("                <div class=\"detail\">\r\n");
      out.write("                    <div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.getCustomerOrder()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("                    <div>customer has at least 1 order</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"d-flex pet-sold m-1\">\r\n");
      out.write("                <div style=\"background-color: #7AB730;\" class=\"icon\"><i class=\"fa-solid fa-paw\"></i></div>\r\n");
      out.write("                <div class=\"detail\">\r\n");
      out.write("                    <div>120</div>\r\n");
      out.write("                    <div>total pet sold</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"d-flex service m-1\">\r\n");
      out.write("                <div style=\"background-color: rgb(255, 108, 133);\" class=\"icon\"><i\r\n");
      out.write("                        class=\"fa-solid fa-hand-holding-heart\"></i></div>\r\n");
      out.write("                <div class=\"detail\">\r\n");
      out.write("                    <div>120</div>\r\n");
      out.write("                    <div>total service used</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"d-flex money m-1\">\r\n");
      out.write("                <div style=\"background-color: rgb(204, 0, 204);\" class=\"icon\"><i class=\" fa-solid fa-coins\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"detail\">\r\n");
      out.write("                    <div>120.000.000</div>\r\n");
      out.write("                    <div>revenue</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Thêm Food -->\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary m-5\" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModal\"\r\n");
      out.write("        data-bs-whatever=\"@mdo\">Thêm Food</button>\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">New message</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form action=\"addfood\" method=\"post\" >\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"fid\" class=\"col-form-label\">Food ID:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"fid\" name=\"productId\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"fname\" class=\"col-form-label\">Food Name:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"fname\" name=\"productName\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"ftype\" class=\"col-form-label\">Food Type:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"ftype\" name=\"productType\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"fprice\" class=\"col-form-label\">Food Price:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"fprice\" name=\"productPrice\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"famount\" class=\"col-form-label\">Food Amount:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"famount\" name=\"productAmount\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"fpic\" class=\"col-form-label\">Food Picture:</label>\r\n");
      out.write("                        <input type=\"file\" class=\"form-control\" id=\"fpic\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" >Send message</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Thêm Pet -->\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary m-5\" data-bs-toggle=\"modal\" data-bs-target=\"#addPet\"\r\n");
      out.write("        data-bs-whatever=\"@mdo\">Thêm Pet</button>\r\n");
      out.write("<div class=\"modal fade\" id=\"addPet\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">New message</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form action=\"addpet\" method=\"post\">\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"id\" class=\"col-form-label\">Pet ID:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"id\" name=\"productId\" >\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"name\" class=\"col-form-label\">Pet Name:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"name\" name=\"productName\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"color\" class=\"col-form-label\">Pet Color:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"color\" name=\"petColor\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"type\" class=\"col-form-label\">Pet Type:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"type\" name=\"productType\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"price\" class=\"col-form-label\">Pet Price:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"price\" name=\"productPrice\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"amount\" class=\"col-form-label\">Pet Amount:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"amount\" name=\"productAmount\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <label for=\"pic\" class=\"col-form-label\">Pet Picture:</label>\r\n");
      out.write("                        <input type=\"file\" class=\"form-control\" id=\"pic\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Send message</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ------List Food----- -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary m-5\" data-bs-toggle=\"modal\" data-bs-target=\"#listFood\">\r\n");
      out.write("    List Food\r\n");
      out.write("</button>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"listFood\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-xl\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal title</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                <table class=\"table\" style=\"width: 100%;\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                    <td>FoodID</td>\r\n");
      out.write("                    <td>FoodName</td>\r\n");
      out.write("                    <td>FoodType</td>\r\n");
      out.write("                    <td>FoodPrice</td>\r\n");
      out.write("                    <td>FoodAmount</td>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ------List Pet------- -->\r\n");
      out.write("\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary m-5\" data-bs-toggle=\"modal\" data-bs-target=\"#listPet\">\r\n");
      out.write("    List Pet\r\n");
      out.write("</button>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"listPet\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-xl\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal title</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                <table class=\"table\" style=\"width: 100%;\">\r\n");
      out.write("                    <thead class=\"thead-dark w-100\">\r\n");
      out.write("                    <td>PetID</td>\r\n");
      out.write("                    <td>PetName</td>\r\n");
      out.write("                    <td>PetColor</td>\r\n");
      out.write("                    <td>FoodType</td>\r\n");
      out.write("                    <td>FoodPrice</td>\r\n");
      out.write("                    <td>FoodAmount</td>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody class=\"w-100\">\r\n");
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ----------Duyệt đơn hàng--------- -->\r\n");
      out.write("<button type=\"button\" class=\"btn btn-primary m-5\" data-bs-toggle=\"modal\" data-bs-target=\"#accept\">\r\n");
      out.write("    Order Accept\r\n");
      out.write("</button>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"accept\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-xl\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal title</h5>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                <table class=\"table\" style=\"width: 100%;\">\r\n");
      out.write("                    <thead class=\"thead-dark w-100\">\r\n");
      out.write("                    <td style=\"padding-left:5px;\">Mã đơn hàng</td>\r\n");
      out.write("                    <td>Người mua</td>\r\n");
      out.write("                    <td>Ngày đặt</td>\r\n");
      out.write("                    <td>Mã giảm giá</td>\r\n");
      out.write("                    <td>Tổng tiền</td>\r\n");
      out.write("                    <td>Tình trạng</td>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody class=\"w-100\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>P0001</td>\r\n");
      out.write("                            <td>Romeo Juliet</td>\r\n");
      out.write("                            <td>12/12/2023</td>\r\n");
      out.write("                            <td>deas54qwda</td>\r\n");
      out.write("                            <td>15000000</td>\r\n");
      out.write("                            <td>Đang xử lý</td>\r\n");
      out.write("                            <td><a class=\"btn btn-primary m-0\" href=\"\">Duyệt</a></td>\r\n");
      out.write("                            <td><a class=\"btn btn-danger m-0\" href=\"\">Hủy</a></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Style -->\r\n");
      out.write("<style>\r\n");
      out.write("    .statistical .icon {\r\n");
      out.write("\r\n");
      out.write("        color: white;\r\n");
      out.write("        align-self: center;\r\n");
      out.write("        padding: 30px 20px;\r\n");
      out.write("        font-size: xx-large;\r\n");
      out.write("        border-radius: 10% 0 0 10%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .statistical .detail {\r\n");
      out.write("        background-color: rgba(128, 128, 128, 0.116);\r\n");
      out.write("        border-radius: 0 10% 10% 0;\r\n");
      out.write("        width: 150px;\r\n");
      out.write("        font-size: smaller;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .statistical .detail :first-child {\r\n");
      out.write("        font-size: 40px;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("\r\n");
      out.write("        padding-top: 5%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .statistical .money .detail {\r\n");
      out.write("        width: 250px !important;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<!-- JavaScript Libraries \r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("<script src=\"lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("<script src=\"lib/owlcarousel/owl.carousel.min.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("<!-- Template Javascript \r\n");
      out.write("<script src=\"js/main.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"\r\n");
      out.write("        integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\"\r\n");
      out.write("crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\"\r\n");
      out.write("        integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\"\r\n");
      out.write("crossorigin=\"anonymous\"></script>-->\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/pluscharts.css\">\r\n");
      out.write("        <script src=\"https://d3js.org/d3.v5.min.js\"></script>\r\n");
      out.write("        <script src=\"dist/pluscharts.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"d-flex\">\r\n");
      out.write("            <div class=\"col-md-6\" id=\"column-chart\"></div>\r\n");
      out.write("            <div class=\"col-md-6\" id=\"spline-chart\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            pluscharts.draw({\r\n");
      out.write("                drawOn: '#column-chart',\r\n");
      out.write("                type: \"column\",\r\n");
      out.write("                dataset: {\r\n");
      out.write("                    data: [\r\n");
      out.write("                        {\r\n");
      out.write("                            label: \"Jan\",\r\n");
      out.write("                            value: 40\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            label: \"Feb\",\r\n");
      out.write("                            value: 50\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            label: \"Mar\",\r\n");
      out.write("                            value: 60\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            label: \"Apr\",\r\n");
      out.write("                            value: 70\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            label: \"May\",\r\n");
      out.write("                            value: 80\r\n");
      out.write("                        }\r\n");
      out.write("                    ],\r\n");
      out.write("                    backgroundColor: \"#5d62b4\", //can be array or single color\r\n");
      out.write("                    borderColor: \"#5d62b4\",\r\n");
      out.write("                    borderWidth: 0,\r\n");
      out.write("                    legendLabel: \"Registers\"\r\n");
      out.write("                },\r\n");
      out.write("                options: {\r\n");
      out.write("                    barPadding: .65,\r\n");
      out.write("                    barWidth: 15,\r\n");
      out.write("                    text: {\r\n");
      out.write("                        display: false,\r\n");
      out.write("                        color: \"#6c478c\"\r\n");
      out.write("                    },\r\n");
      out.write("                    axes: {\r\n");
      out.write("                        x: {\r\n");
      out.write("                            display: true,\r\n");
      out.write("                            min: 0,\r\n");
      out.write("                            max: 100\r\n");
      out.write("                        },\r\n");
      out.write("                        y: {\r\n");
      out.write("                            display: true,\r\n");
      out.write("                            min: 0,\r\n");
      out.write("                            max: 100\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                    legends: {\r\n");
      out.write("                        display: true,\r\n");
      out.write("                        width: 20,\r\n");
      out.write("                        height: 20\r\n");
      out.write("                    },\r\n");
      out.write("                    size: {\r\n");
      out.write("                        width: '400', //give 'container' if you want width and height of initiated container\r\n");
      out.write("                        height: '400'\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            pluscharts.draw({\r\n");
      out.write("                drawOn: \"#spline-chart\",\r\n");
      out.write("                type: \"spline\",\r\n");
      out.write("                dataset: {\r\n");
      out.write("                    data: [\r\n");
      out.write("                        {\r\n");
      out.write("                            label: 10,\r\n");
      out.write("                            value: 20\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            label: 20,\r\n");
      out.write("                            value: 50\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            label: 30,\r\n");
      out.write("                            value: 30\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            label: 40,\r\n");
      out.write("                            value: 10\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            label: 50,\r\n");
      out.write("                            value: 100\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            label: 60,\r\n");
      out.write("                            value: 60\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            label: 70,\r\n");
      out.write("                            value: 80\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            label: 80,\r\n");
      out.write("                            value: 50\r\n");
      out.write("                        },\r\n");
      out.write("                        {\r\n");
      out.write("                            label: 100,\r\n");
      out.write("                            value: 70\r\n");
      out.write("                        }\r\n");
      out.write("                    ],\r\n");
      out.write("                    lineColor: \"#ef5958\",\r\n");
      out.write("                    lineWidth: 2,\r\n");
      out.write("                    legendLabel: \"visitors\"\r\n");
      out.write("                },\r\n");
      out.write("                options: {\r\n");
      out.write("                    text: {\r\n");
      out.write("                        display: false,\r\n");
      out.write("                        color: \"#6c478c\"\r\n");
      out.write("                    },\r\n");
      out.write("                    points: {\r\n");
      out.write("                        display: true,\r\n");
      out.write("                        radius: 3\r\n");
      out.write("                    },\r\n");
      out.write("                    axes: {\r\n");
      out.write("                        x: {\r\n");
      out.write("                            display: true,\r\n");
      out.write("                            scale: 3,\r\n");
      out.write("                            min: 0,\r\n");
      out.write("                            max: 100\r\n");
      out.write("                        },\r\n");
      out.write("                        y: {\r\n");
      out.write("                            display: true,\r\n");
      out.write("                            scale: 3,\r\n");
      out.write("                            min: 0,\r\n");
      out.write("                            max: 100\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                    legends: {\r\n");
      out.write("                        display: true,\r\n");
      out.write("                        width: 20,\r\n");
      out.write("                        height: 20\r\n");
      out.write("                    },\r\n");
      out.write("                    size: {\r\n");
      out.write("                        width: '400', //give 'container' if you want width and height of initiated container\r\n");
      out.write("                        height: '400'\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Footer Start -->\r\n");
      out.write("<div class=\"container-fluid bg-light mt-5 py-5\">\r\n");
      out.write("    <div class=\"container pt-5\">\r\n");
      out.write("        <div class=\"row g-5\">\r\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                <h5 class=\"text-uppercase border-start border-5 border-primary ps-3 mb-4\">Get In Touch</h5>\r\n");
      out.write("                <p class=\"mb-4\">No dolore ipsum accusam no lorem. Invidunt sed clita kasd clita et et dolor sed dolor</p>\r\n");
      out.write("                <p class=\"mb-2\"><i class=\"bi bi-geo-alt text-primary me-2\"></i>123 Street, New York, USA</p>\r\n");
      out.write("                <p class=\"mb-2\"><i class=\"bi bi-envelope-open text-primary me-2\"></i>info@example.com</p>\r\n");
      out.write("                <p class=\"mb-0\"><i class=\"bi bi-telephone text-primary me-2\"></i>+012 345 67890</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                <h5 class=\"text-uppercase border-start border-5 border-primary ps-3 mb-4\">Quick Links</h5>\r\n");
      out.write("                <div class=\"d-flex flex-column justify-content-start\">\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Home</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>About Us</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Our Services</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Latest Blog</a>\r\n");
      out.write("                    <a class=\"text-body\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Contact Us</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                <h5 class=\"text-uppercase border-start border-5 border-primary ps-3 mb-4\">Popular Links</h5>\r\n");
      out.write("                <div class=\"d-flex flex-column justify-content-start\">\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Home</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>About Us</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Our Services</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Meet The Team</a>\r\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Latest Blog</a>\r\n");
      out.write("                    <a class=\"text-body\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Contact Us</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                <h5 class=\"text-uppercase border-start border-5 border-primary ps-3 mb-4\">Newsletter</h5>\r\n");
      out.write("                <form action=\"\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control p-3\" placeholder=\"Your Email\">\r\n");
      out.write("                        <button class=\"btn btn-primary\">Sign Up</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                <h6 class=\"text-uppercase mt-4 mb-3\">Follow Us</h6>\r\n");
      out.write("                <div class=\"d-flex\">\r\n");
      out.write("                    <a class=\"btn btn-outline-primary btn-square me-2\" href=\"#\"><i class=\"bi bi-twitter\"></i></a>\r\n");
      out.write("                    <a class=\"btn btn-outline-primary btn-square me-2\" href=\"#\"><i class=\"bi bi-facebook\"></i></a>\r\n");
      out.write("                    <a class=\"btn btn-outline-primary btn-square me-2\" href=\"#\"><i class=\"bi bi-linkedin\"></i></a>\r\n");
      out.write("                    <a class=\"btn btn-outline-primary btn-square\" href=\"#\"><i class=\"bi bi-instagram\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-12 text-center text-body\">\r\n");
      out.write("                <a class=\"text-body\" href=\"\">Terms & Conditions</a>\r\n");
      out.write("                <span class=\"mx-1\">|</span>\r\n");
      out.write("                <a class=\"text-body\" href=\"\">Privacy Policy</a>\r\n");
      out.write("                <span class=\"mx-1\">|</span>\r\n");
      out.write("                <a class=\"text-body\" href=\"\">Customer Support</a>\r\n");
      out.write("                <span class=\"mx-1\">|</span>\r\n");
      out.write("                <a class=\"text-body\" href=\"\">Payments</a>\r\n");
      out.write("                <span class=\"mx-1\">|</span>\r\n");
      out.write("                <a class=\"text-body\" href=\"\">Help</a>\r\n");
      out.write("                <span class=\"mx-1\">|</span>\r\n");
      out.write("                <a class=\"text-body\" href=\"\">FAQs</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container-fluid bg-dark text-white-50 py-4\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row g-5\">\r\n");
      out.write("            <div class=\"col-md-6 text-center text-md-start\">\r\n");
      out.write("                <p class=\"mb-md-0\">&copy; <a class=\"text-white\" href=\"#\">Your Site Name</a>. All Rights Reserved.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Footer End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Back to Top -->\r\n");
      out.write("<a href=\"#\" class=\"btn btn-primary py-3 fs-4 back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- JavaScript Libraries -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("<script src=\"lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("<script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Template Javascript -->\r\n");
      out.write("<script src=\"js/main.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\"\r\n");
      out.write("        integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\"\r\n");
      out.write("crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\"\r\n");
      out.write("        integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\"\r\n");
      out.write("crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("                </body>\r\n");
      out.write("                \r\n");
      out.write("                </html>\r\n");
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <div class=\"nav-item dropdown\">\r\n");
        out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle bg-primary text-white px-5 ms-lg-5\" data-bs-toggle=\"dropdown\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\r\n");
        out.write("                            <div class=\"dropdown-menu m-0\">\r\n");
        out.write("                                <a href=\"inforUser.jsp\" class=\"dropdown-item\">Your information</a>\r\n");
        out.write("                                <a href=\"admin.jsp\" class=\"dropdown-item\">Admin</a>\r\n");
        out.write("                                <a href=\"cart.jsp\" class=\"dropdown-item\">Your cart</a>\r\n");
        out.write("                                <a href=\"getorderhistory\" class=\"dropdown-item\">History order</a>\r\n");
        out.write("                                <a href=\"logout\" class=\"dropdown-item text-danger\">Log out</a>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.getAllFood()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <tr>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td><img class=\"w-25\" src=\"img/blog-2.jpg\" alt=\"\"></td>\r\n");
          out.write("                                <td><a class=\"btn btn-danger m-0\" href=\"\">Delete</a></td>\r\n");
          out.write("                            </tr>\r\n");
          out.write("\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.getAllPet()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <tr>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.petColor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productAmount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td><img class=\"w-25\" src=\"img/blog-2.jpg\" alt=\"\"></td>\r\n");
          out.write("                                <td><a class=\"btn btn-danger m-0\" href=\"\">Delete</a></td>\r\n");
          out.write("                            </tr>\r\n");
          out.write("\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${show.getAllOrder()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("i");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <tr>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.idOrder}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getDiscountId()==null?\"Khong ma\":\"co ma\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.orderStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                \r\n");
          out.write("                                </tr>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
