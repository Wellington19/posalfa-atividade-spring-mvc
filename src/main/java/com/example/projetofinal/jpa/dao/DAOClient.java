package com.example.projetofinal.jpa.dao;

import com.example.projetofinal.jpa.IRepositoryClient;
import com.example.projetofinal.model.Client;

import java.util.List;

public class DAOClient {
  private IRepositoryClient rc;

  public DAOClient(IRepositoryClient rc) { this.rc = rc; }

  public IRepositoryClient getRc() { return rc; }

  public void setRc(IRepositoryClient rc) { this.rc = rc; }

  public void insertClient(Client c) { this.rc.save(c); }

  public List<Client> findClients() {
    return (List<Client>)this.rc.findAll();
  }
}
