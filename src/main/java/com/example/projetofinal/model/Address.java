package com.example.projetofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
  @Id
  @GeneratedValue
  private Long id;
  private String street;
  private String number_address;
  private String complement;
  private String cep;
  private String city;
  private String state;

  public Address(String street, String number_address, String complement, String cep, String city, String state) {
    super();
    this.street = street;
    this.number_address = number_address;
    this.complement = complement;
    this.cep = cep;
    this.city = city;
    this.state = state;
  }

  public Address() { super(); }

  @Override
  public String toString() {
    return "[ Rua: " + this.street + ", Número: " + this.number_address + ", Complemento: " + this.complement +
      ", Cep: " + this.cep + ", Cidade: " + this.city + ", Estado: " + this.state + " ]";
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getNumber_address() { return number_address; }

  public void setNumber_address(String number_address) {
    this.number_address = number_address;
  }

  public String getComplement() {
    return complement;
  }

  public void setComplement(String complement) {
    this.complement = complement;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}
