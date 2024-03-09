package com.desafio.Desafio.Dependencia.services;

import org.springframework.stereotype.Service;

import com.desafio.Desafio.Dependencia.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		double valorFrete = 0.0;
		
		if(order.getBasic() < 100) {
			valorFrete = 20.0;
		} else if(order.getBasic() >= 100 && order.getBasic() < 200) {
			valorFrete = 12.0;
		}
		
		return valorFrete;
	}
	
}
