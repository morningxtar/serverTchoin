package com.morningstar.tchoin.restServices;

import com.morningstar.tchoin.entities.Photo;
import com.morningstar.tchoin.repositories.PhotoRepository;
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
@RequestMapping({"/listPhotos"})
public class PhotoRestService {
   @Autowired
   private PhotoRepository photoRepository;

   @GetMapping({""})
   public List<Photo> photos() {
      return this.photoRepository.findAll();
   }

   @GetMapping({"/{id}"})
   public Photo photo(@PathVariable(name = "id") Long id) {
      return (Photo)this.photoRepository.findById(id).get();
   }

   @PutMapping({"/{id}"})
   public Photo update(@PathVariable(name = "id") Long id, @RequestBody Photo photo) {
      photo.setId(id);
      return (Photo)this.photoRepository.save(photo);
   }

   @PostMapping({""})
   public Photo saveAccessoire(@RequestBody Photo photo) {
      return (Photo)this.photoRepository.save(photo);
   }

   @DeleteMapping({"/{id}"})
   public void delete(@PathVariable(name = "id") Long id) {
      this.photoRepository.deleteById(id);
   }

   @GetMapping({"/search/byPrestataire"})
   public List<Photo> photos(@RequestParam("prestataire") Long prestataire) {
      return this.photoRepository.findPhotosByIdPrestataire(prestataire);
   }
}
