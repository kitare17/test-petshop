/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.entity.Food;
import model.repository.AdminRepository;
import model.repository.ProductRepository;

/**
 *
 * @author PC
 */
@WebServlet(name = "AddFoodServlet", urlPatterns = {"/addfood"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 100, // 2MB
        maxFileSize = 1024 * 1024 * 100, // 10MB
        maxRequestSize = 1024 * 1024 * 100) // 50MB
public class AddFoodServlet extends HttpServlet {

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
            out.println("<title>Servlet AddFoodServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddFoodServlet at " + request.getContextPath() + "</h1>");
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
//        processRequest(request, response);
        //    private String productId;
//    private String productName;
//    private String productType;
//    private double productPrice;
//productAmount       f

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
       // request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String productId = ramdomID();
        String productName = request.getParameter("productName");
        String productType = request.getParameter("productType");
        double productPrice = Double.parseDouble(request.getParameter("productPrice"));
        int productAmount = Integer.parseInt(request.getParameter("productAmount"));
        Food newFood = new Food(productId, productName, productType, productPrice, productAmount);
        // System.out.println(newFood);
        
      
        AdminRepository.addFood(newFood);
        
        //addfile
          String savePath = "web\\img\\product";
        String appPath = getLink( request.getServletContext().getRealPath(""));
        File f = new File(appPath+savePath);
        for (Part part : request.getParts()) {
            System.out.println(part.getHeader("content-disposition"));
            if (!part.getHeader("content-disposition").contains("filename")) {
                continue;
            }

            String fileName = productId + ".jpg";

            if (fileName != null && fileName.length() > 0) {
                String filePath = appPath+savePath + File.separator + fileName;
                part.write(filePath);
            }

        }
         response.sendRedirect("admin.jsp");
    }

    private static String ramdomID() {
        String foodID = "F";
        Random rd = new Random();

        do {

            int random = rd.nextInt(10000);
            if (random > 999) {
                foodID = foodID + random;
            } else if (random > 99) {
                foodID = foodID + "0" + random;
            } else if (random > 9) {
                foodID = foodID + "00" + random;
            } else {
                foodID = foodID + "000" + random;
            }

        } while (ProductRepository.getFood(foodID) != null);

        return foodID;
    }

    String getLink(String s) {
     return s.substring(0,s.lastIndexOf("build"));
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
