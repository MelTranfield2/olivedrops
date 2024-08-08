package com.olivedrops.pele.repository;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type; // e.g., lipstick, eyeshadow
    private String color;
    private String brand;
    private String imageUrl;
    private BigDecimal price;
    private String description;
    private float rating;
}

