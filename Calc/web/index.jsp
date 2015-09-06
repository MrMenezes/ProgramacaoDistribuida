<%-- 
    Document   : index.jsp
    Created on : 29/08/2015, 10:57:06
    Author     : Mr Menezes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Fatorial!</h1>
        <%
            int num = Integer.parseInt(request.getParameter("fatnum"));
            int fat = num;

       
           
            for(int i = 1;i < num; i++){
                fat = fat * i;
            }
            out.println("Fatorial: "+ fat);
            
            
            %>
    </body>
</html>
