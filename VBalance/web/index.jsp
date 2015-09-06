<%-- 
    Document   : index
    Created on : 31/08/2015, 23:52:36
    Author     : Mr Menezes
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="empresaBeam" class="br.com.vbalance.bean.EmpresaBean"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empresas</title>
    </head>
    <body>
        <table>
            <!-- here should go some titles... -->
            <tr>
                <th>Empresa ID</th>
                <th>Nome</th>
                <th>Carga Horária</th>
            </tr>
           
            <c:forEach items="${empresaBeam.arrayList}" var="empresa">
                <tr>
                    <td>
                        <c:out value="${empresa.empresaId}" />
                    </td>
                    <td>
                        <c:out value="${empresa.nome}" />
                    </td>
                    <td>
                        <c:out value="${empresa.cargaHoraria}" />
                    </td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
