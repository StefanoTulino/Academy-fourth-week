package com.academy.exercise2.controller;

import com.academy.exercise2.domain.Ordini;
import com.academy.exercise2.service.OrdiniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/ex2/order")
public class OrdiniController {

    @Autowired
    OrdiniService ordiniService;

    @GetMapping(path = "/{id}")
    ResponseEntity<?> findById(@PathVariable String id){
        Optional<Ordini> s= ordiniService.findById(id);
        return new ResponseEntity(s, HttpStatus.OK);
    }



    @GetMapping(path = "/getAll")
    ResponseEntity<List<Ordini>> findAll(){
        return new ResponseEntity<>(ordiniService.getAll(), HttpStatus.OK);

    }

    @PostMapping(path = "/insert")
    public ResponseEntity<Ordini> get(@RequestBody Ordini p){
        return new ResponseEntity(ordiniService.insertOrder(p), HttpStatus.OK);
    }


    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> deleteById(@PathVariable String id){
        ordiniService.deleteById(id);
        return  new ResponseEntity<Void>( HttpStatus.OK);
    }

    @PutMapping(path = "/{id}")
    ResponseEntity<?> updateNumberProduct(@PathVariable String id,@RequestParam Integer numProduct){
        ordiniService.updateNumberProduct(id,numProduct);
        return new ResponseEntity("change numberProduct", HttpStatus.OK);
    }

}
