package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/include/header.jsp");
    _jspx_dependants.add("/include/cart-form.jsp");
    _jspx_dependants.add("/include/footer.jsp");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div class=\"cart-page\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8\">\n");
      out.write("                    <div class=\"cart-page-inner\">\n");
      out.write("                        <div class=\"table-responsive\">\n");
      out.write("                            <table class=\"table table-bordered\">\n");
      out.write("                                <thead class=\"thead-dark\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Product</th>\n");
      out.write("                                        <th>Price</th>\n");
      out.write("                                        <th>Quantity</th>\n");
      out.write("                                        <th>Total</th>\n");
      out.write("                                        <th>Remove</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody class=\"align-middle\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"img\">\n");
      out.write("                                                <a href=\"#\"><img src=\"img/product-1.png\" alt=\"Image\"></a>\n");
      out.write("                                                <p>Product Name</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>$99</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"qty\">\n");
      out.write("                                                <button class=\"btn-minus\"><i class=\"fa fa-minus\"></i></button>\n");
      out.write("                                                <input type=\"text\" value=\"1\">\n");
      out.write("                                                <button class=\"btn-plus\"><i class=\"fa fa-plus\"></i></button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>$99</td>\n");
      out.write("                                        <td><button><i class=\"fa fa-trash\"></i></button></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"img\">\n");
      out.write("                                                <a href=\"#\"><img src=\"img/product-1.png\" alt=\"Image\"></a>\n");
      out.write("                                                <p>Product Name</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>$99</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"qty\">\n");
      out.write("                                                <button class=\"btn-minus\"><i class=\"fa fa-minus\"></i></button>\n");
      out.write("                                                <input type=\"text\" value=\"1\">\n");
      out.write("                                                <button class=\"btn-plus\"><i class=\"fa fa-plus\"></i></button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>$99</td>\n");
      out.write("                                        <td><button><i class=\"fa fa-trash\"></i></button></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"img\">\n");
      out.write("                                                <a href=\"#\"><img src=\"img/product-1.png\" alt=\"Image\"></a>\n");
      out.write("                                                <p>Product Name</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>$99</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"qty\">\n");
      out.write("                                                <button class=\"btn-minus\"><i class=\"fa fa-minus\"></i></button>\n");
      out.write("                                                <input type=\"text\" value=\"1\">\n");
      out.write("                                                <button class=\"btn-plus\"><i class=\"fa fa-plus\"></i></button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>$99</td>\n");
      out.write("                                        <td><button><i class=\"fa fa-trash\"></i></button></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"img\">\n");
      out.write("                                                <a href=\"#\"><img src=\"img/product-1.png\" alt=\"Image\"></a>\n");
      out.write("                                                <p>Product Name</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>$99</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"qty\">\n");
      out.write("                                                <button class=\"btn-minus\"><i class=\"fa fa-minus\"></i></button>\n");
      out.write("                                                <input class=\"quantity-input\" type=\"text\" value=\"1\">\n");
      out.write("                                                <button class=\"btn-plus\"><i class=\"fa fa-plus\"></i></button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>$99</td>\n");
      out.write("                                        <td><button><i class=\"fa fa-trash\"></i></button></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"img\">\n");
      out.write("                                                <a href=\"#\"><img src=\"img/product-1.png\" alt=\"Image\"></a>\n");
      out.write("                                                <p>Product Name</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>$99</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <div class=\"qty\">\n");
      out.write("                                                <button class=\"btn-minus\"><i class=\"fa fa-minus\"></i></button>\n");
      out.write("                                                <input type=\"text\" value=\"1\">\n");
      out.write("                                                <button class=\"btn-plus\"><i class=\"fa fa-plus\"></i></button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>$99</td>\n");
      out.write("                                        <td><button><i class=\"fa fa-trash\"></i></button></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <div class=\"cart-page-inner\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"coupon\">\n");
      out.write("                                    <input type=\"text\" placeholder=\"Coupon Code\">\n");
      out.write("                                    <input class=\"button\" type=\"submit\" value=\"Apply Code\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"cart-summary\">\n");
      out.write("                                    <div class=\"cart-content\">\n");
      out.write("                                        <h1>Cart Summary</h1>\n");
      out.write("                                        <p>Sub Total<span>$99</span></p>\n");
      out.write("                                        <p>Shipping Cost<span>$1</span></p>\n");
      out.write("                                        <h2>Grand Total<span>$100</span></h2>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"cart-btn\">\n");
      out.write("                                        <button>Update Cart</button>\n");
      out.write("                                        <button>Checkout</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>");
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
      out.write("</body>\r\n");
      out.write("\r\n");
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
        out.write("                    <div class=\"nav-item dropdown\">\r\n");
        out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle bg-primary text-white px-5 ms-lg-5\" data-bs-toggle=\"dropdown\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\r\n");
        out.write("                        <div class=\"dropdown-menu m-0\">\r\n");
        out.write("                            <a href=\"inforUser.jsp\" class=\"dropdown-item\">Your information</a>\r\n");
        out.write("                            <a href=\"#\" class=\"dropdown-item\">Your cart</a>\r\n");
        out.write("                            <a href=\"#\" class=\"dropdown-item text-danger\">Log out</a>\r\n");
        out.write("                        </div>\r\n");
        out.write("                    </div>\r\n");
        out.write("                        ");
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
}
