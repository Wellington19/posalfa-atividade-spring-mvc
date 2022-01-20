package com.example.projetofinal.jpa;

import com.example.projetofinal.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRepositoryEmployee extends CrudRepository<Employee, Long> {
  public List<Employee> findEmployeeByCpf(String cpf);
}
