package com.academy.exercise2.service;

import com.academy.exercise2.domain.Consegne;


import java.util.List;
import java.util.Optional;

public interface ConsegneService {
    List<Consegne> getAll();
    Optional<Consegne> findById(String id);
    void deleteById(String id);
    void updateConsegnato(String id,boolean c);
    Consegne insertConsegna(Consegne c);

}
