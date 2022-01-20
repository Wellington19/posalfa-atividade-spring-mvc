package com.example.projetofinal.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String cpf;

  @OneToOne(cascade = CascadeType.ALL)
  private Address address;

  @OneToMany(cascade = CascadeType.ALL)
  private List<Phone> phones;

  public Client(String name, String cpf, Address address) {
    super();
    this.setName(name);
    this.setCpf(cpf);
    this.setAddress(address);
  }

  public Client(String name, String cpf, Address address, List<Phone> phones) {
    super();
    this.setName(name);
    this.setCpf(cpf);
    this.setAddress(address);
    this.setPhones(phones);
  }

  public Client(String name, String cpf) {
    super();
    this.setName(name);
    this.setCpf(cpf);
  }

  public Client(Client client, Address address, List<Phone> phones) {
    super();
    this.setName(client.getName());
    this.setCpf(client.getCpf());
    this.setAddress(address);
    this.setPhones(phones);
  }

  public Client() { super(); }

  @Override
  public String toString() {
    return "{ id: " + this.id + ", name: " + '"' + this.name + '"' + ", cpf: " + '"' + this.cpf + '"' + ", address: " + '"' + this.address.getStreet() +
      ", " + this.address.getNumber_address() + ", " + this.address.getComplement()  + '"' +
      ", cep: " + '"' + this.address.getCep() + '"' + ", city: " + '"' + this.address.getCity() + "-" + this.address.getState() + '"' + " }";
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

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public List<Phone> getPhones() {
    return phones;
  }

  public void setPhones(List<Phone> phones) {
    this.phones = phones;
  }
}
