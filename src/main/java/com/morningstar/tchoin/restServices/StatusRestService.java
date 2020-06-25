package com.morningstar.tchoin.restServices;

import ch.qos.logback.core.status.StatusUtil;
import com.morningstar.tchoin.entities.Accessoire;
import com.morningstar.tchoin.entities.Status;
import com.morningstar.tchoin.repositories.AccessoireRopository;
import com.morningstar.tchoin.repositories.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/listStatus"})
public class StatusRestService {
   @Autowired
   private StatusRepository statusRepository;

   @GetMapping({""})
   public List<Status> listStatus() {
      return this.statusRepository.findAll();
   }

   @GetMapping({"/{id}"})
   public Status statusPerId(@PathVariable(name = "id") Long id) {
      return this.statusRepository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Status updateStatus(@PathVariable(name = "id") Long id, @RequestBody Status status) {
      status.setId(id);
      return this.statusRepository.save(status);
   }

   @PostMapping({""})
   public Status saveStatus(@RequestBody Status status) {
      return this.statusRepository.save(status);
   }

   @DeleteMapping({"/{id}"})
   public void deleteStatus(@PathVariable(name = "id") Long id) {
      this.statusRepository.deleteById(id);
   }

   @GetMapping({"/search/byStatus"})
   public List<Status> mappingStatus(@RequestParam("status") String status) {
      return this.statusRepository.findAccessoiresByLibelleContains(status);
   }
}
