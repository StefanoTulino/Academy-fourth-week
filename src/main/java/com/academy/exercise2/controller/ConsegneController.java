package com.academy.exercise2.controller;

import com.academy.exercise2.domain.Consegne;
import com.academy.exercise2.repository.ConsegneRepository;
import com.academy.exercise2.service.ConsegneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/ex2/delivery")
public class ConsegneController {

    @Autowired
    ConsegneService consegneService;


    @GetMapping(path = "/{id}")
    ResponseEntity<?> findById(@PathVariable String id){
        Optional<Consegne> s= consegneService.findById(id);
        return new ResponseEntity(s, HttpStatus.OK);
    }

    @GetMapping(path = "/getAll")
    ResponseEntity<List<Consegne>> findAll(){
        return new ResponseEntity<>(consegneService.getAll(), HttpStatus.OK);

    }

    @PostMapping(path = "/insert")
    public ResponseEntity<Consegne> get(@RequestBody Consegne c){
        return new ResponseEntity(consegneService.insertConsegna(c), HttpStatus.OK);
    }


    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> deleteById(@PathVariable String id){
        consegneService.deleteById(id);
        return  new ResponseEntity<Void>( HttpStatus.OK);
    }


    @PutMapping(path = "/changeStatus/{id}/{consegnato}")
    ResponseEntity<?> changeStatus(@PathVariable String id,@PathVariable boolean consegnato ){
        consegneService.updateConsegnato(id,consegnato);
        return new ResponseEntity("change status delivery", HttpStatus.OK);
    }

   

}
