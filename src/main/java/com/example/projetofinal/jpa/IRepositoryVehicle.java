package com.example.projetofinal.jpa;

import com.example.projetofinal.model.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRepositoryVehicle extends CrudRepository<Vehicle, Long> {
  public List<Vehicle> findVehicleByRenavam(String renavam);
}
