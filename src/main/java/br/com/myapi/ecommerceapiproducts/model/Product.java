package br.com.myapi.ecommerceapiproducts.model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double price;
    private String details;
    private boolean is_active;
    private int segment_id;
}
