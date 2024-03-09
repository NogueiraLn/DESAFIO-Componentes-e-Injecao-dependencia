package com.desafio.Desafio.Dependencia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.Desafio.Dependencia.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;

	public double total(Order order) {
		double disc = order.getBasic() * order.getDiscount() / 100;
		return order.getBasic() - disc + shippingService.shipment(order);
	}

}
