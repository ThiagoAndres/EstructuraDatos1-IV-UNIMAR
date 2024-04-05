<%-- 
    Document   : mostrarUsuarios
    Created on : 01/04/2024, 13:22:36 a. m.
    Author     : Andrés Castillo
--%>

<%@page import="java.util.List"%>
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar usuarios</title>
    </head>
    <body>
        <h1>lista de usuarios registrados</h1>
        <%
            List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
            int cont = 1;
            for(Usuario usu : listaUsuarios){            
            %>
            
            <p><b>Usuario No. <%=cont%></b></p>
            <p>Dni: <%= usu.getDni()%></p>
            <p>Nombre: <%= usu.getNombre()%> </p>
            <p>Correo: <%= usu.getCorreo()%></p>
            <p>Edad: <%= usu.getEdad()%></p>
            <p>Teléfono: <%= usu.getTelefono()%></p>
            <p>-------------------------------------------</p>
            <% cont = cont + 1;%>
            <%} %>
            
    </body>
</html>
