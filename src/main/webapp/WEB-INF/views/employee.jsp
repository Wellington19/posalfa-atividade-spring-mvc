<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

  <title>RentalCar | Funcionários</title>

  <style>
    .bd-placeholder-img {
      font-size: 1.125rem;
      text-anchor: middle;
      -webkit-user-select: none;
      -moz-user-select: none;
      user-select: none;
    }

    @media (min-width: 768px) {
      .bd-placeholder-img-lg {
        font-size: 3.5rem;
      }
    }

    body {
      font-size: .875rem;
    }

    .feather {
      width: 16px;
      height: 16px;
      vertical-align: text-bottom;
    }

    /*
     * Sidebar
     */

    .sidebar {
      position: fixed;
      top: 0;
      /* rtl:raw:
      right: 0;
      */
      bottom: 0;
      /* rtl:remove */
      left: 0;
      z-index: 100; /* Behind the navbar */
      padding: 48px 0 0; /* Height of navbar */
      box-shadow: inset -1px 0 0 rgba(0, 0, 0, .1);
    }

    @media (max-width: 767.98px) {
      .sidebar {
        top: 5rem;
      }
    }

    .sidebar-sticky {
      position: relative;
      top: 0;
      height: calc(100vh - 48px);
      padding-top: .5rem;
      overflow-x: hidden;
      overflow-y: auto; /* Scrollable contents if viewport is shorter than content. */
    }

    .sidebar .nav-link {
      font-weight: 500;
      color: #333;
    }

    .sidebar .nav-link .feather {
      margin-right: 4px;
      color: #727272;
    }

    .sidebar .nav-link.active {
      color: #2470dc;
    }

    .sidebar .nav-link:hover .feather,
    .sidebar .nav-link.active .feather {
      color: inherit;
    }

    .sidebar-heading {
      font-size: .75rem;
      text-transform: uppercase;
    }

    /*
     * Navbar
     */

    .navbar-brand {
      padding-top: .75rem;
      padding-bottom: .75rem;
      font-size: 1rem;
      background-color: rgba(0, 0, 0, .25);
      box-shadow: inset -1px 0 0 rgba(0, 0, 0, .25);
    }

    .navbar .navbar-toggler {
      top: .25rem;
      right: 1rem;
    }

    .navbar .form-control {
      padding: .75rem 1rem;
      border-width: 0;
      border-radius: 0;
    }

    .form-control-dark {
      color: #fff;
      background-color: rgba(255, 255, 255, .1);
      border-color: rgba(255, 255, 255, .1);
    }

    .form-control-dark:focus {
      border-color: transparent;
      box-shadow: 0 0 0 3px rgba(255, 255, 255, .25);
    }
  </style>
</head>
<body>
  <header class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
    <a class="navbar-brand col-md-3 col-lg-2 me-0 px-3" href="/dashboard">RentalCar</a>
    <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
  </header>

  <div class="container-fluid">
    <div class="row">
      <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
        <div class="position-sticky pt-3">
          <ul class="nav flex-column">
            <li class="nav-item">
              <a class="nav-link" aria-current="page" href="/dashboard">
                Dashboard
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/client">
                Clientes
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/employee">
                Funcionários
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/vehicle">
                Veículos
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/logout" style="text-decoration: none;color: red">
                Logout
              </a>
            </li>
          </ul>
        </div>
      </nav>

      <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4 pt-3">
        <h2>Funcionários</h2>

        <form method="post" action="/newEmployee">
          <div class="row">
            <div class="form-group col-md-6">
              <label for="name">Nome</label>
              <input type="text" class="form-control" id="name" name="name" placeholder="" autocomplete="off">
            </div>
            <div class="form-group col-md-6">
              <label for="cpf">CPF</label>
              <input type="text" class="form-control" id="cpf" name="cpf" placeholder="" autocomplete="off">
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-4">
              <label for="street">Logradouro</label>
              <input type="text" class="form-control" id="street" name="street" placeholder="Rua, Av..." autocomplete="off">
            </div>
            <div class="form-group col-md-4">
              <label for="number_address">Número</label>
              <input type="text" class="form-control" id="number_address" name="number_address" placeholder="" autocomplete="off">
            </div>
            <div class="form-group col-md-4">
              <label for="complement">Complemento</label>
              <input type="text" class="form-control" id="complement" name="complement" placeholder="" autocomplete="off">
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-4">
              <label for="city">Cidade</label>
              <input type="text" class="form-control" id="city" name="city" placeholder="" autocomplete="off">
            </div>
            <div class="form-group col-md-4">
              <label for="state">Estado</label>
              <input type="text" class="form-control" id="state" name="state" placeholder="" autocomplete="off">
            </div>
            <div class="form-group col-md-4">
              <label for="cep">CEP</label>
              <input type="text" class="form-control" id="cep" name="cep" placeholder="" autocomplete="off">
            </div>
          </div>
          <div class="row">
            <div class="form-group col-md-1">
              <label for="ddd">DDD</label>
              <input type="text" class="form-control" id="ddd" name="ddd" placeholder="" autocomplete="off">
            </div>
            <div class="form-group col-md-3">
              <label for="number">Telefone</label>
              <input type="text" class="form-control" id="number" name="number" placeholder="" autocomplete="off">
            </div>
          </div>

          <button type="submit" class="btn btn-primary mt-3 mb-3">Salvar</button>
        </form>

        <div class="table-responsive">
          <table class="table table-striped table-sm">
            <thead>
            <tr>
              <th scope="col">#</th>
              <th scope="col">Nome</th>
              <th scope="col">CPF</th>
              <th scope="col">Endereço</th>
              <th scope="col">CEP</th>
              <th scope="col">Cidade</th>
              <th scope="col">Telefone</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="employee" items="${employeesList}" >
              <tr>
                <td><c:out value="${employee.id}" /></td>
                <td><c:out value="${employee.name}" /></td>
                <td><c:out value="${employee.cpf}" /></td>
                <td><c:out value="${employee.address.street}, ${employee.address.number_address}, ${employee.address.complement}" /></td>
                <td><c:out value="${employee.address.cep}" /></td>
                <td><c:out value="${employee.address.city} - ${employee.address.state}" /></td>
                <td><c:out value="(${employee.phones[0].ddd}) ${employee.phones[0].number}" /></td>
              </tr>
            </c:forEach>
            </tbody>
          </table>
        </div>
      </main>
    </div>
  </div>
</body>
</html>