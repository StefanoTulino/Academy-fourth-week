package com.academy.exercise2.service;

import com.academy.exercise2.domain.Ordini;
import com.academy.exercise2.domain.Prodotti;
import com.academy.exercise2.repository.OrdiniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdiniServiceImpl implements  OrdiniService{

    @Autowired
    OrdiniRepository ordiniRepository;

    @Override
    public List<Ordini> getAll() {
        return ordiniRepository.findAll();
    }

    @Override
    public Optional<Ordini> findById(String id) {
        return ordiniRepository.findById(id);
    }

    @Override
    public void deleteById(String id) {
        ordiniRepository.deleteById(id);
    }

    @Override

    public void updateNumberProduct(String id,Integer numProduct) {
        Optional<Ordini> o = ordiniRepository.findById(id);
        if (o.isPresent()) {
            Ordini order = o.get();
            order.setNumProdotto(numProduct);
            ordiniRepository.save(order);
           }
        }

    @Override
    public Ordini insertOrder(Ordini o) {
        return ordiniRepository.save(o);
    }


}
