package com.example.projetofinal.controllers;

import com.example.projetofinal.jpa.IRepositoryClient;
import com.example.projetofinal.jpa.IRepositoryEmployee;
import com.example.projetofinal.jpa.IRepositoryVehicle;
import com.example.projetofinal.jpa.dao.DAOClient;
import com.example.projetofinal.jpa.dao.DAOEmployee;
import com.example.projetofinal.jpa.dao.DAOVehicle;
import com.example.projetofinal.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {
  @Autowired
  private IRepositoryClient repoClient;
  @Autowired
  private IRepositoryEmployee repoEmployee;
  @Autowired
  private IRepositoryVehicle repoVehicle;

  @RequestMapping("/")
  public String login() {
    return "login";
  }
  @RequestMapping("/new-user")
  public String newUser() {
    return "new-user";
  }
  @RequestMapping("/user-logged")
  public String userLogged() {
    return "user-logged";
  }
  @RequestMapping("/dashboard")
  public String dashboard() {
    return "dashboard";
  }
  @RequestMapping("/client")
  public String client(Model model) {
    DAOClient dc = new DAOClient(repoClient);
    model.addAttribute("clientsList", dc.findClients());
    return "client";
  }
  @RequestMapping("/employee")
  public String employee(Model model) {
    DAOEmployee de = new DAOEmployee(repoEmployee);
    model.addAttribute("employeesList", de.findEmployees());
    return "employee";
  }
  @RequestMapping("/vehicle")
  public String vehicle(Model model) {
    DAOVehicle dv = new DAOVehicle(repoVehicle);
    model.addAttribute("vehiclesList", dv.findVehicles());
    return "vehicle";
  }

  @RequestMapping("/signIn")
  public String fSignIn(@RequestParam String login, @RequestParam String password) {
    if (!login.isEmpty() && !password.isEmpty()) {
      return "dashboard";
    }
    return "login";
  }
  @RequestMapping("/newUser")
  public String fNewUser(User user, Model model, HttpSession session) {
    session.setAttribute("userLogged", user);
    return "user-logged";
  }
  @RequestMapping("/logout")
  public String fLogout(HttpSession session) {
    session.invalidate();
    return "login";
  }
  @RequestMapping("/newClient")
  public String fNewClient(Client client, Address address, Phone phone, Model model) {
    DAOClient dc = new DAOClient(repoClient);

    List<Phone> phones = new ArrayList<Phone>();
    phones.add(phone);

    dc.insertClient(new Client(client, address, phones));

    model.addAttribute("clientsList", dc.findClients());
    return "redirect:client";
  }
  @RequestMapping("/newEmployee")
  public String fNewEmployee(Employee employee, Address address, Phone phone, Model model) {
    DAOEmployee de = new DAOEmployee(repoEmployee);

    List<Phone> phones = new ArrayList<Phone>();
    phones.add(phone);

    de.insertEmployee(new Employee(employee, address, phones));

    model.addAttribute("employeesList", de.findEmployees());
    return "redirect:employee";
  }
  @RequestMapping("/newVehicle")
  public String fNewVehicle(Vehicle vehicle, Model model) {
    DAOVehicle dv = new DAOVehicle(repoVehicle);

    dv.insertVehicle(new Vehicle(vehicle));

    model.addAttribute("vehiclesList", dv.findVehicles());
    return "redirect:vehicle";
  }
}
