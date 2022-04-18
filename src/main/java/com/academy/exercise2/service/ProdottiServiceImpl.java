package com.academy.exercise2.service;

import com.academy.exercise2.domain.Ordini;
import com.academy.exercise2.domain.Prodotti;
import com.academy.exercise2.repository.ProdottiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProdottiServiceImpl implements  ProdottiService{

    @Autowired
    ProdottiRepository prodottiRepository;


    @Override
    public List<Prodotti> getAll() {
        return prodottiRepository.findAll();
    }

    @Override
    public Optional<Prodotti> findById(String id) {
        return prodottiRepository.findById(id);
    }

    @Override
    public void deleteById(String id) {
         prodottiRepository.deleteById(id);
    }

    //MANCA PUT
    @Override
    public void updateName(String id,String name) {
        Optional<Prodotti> p = prodottiRepository.findById(id);
        if (p.isPresent()) {
            Prodotti product = p.get();
            product.setName(name);
            prodottiRepository.save(product);
        }
    }

    @Override
    public Prodotti insertProduct(Prodotti p) {
        return prodottiRepository.save(p);
    }

    @Override
    public Prodotti findByName(String name) {
        return prodottiRepository.findByName(name);
    }
}
