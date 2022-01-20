package com.example.projetofinal.jpa.dao;

import com.example.projetofinal.jpa.IRepositoryClient;
import com.example.projetofinal.jpa.IRepositoryEmployee;
import com.example.projetofinal.model.Client;
import com.example.projetofinal.model.Employee;

import java.util.List;

public class DAOEmployee {
  private IRepositoryEmployee re;

  public DAOEmployee(IRepositoryEmployee re) { this.re = re; }

  public IRepositoryEmployee getRe() { return re; }

  public void setRc(IRepositoryEmployee re) { this.re = re; }

  public void insertEmployee(Employee e) { this.re.save(e); }

  public List<Employee> findEmployees() {
    return (List<Employee>)this.re.findAll();
  }
}
