package com.devsuperior.compInjecaoDepedencia.services;

import com.devsuperior.compInjecaoDepedencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order)
    {
        double valorPedido = order.getBasic() - ((order.getBasic()  * order.getDiscount())/100);
        double ValorTotal = 0;

        if (valorPedido < 100 ){
            ValorTotal = valorPedido + 20;
        } else if (valorPedido >=100 && valorPedido < 200) {
            ValorTotal = valorPedido + 12;
        }else if (valorPedido >= 200){
            ValorTotal = valorPedido;
        }
        return ValorTotal;
    }
}
