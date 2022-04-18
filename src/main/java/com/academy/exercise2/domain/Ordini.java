package com.academy.exercise2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="orders")
public class Ordini {

    @Id private String id;
    private int numProdotto;

}
