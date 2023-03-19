package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ordered_002dform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"donhang\">\n");
      out.write("            <div class=\"border-start border-5 border-primary ps-5 mb-5 mt-5\">\n");
      out.write("                <h6 class=\"text-primary text-uppercase\">Đơn hàng</h6>\n");
      out.write("                <h1 class=\"display-5 text-uppercase mb-0\">Kiểm tra đơn hàng của bạn</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"d-flex justify-content-center\">\n");
      out.write("                <h2 class=\"text-primary m-1 p-0\">Tình trạng đơn hàng của bạn: </h2>\n");
      out.write("                <h2 class=\"text-danger m-1 p-0\"> ?\"ĐÃ GIAO HÀNG\":\"ĐANG XỬ LÝ\"</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mt-5 text-center\">\n");
      out.write("                <p class=\"\">Khách vui lòng đồng kiểm với bưu tá khi nhận hàng và quay video để đảm bảo nhận hàng đầy\n");
      out.write("                    đủ.</p>\n");
      out.write("                <p>Đơn hàng của quý khách đã được gửi cho hãng vận chuyển Viettel Post</p>\n");
      out.write("                <p class=\"text-danger\">Mã vận đơn: 1719085909648</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"d-flex justify-content-around\">\n");
      out.write("                <div class=\"border-top pt-3 col-md-7 kt-left\">\n");
      out.write("                    <h3>Thông tin đơn hàng</h3>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <div class=\"mt-3\">\n");
      out.write("                        <div class=\"w-50 d-flex justify-content-between\">\n");
      out.write("                            <span>Tổng giá trị sản phẩm:</span>\n");
      out.write("                            <strong style=\"font-size: larger;\">1200000000</strong>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w-50 d-flex justify-content-between\">\n");
      out.write("                            <span>Phí vận chuyển:</span>\n");
      out.write("                            <strong style=\"font-size: larger;\">30000</strong>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w-50 border-top pt-2 mt-3 d-flex justify-content-between\">  \n");
      out.write("                            <span>Tổng cộng:</span>\n");
      out.write("                            <strong style=\"font-size: x-large;\">120030000</strong>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"border-top pt-3 col-md-4 kt-right\">\n");
      out.write("                    <h3>Thông tin khách hàng</h3>\n");
      out.write("                    <div>\n");
      out.write("                        <p>Nguyễn Minh Quang</p>\n");
      out.write("                        <p>Số điện thoại: 0123456789</p>\n");
      out.write("                        <p>Gmail: abc@gmail.com</p>\n");
      out.write("                        <p>Địa chỉ: Huế</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mt-5 d-flex justify-content-center\">\n");
      out.write("                <p>Nếu bạn có bất cứ câu hỏi nào, đừng ngần ngại liên lạc với chúng tôi qua Hotline: 0123456789 (9h\n");
      out.write("                    -\n");
      out.write("                    19h các ngày thứ 2 đến thứ 7)</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ordered}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"border-bottom\">\n");
          out.write("                        <div class=\"d-flex\">\n");
          out.write("                            <div class=\"p-1\">\n");
          out.write("                                <img width=\"60px\" height=\"60px\" src=\"img/product/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".jpg\" alt=\"\">\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"p-1\">\n");
          out.write("                                <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div style=\"text-align: right; font-size: larger;\" class=\"p-1\">\n");
          out.write("                            <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getAmmout()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                    ");
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
}
