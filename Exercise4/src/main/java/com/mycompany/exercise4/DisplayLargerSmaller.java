/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercise4;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yusha
 */
public class DisplayLargerSmaller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     private void displaySmaller(String[] strNumber, PrintWriter out) {
        double min = Double.parseDouble(strNumber[0]);
        double n;
        
        for (int i = 1; i < strNumber.length; i++) {
            n = Double.parseDouble(strNumber[i]);
            if (n < min)
                min = n;
        }

        out.printf("        <p>The smallest number is %.2f</p>\n", min);
    }

    private void displayLarger(String[] strNumber, PrintWriter out) {
        double max = Double.parseDouble(strNumber[0]);
        double n;
        
        for (int i = 1; i < strNumber.length; i++) {
            n = Double.parseDouble(strNumber[i]);
            if (n > max)
                max = n;
        }
        
        out.printf("        <p>The largest number %.2f</p>\n", max);
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.printf("<!DOCTYPE html>\n"
                    + "<html lang=\"pt-br\">\n"
                    + "    <head>\n"
                    + "        <title>Exercise 4 Servlets</title>\n"
                    + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                    + "    </head>\n"
                    + "    <body>\n");
            String[] strNumber = request.getParameterValues("n");
            String event = request.getParameter("event");
            
            if (event.equals("Display Largest"))
                displayLarger(strNumber, out); //Calls a local method
            else if (event.equals("Display Smallest")) 
                displaySmaller(strNumber, out); //Calls a local method
            
            out.printf("<form action=\"/Exercise4/\" method=\"post\">\n"
                    + "     <input type=\"submit\"  value=\"Back\">\n"
                    + "</form>");
            out.printf("    </body>\n"
                    + "</html>");
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
