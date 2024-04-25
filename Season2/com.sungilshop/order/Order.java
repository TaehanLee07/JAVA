package com.sungilshop.order;

import com.sungilshop.product.Product;
import com.sungilshop.user.User;

public class Order {
    User user = new User();
    Product product = new Product();

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
