<%@ page import="edu.umg.model.Criptomoneda" %><%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 19/03/2022
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>

<%
    Criptomoneda cripto = (Criptomoneda) request.getAttribute("data");
%>

<table class="table table-dark">
    <thead>
    <tr>
        <th scope="col">NOmbre</th>
        <th scope="col">acronimo</th>
        <th scope="col">valor</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td><%= cripto.getNombre()%></td>
        <td><%= cripto.getAcronimo()%></td>
        <td><%= cripto.getValor()%></td>
    </tr>

    </tbody>
</table>

<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>

</body>
</html>
