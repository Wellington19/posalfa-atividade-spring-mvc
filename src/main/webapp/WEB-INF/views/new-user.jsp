<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>RentalCar | Cadastro de usuário</title>
</head>
<body>
  <h2>Cadastro de usuários</h2>

  <form method="post" action="/newUser">
    Nome completo: <input type="text" name="name" size="20"> <br>
    Endereço: <input type="text" name="address" size="40"> <br>
    Telefone: <input type="text" name="phone" size="20"> <br>

    Login: <input type="text" name="login" size="20"> <br>
    Senha: <input type="password" name="password" size="20"> <br>

    <button type="submit">Salvar</button>
  </form>
</body>
</html>