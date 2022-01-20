package com.example.projetofinal.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vehicle {
  @Id
  @GeneratedValue
  private Long id;
  private String renavam;
  private String brand_model;
  private String board;
  private String color;
  private String fuel;

  public Vehicle(Vehicle vehicle) {
    super();
    this.setRenavam(vehicle.getRenavam());
    this.setBrand_model(vehicle.getBrand_model());
    this.setBoard(vehicle.getBoard());
    this.setColor(vehicle.getColor());
    this.setFuel(vehicle.getFuel());
  }

  public Vehicle() { super(); }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getRenavam() {
    return renavam;
  }

  public void setRenavam(String renavam) {
    this.renavam = renavam;
  }

  public String getBrand_model() {
    return brand_model;
  }

  public void setBrand_model(String brand_model) {
    this.brand_model = brand_model;
  }

  public String getBoard() {
    return board;
  }

  public void setBoard(String board) {
    this.board = board;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getFuel() {
    return fuel;
  }

  public void setFuel(String fuel) {
    this.fuel = fuel;
  }
}
