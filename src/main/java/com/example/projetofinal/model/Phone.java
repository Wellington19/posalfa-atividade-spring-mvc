package com.example.projetofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Phone {
  @Id
  @GeneratedValue
  private Long id;
  private String ddd;
  private String number;

  public Phone(String ddd, String number) {
    super();
    this.ddd = ddd;
    this.number = number;
  }

  public Phone() { super(); }

  @Override
  public String toString() {
    return "[ DDD: " + this.ddd + ", Número: " + this.number + " ]";
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDdd() {
    return ddd;
  }

  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
}
