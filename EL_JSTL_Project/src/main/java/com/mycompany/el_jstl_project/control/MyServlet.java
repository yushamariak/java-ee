/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.el_jstl_project.control;

import com.mycompany.el_jstl_project.model.Dog;
import com.mycompany.el_jstl_project.model.Person;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yusha
 */
public class MyServlet extends HttpServlet {

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
                    List<Person> users = (List<Person>) getServletContext().getAttribute("users");
        if (users == null) {
            users = new ArrayList<>();
        }
        Person p = new Person();
        Dog d = new Dog();

        p.setName(request.getParameter("name"));
        p.setAdress(request.getParameter("adress"));
        if (request.getParameter("sex").equals("male")) {
            p.setSex("Male");
        } else {
            p.setSex("Female");
        }
        p.setBirthDate(request.getParameter("birth"));
        String[] phones = request.getParameterValues("phone");
        for (String tel : phones) {
            if (!tel.isEmpty()) {
                p.addPhone(tel);
            }
        }
        String[] emails = request.getParameterValues("email");
        for (String em : emails) {
            if (!em.isEmpty()) {
                p.addEmail(em);
            }
        }
        d.setName(request.getParameter("dogName"));
        d.setBreed(request.getParameter("dogBreed"));
        if (request.getParameter("dogSex").equals("male")) {
            d.setSex("Male");
        } else {
            d.setSex("Female");
        }
        p.setDog(d);
        users.add(p);
        getServletContext().setAttribute("users", users);
        
        RequestDispatcher rd = request.getRequestDispatcher("/out.jsp");
        rd.forward(request, response);

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
