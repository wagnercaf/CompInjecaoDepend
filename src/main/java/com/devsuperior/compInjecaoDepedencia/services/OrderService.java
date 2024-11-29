package com.devsuperior.compInjecaoDepedencia.services;

import com.devsuperior.compInjecaoDepedencia.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        return shippingService.shipment(order);
    }
}
