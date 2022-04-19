package com.academy.exercise2.repository;


import com.academy.exercise2.domain.Prodotti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottiRepository extends JpaRepository<Prodotti,String> {


    Prodotti findByName(String name);
}


