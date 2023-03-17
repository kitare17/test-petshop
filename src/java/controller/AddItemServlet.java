package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.entity.Cart;
import model.entity.Items;
import model.entity.Product;
import model.repository.ProductRepository;

/**
 *
 * @author quang
 */
@WebServlet(name = "AddItemServlet", urlPatterns = {"/additem"})
public class AddItemServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
        try {
            String id = request.getParameter("id");
            String ammout = request.getParameter("ammount");
            Product p = null;
            if (id.contains("P")) {
                p = ProductRepository.getPet(id);
            } else if (id.contains("F")) {
                p = ProductRepository.getFood(id);

            } else {
                System.out.println("=============>Loi if else check matching <===============");
            }
            HttpSession session = request.getSession();
            Cart cart = (Cart) session.getAttribute("cart");
            Items item = new Items(p, Integer.parseInt(ammout));
            cart.addItems(item);
            System.out.println(cart);
            System.out.println(cart.getThanhTien());
            request.setAttribute("product", p);
            request.setAttribute("message", "Thêm sản phẩm thành công");
            response.setCharacterEncoding("UTF-8");
            request.getRequestDispatcher("product-detail.jsp").forward(request, response);
        } catch (Exception e) {
            System.out.println("=============>Loi AdditemServlet <===============");
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
