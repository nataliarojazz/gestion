<%-- 
    Document   : GestionP
    Created on : 30/09/2022, 9:46:04 p. m.
    Author     : Profesional
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PACIENTES</title>
    </head>
    <body>
        <h1>LISTA PACIENTES</h1>
        <%@ page import="java.util.List" %>
        <%@ page import="GS.Paciente" %>
        <h2><% 
           out.print("LISTA DE PACIENTES");
               Paciente pa = new Paciente("CARLOS", "BERMUDEZ", "CALLE16#3-06", "COVID-19", "DR.JORGE GONZALES", "FAMISANAR", "30-SEP-2022", 1, 'M');
               pa.mostrar();
               System.out.println("\n");
               Paciente pa1 = new Paciente("SOFIA", "ROSERO", "CALLE20#8-06", "VARICELA", "DRA.YEIMMY OCHOA", "ECOOPSOS", "31-SEP-2022", 2, 'F');
               pa1.mostrar();
               System.out.println("\n");
               Paciente tc = new Paciente("SOFIA", "ROSERO", "CALLE20#8-06", "VARICELA", "DRA.YEIMMY OCHOA", "ECOOPSOS", "31-SEP-2022", 2, 'F');
               out.print(tc.mostrar2());
            %> </h2>

    </body>
</html>
