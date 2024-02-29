package com.inaing.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cartItem")
@NoArgsConstructor
@Data
public class CartItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;

    private Double cost;

    @ManyToOne
    @JoinColumn(name = "colorID")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "sizeID")
    private Size size;

    @ManyToOne
    @JoinColumn(name = "productID")
    private Product product;

    @ManyToOne
    private Order order;

}
