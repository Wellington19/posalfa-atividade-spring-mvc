package com.example.projetofinal.jpa.dao;

import com.example.projetofinal.jpa.IRepositoryVehicle;
import com.example.projetofinal.model.Vehicle;

import java.util.List;

public class DAOVehicle {
  private IRepositoryVehicle rv;

  public DAOVehicle(IRepositoryVehicle rv) { this.rv = rv; }

  public IRepositoryVehicle getRv() { return rv; }

  public void setRv(IRepositoryVehicle rv) { this.rv = rv; }

  public void insertVehicle(Vehicle v) { this.rv.save(v); }

  public List<Vehicle> findVehicles() {
    return (List<Vehicle>)this.rv.findAll();
  }
}
