package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.entity.Cart;
import model.entity.Items;
import model.entity.User;
import model.repository.OrderRepository;

/**
 *
 * @author quang
 */
@WebServlet(name = "GetOrderHistory", urlPatterns = {"/getorderhistory"})
public class GetOrderHistory extends HttpServlet {

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
        HttpSession session = request.getSession();
        User user= (User) session.getAttribute("user");
        String userId = user.getUserName();
        ArrayList<String> listOrderId = OrderRepository.getOrderIdList(userId); //danh sach id cua cac order
        ArrayList<Cart> listOrdered = new ArrayList<>(); //list cac don hang da dat(cart)
        for (String orderId : listOrderId) {
            Cart orderedCart = new Cart();
            orderedCart.setCart(OrderRepository.getOrder(orderId));
            orderedCart.setOrderedId(orderId);
            orderedCart.setOrderStatus(OrderRepository.getOrderStatus(orderId));
            orderedCart.setDate(OrderRepository.getOrderDate(orderId));
            listOrdered.add(orderedCart);
        }
        request.setAttribute("listOrdered",listOrdered);
        request.getRequestDispatcher("orderhistory.jsp").forward(request, response);
        
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
