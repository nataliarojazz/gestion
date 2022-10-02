<%-- 
    Document   : GestionM
    Created on : 30/09/2022, 9:46:54 p. m.
    Author     : Profesional
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DOCTORES</title>
    </head>
    <body>
        <h1>LISTA DOCTORES</h1>
        <%@page   import="GS.Doctor"%>
        <% 
            out.print("LISTA DE DOCTORES");
             Doctor dr = new Doctor("JORGE", "GONZALES");
             dr.mostrar();
             System.out.println("\n");
             Doctor dr1 = new Doctor("YEIMMY", "OCHOA");
             dr1.mostrar();
        %>
    </body>

</html>
