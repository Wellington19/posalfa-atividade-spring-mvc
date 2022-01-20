package com.example.projetofinal;

import com.example.projetofinal.jpa.IRepositoryClient;
import com.example.projetofinal.jpa.dao.DAOClient;
import com.example.projetofinal.model.Address;
import com.example.projetofinal.model.Client;
import com.example.projetofinal.model.Phone;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProjetoFinalApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProjetoFinalApplication.class, args);
  }

  @Bean
  public CommandLineRunner run(IRepositoryClient repo) {
    return (args) -> {
      //DAOClient dc = new DAOClient(repo);
      //Address address1 = new Address("Rua Diamante","115","","87207-276","Cianorte","PR");
      //Address address2 = new Address("Rua Mario Lago","33","","87207-376","Cianorte","PR");
      //List<Phone> phones = new ArrayList<Phone>();
      //phones.add(new Phone("44","99816-3607"));
      //phones.add(new Phone("44","99926-3205"));

      //List<Phone> phones2 = new ArrayList<Phone>();
      //phones2.add(new Phone("44","99816-3608"));
      //phones2.add(new Phone("44","99926-3206"));

      //dc.insertClient(new Client("Wellington","123456789100",address1,phones));
      //dc.insertClient(new Client("Teste","12300000000",address2,phones2));
      //System.out.println(dc.findClients());
    };
  }
}
