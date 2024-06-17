package com.vitor.desafio.services;

import com.vitor.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        if (order.getBasic() < 100) {
            return 20.0;
        }
        if (order.getBasic() > 200) {
            return 0.0;
        }
        return 12.0;
    }
}
