package com.academy.exercise2.service;


import com.academy.exercise2.domain.Ordini;
import com.academy.exercise2.domain.Prodotti;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OrdiniService {
    List<Ordini> getAll();
    Optional<Ordini> findById(String id);
    void deleteById(String id);
    void updateNumberProduct(String id,Integer numProduct);
    Ordini insertOrder(Ordini o);

    //@Query(value = "SELECT * FROM orders o WHERE o.numProdotto=?1 ",nativeQuery = true)
    //Prodotti findByNumProdotto(String numProdotto);

}
