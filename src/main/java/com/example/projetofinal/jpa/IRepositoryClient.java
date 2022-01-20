package com.example.projetofinal.jpa;

import com.example.projetofinal.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRepositoryClient extends CrudRepository<Client, Long> {
  public List<Client> findClientByCpf(String cpf);
}
