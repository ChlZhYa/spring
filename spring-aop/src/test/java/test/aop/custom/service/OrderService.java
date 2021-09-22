package test.aop.custom.service;

import test.aop.custom.entity.Order;

public interface OrderService {

    Order createOrder(String username, String product);

    Order queryOrder(String username);

}
