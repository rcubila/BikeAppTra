package com.globomatics.bike.controller;
import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/bikes")
public class BIkesController {

    @Autowired
    private BikeRepository bikeRepository;

    @GetMapping
    public List<Bike> list(){
       return bikeRepository.findAll();
     }

     @PostMapping("/save")
     @ResponseStatus(HttpStatus.OK)
     public void create(@RequestBody Bike bike){
        bikeRepository.save(bike);
     }
    @GetMapping("/{id}")
     public Bike get(@PathVariable ("id") long id){
       return bikeRepository.findById( id);
     }
}
