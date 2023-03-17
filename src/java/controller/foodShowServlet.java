/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.entity.Food;
import model.entity.Pet;
import model.service.ProductService;
import static model.service.ProductService.listPet;

/**
 *
 * @author PC
 */
@WebServlet(name = "foodShowServlet", urlPatterns = {"/food"})
public class foodShowServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet foodShowServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet foodShowServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
             response.setCharacterEncoding("UTF-8");
        ArrayList<Food> listFood = ProductService.listFood();
        ArrayList<Food> subListFood = new ArrayList<Food>();
        int size=listFood.size();//get size
		int amountPet=8;//amount on page
		int maxPage=(size%amountPet==0)?size/amountPet:size/amountPet+1;
		int pageAmount=5;
		int page;
		try {
			if(request.getParameter("page").equals("fisrt")) page =1;
			else if(request.getParameter("page").equals("last")) page =maxPage;
			else page=Integer.parseInt(request.getParameter("page"));
		} catch (Exception e) {
			page=1;
		}
		
		System.out.println(page+" "+size);
		
		
		int realAmountPet=(page*amountPet>size)?size:page*amountPet;//set amount user if exceed real size
		System.out.println(realAmountPet);
		for(int i=page*amountPet-amountPet;i<realAmountPet;i++) {
			subListFood.add(listFood.get(i));
		System.out.println(i);
		}
		request.setAttribute("listFood", subListFood);
		
		request.setAttribute("page", page);
		request.setAttribute("maxPage", maxPage);
		request.getRequestDispatcher("food.jsp").forward(request, response);
        

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
