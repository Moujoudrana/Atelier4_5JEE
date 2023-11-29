package org.sid.orderservice.model;

import lombok.Data;
//on a creer cette classe si jamais on veut le detailu du produit dans productItem non seulement lid
@Data
public class Product {
    private Long id;
    private String name;
    private double price;
    private int quantity;
}
