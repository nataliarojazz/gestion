<%-- 
    Document   : GestionC
    Created on : 30/09/2022, 9:47:13 p. m.
    Author     : Profesional
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CENTRO DE SERVICIOS</title>
    </head>
    <body>
        <h1>LISTA CENTROS DE SERVICIO</h1>
        <%@page   import="GS.Eps"%>
        <%
                out.print("LISTA EPS");
                out.println("<br>");  
                Eps eps =  new Eps ("ECOOPSOS");
                out.print(eps.mostrar2());
                out.println("<br>");          
                out.print(eps.mostrar2());
                Eps eps1=new Eps ("FAMISANAR");
                out.print(eps1.mostrar2());
                out.println("\n");
        %>
    </body>
</html>
