package com.example.projetofinal.model;

public class User {
  private Long id;
  private String name;
  private String address;
  private String phone;

  private String login;
  private String password;

  public User() { super(); }

  @Override
  public String toString() {
    return "[ Nome: " + this.name + ", Endereço: " + this.address + ", Telefone: " + this.phone + " ]";
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
