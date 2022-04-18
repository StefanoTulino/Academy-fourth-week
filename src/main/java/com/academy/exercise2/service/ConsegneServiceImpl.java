package com.academy.exercise2.service;

import com.academy.exercise2.domain.Consegne;
import com.academy.exercise2.domain.Prodotti;
import com.academy.exercise2.repository.ConsegneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ConsegneServiceImpl implements ConsegneService {

    @Autowired
    ConsegneRepository consegneRepository;


    @Override
    public List<Consegne> getAll() {

        return consegneRepository.findAll();
    }

    @Override
    public Optional<Consegne> findById(String id) {
        return consegneRepository.findById(id);
    }

    @Override
    public void deleteById(String id) {
        consegneRepository.deleteById(id);
    }


    @Override
    public Consegne insertConsegna(Consegne c) {
        return consegneRepository.save(c);
    }



    @Override
    public void updateConsegnato(String id,boolean b) {
        Optional<Consegne> c = consegneRepository.findById(id);
        if (c.isPresent()) {
            Consegne consegna = c.get();
            consegna.setConsegnato(b);
            consegneRepository.save(consegna);
        }
    }

}


