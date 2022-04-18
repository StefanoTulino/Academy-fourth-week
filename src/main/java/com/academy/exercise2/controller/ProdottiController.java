package com.academy.exercise2.controller;


import com.academy.exercise2.domain.Prodotti;
import com.academy.exercise2.service.ProdottiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/ex2/product")
public class ProdottiController {

    @Autowired
    ProdottiService prodottiService;

    @GetMapping(path = "/{id}")
    ResponseEntity<?> findById(@PathVariable String id){
        Optional<Prodotti> s= prodottiService.findById(id);
        return new ResponseEntity(s, HttpStatus.OK);
    }

    @GetMapping(path = "/searchName")
    ResponseEntity<?> findByName(@RequestParam String name){
        Prodotti p= prodottiService.findByName(name);
        return new ResponseEntity(p, HttpStatus.OK);
    }

    @GetMapping(path = "/getAll")
    ResponseEntity<List<Prodotti>> findAll(){
        return new ResponseEntity<>(prodottiService.getAll(), HttpStatus.OK);

    }

    @PostMapping(path = "/insert")
    public ResponseEntity<Prodotti> get(@RequestBody Prodotti p){
        return new ResponseEntity(prodottiService.insertProduct(p), HttpStatus.OK);
    }


    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> deleteById(@PathVariable String id){
        prodottiService.deleteById(id);
        return  new ResponseEntity<Void>( HttpStatus.OK);
    }

    @PutMapping(path = "/changeName")
    ResponseEntity<?> changeName(@RequestParam String id,@RequestParam String name ){
        prodottiService.updateName(id,name);
        return new ResponseEntity("change name", HttpStatus.OK);
    }
}
