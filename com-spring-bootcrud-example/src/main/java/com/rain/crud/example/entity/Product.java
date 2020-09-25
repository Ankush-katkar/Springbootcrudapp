package com.rain.crud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PRODUCT_TBL")
@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String quantity;
    private Double price;
    private String company;


}
