package com.academy.exercise2.repository;


import com.academy.exercise2.domain.Ordini;
import com.academy.exercise2.domain.Prodotti;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdiniRepository extends JpaRepository<Ordini,String> {

    Prodotti findByNumProdotto(String numProdotto);
}
