<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>RentalCar | Usuário logado</title>
</head>
<body>
  Usuário logado no momento:
  <c:out value="${sessionScope.userLogged}"/>
  <br><br>

  <a href="/logout">Logout</a>
</body>
</html>