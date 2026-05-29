package main.java.crudAPI.demo.model;

import javax.annotation.processing.Generated;

@Entity
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    
}
