/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author ANDRES
 */
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

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
    List<Usuario> listaUsuarios = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //listaUsuarios.add(new Usuario("111","Carlos", "c@correo.com", "25","111111"));
        //listaUsuarios.add(new Usuario("222","Camila", "ca@correo.com", "26","222222"));
        //listaUsuarios.add(new Usuario("333","Sandro", "s@correo.com", "27","333333"));
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios", listaUsuarios);
        
        response.sendRedirect("mostrarUsuarios.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String edad = request.getParameter("edad");
        String telefono = request.getParameter("telefono");
        
        System.out.println("Dni es: "+dni);
        System.out.println("Nombre es: "+nombre);
        System.out.println("Correo es: "+correo);
        System.out.println("Edad es: "+edad);
        System.out.println("Telefono es: "+telefono);
        //list
        //List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario(dni, nombre, correo, edad, telefono));
        PrintWriter salida;
        salida = response.getWriter();
        salida.println("<a href = 'index.jsp'>Regresar</a>");
      
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
