package com.inaing.app.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import io.micrometer.common.lang.NonNull;
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
import lombok.val;

@Entity
@Table(name = "cartItem")
@NoArgsConstructor
@Data
public class CartItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private Integer quantity;

    @NonNull
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
    @JoinColumn(name = "orderID")
    @JsonBackReference(value = "order-cart")
    private Order _order;

}
