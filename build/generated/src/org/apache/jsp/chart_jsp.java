package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/pluscharts.css\">\n");
      out.write("        <script src=\"https://d3js.org/d3.v5.min.js\"></script>\n");
      out.write("        <script src=\"dist/pluscharts.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"d-flex\">\n");
      out.write("            <div class=\"col-md-6\" id=\"column-chart\"></div>\n");
      out.write("            <div class=\"col-md-6\" id=\"spline-chart\"></div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            pluscharts.draw({\n");
      out.write("                drawOn: '#column-chart',\n");
      out.write("                type: \"column\",\n");
      out.write("                dataset: {\n");
      out.write("                    data: [\n");
      out.write("                        {\n");
      out.write("                            label: \"Jan\",\n");
      out.write("                            value: 40\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            label: \"Feb\",\n");
      out.write("                            value: 50\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            label: \"Mar\",\n");
      out.write("                            value: 60\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            label: \"Apr\",\n");
      out.write("                            value: 70\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            label: \"May\",\n");
      out.write("                            value: 80\n");
      out.write("                        }\n");
      out.write("                    ],\n");
      out.write("                    backgroundColor: \"#5d62b4\", //can be array or single color\n");
      out.write("                    borderColor: \"#5d62b4\",\n");
      out.write("                    borderWidth: 0,\n");
      out.write("                    legendLabel: \"Registers\"\n");
      out.write("                },\n");
      out.write("                options: {\n");
      out.write("                    barPadding: .65,\n");
      out.write("                    barWidth: 15,\n");
      out.write("                    text: {\n");
      out.write("                        display: false,\n");
      out.write("                        color: \"#6c478c\"\n");
      out.write("                    },\n");
      out.write("                    axes: {\n");
      out.write("                        x: {\n");
      out.write("                            display: true,\n");
      out.write("                            min: 0,\n");
      out.write("                            max: 100\n");
      out.write("                        },\n");
      out.write("                        y: {\n");
      out.write("                            display: true,\n");
      out.write("                            min: 0,\n");
      out.write("                            max: 100\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    legends: {\n");
      out.write("                        display: true,\n");
      out.write("                        width: 20,\n");
      out.write("                        height: 20\n");
      out.write("                    },\n");
      out.write("                    size: {\n");
      out.write("                        width: '400', //give 'container' if you want width and height of initiated container\n");
      out.write("                        height: '400'\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("            pluscharts.draw({\n");
      out.write("                drawOn: \"#spline-chart\",\n");
      out.write("                type: \"spline\",\n");
      out.write("                dataset: {\n");
      out.write("                    data: [\n");
      out.write("                        {\n");
      out.write("                            label: 10,\n");
      out.write("                            value: 20\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            label: 20,\n");
      out.write("                            value: 50\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            label: 30,\n");
      out.write("                            value: 30\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            label: 40,\n");
      out.write("                            value: 10\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            label: 50,\n");
      out.write("                            value: 100\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            label: 60,\n");
      out.write("                            value: 60\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            label: 70,\n");
      out.write("                            value: 80\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            label: 80,\n");
      out.write("                            value: 50\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            label: 100,\n");
      out.write("                            value: 70\n");
      out.write("                        }\n");
      out.write("                    ],\n");
      out.write("                    lineColor: \"#ef5958\",\n");
      out.write("                    lineWidth: 2,\n");
      out.write("                    legendLabel: \"visitors\"\n");
      out.write("                },\n");
      out.write("                options: {\n");
      out.write("                    text: {\n");
      out.write("                        display: false,\n");
      out.write("                        color: \"#6c478c\"\n");
      out.write("                    },\n");
      out.write("                    points: {\n");
      out.write("                        display: true,\n");
      out.write("                        radius: 3\n");
      out.write("                    },\n");
      out.write("                    axes: {\n");
      out.write("                        x: {\n");
      out.write("                            display: true,\n");
      out.write("                            scale: 3,\n");
      out.write("                            min: 0,\n");
      out.write("                            max: 100\n");
      out.write("                        },\n");
      out.write("                        y: {\n");
      out.write("                            display: true,\n");
      out.write("                            scale: 3,\n");
      out.write("                            min: 0,\n");
      out.write("                            max: 100\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    legends: {\n");
      out.write("                        display: true,\n");
      out.write("                        width: 20,\n");
      out.write("                        height: 20\n");
      out.write("                    },\n");
      out.write("                    size: {\n");
      out.write("                        width: '400', //give 'container' if you want width and height of initiated container\n");
      out.write("                        height: '400'\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            })\n");
      out.write("\n");
      out.write("        </script>\n");
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
