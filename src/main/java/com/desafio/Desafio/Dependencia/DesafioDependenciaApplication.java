package com.desafio.Desafio.Dependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.Desafio.Dependencia.entities.Order;
import com.desafio.Desafio.Dependencia.services.OrderService;

@SpringBootApplication
public class DesafioDependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1309, 95.90, 0.0);

		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: " + String.format("%.2f", orderService.total(order)));

	}
}
