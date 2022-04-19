package com.academy.exercise2.repository;


import com.academy.exercise2.domain.Consegne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsegneRepository extends JpaRepository<Consegne,String> {

    
}
