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
import model.entity.Pet;
import model.repository.AdminRepository;
import model.repository.ProductRepository;

/**
 *
 * @author PC
 */
@WebServlet(name = "AddPetServlet", urlPatterns = {"/addpet"})

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 100, // 2MB
        maxFileSize = 1024 * 1024 * 100, // 10MB
        maxRequestSize = 1024 * 1024 * 100) // 50MB
public class AddPetServlet extends HttpServlet {

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
            out.println("<title>Servlet AddPetServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddPetServlet at " + request.getContextPath() + "</h1>");
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
            response.setCharacterEncoding("UTF-8");
        String productId= ramdomID();
        String productName= request.getParameter("productName");
        String productType= request.getParameter("productType");
        double productPrice= Double.parseDouble(request.getParameter("productPrice")) ;
        int productAmount=Integer.parseInt(request.getParameter("productAmount")) ;
        String petColor= request.getParameter("petColor");
        Pet newPet=new Pet(productId, productName, productType, productPrice, productAmount, petColor);
        System.out.println(newPet);
        AdminRepository.addPet(newPet);
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
        String petID = "P";
        Random rd = new Random();

        do {

            int random = rd.nextInt(10000);
            if (random > 999) {
                petID = petID + random;
            } else if (random > 99) {
                petID = petID + "0" + random;
            } else if (random > 9) {
                petID = petID + "00" + random;
            } else {
                petID = petID + "000" + random;
            }

        } while (ProductRepository.getPet(petID) != null);

        return petID;
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
