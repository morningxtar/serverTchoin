package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Client;
import com.morningstar.tchoin.repositories.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/listClients"})
public class ClientRestService {
   @Autowired
   private ClientRepository clientRepository;

   @GetMapping({""})
   public List<Client> clients() {
      return this.clientRepository.findAll();
   }

   @GetMapping({"/{id}"})
   public Client client(@PathVariable(name = "id") Long id) {
      return (Client)this.clientRepository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Client update(@PathVariable(name = "id") Long id, @RequestBody Client client) {
      client.setId(id);
      return this.clientRepository.save(client);
   }

   @PostMapping({""})
   public Client saveClient(@RequestBody Client client) {
      return (Client)this.clientRepository.save(client);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.clientRepository.deleteById(id);
   }

   @GetMapping({"/search/byUsernameAndPassword"})
   public Client client(@RequestParam("username") String username, @RequestParam("password") String password) {
      return this.clientRepository.findClientByUsernameAndPassword(username, password);
   }
}
