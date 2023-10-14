package br.com.myapi.ecommerceapiproducts.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "segment")
public class Segment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Boolean is_active = true;
}
