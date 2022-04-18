package com.academy.exercise2.service;


import com.academy.exercise2.domain.Prodotti;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProdottiService {

    List<Prodotti> getAll();
    Optional<Prodotti> findById(String id);
    void deleteById(String id);
    void updateName(String id,String name);
    Prodotti insertProduct(Prodotti p);

    @Query(value = "SELECT p.name FROM products p WHERE p.name=?1 ",nativeQuery = true)
    Prodotti findByName(String name);
}
