package com.sungilshop.order;

import com.sungilshop.product.Product;
import com.sungilshop.user.User;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
