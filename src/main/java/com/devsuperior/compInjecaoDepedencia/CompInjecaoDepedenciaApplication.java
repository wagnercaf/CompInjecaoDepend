package com.devsuperior.compInjecaoDepedencia;

import com.devsuperior.compInjecaoDepedencia.entities.Order;
import com.devsuperior.compInjecaoDepedencia.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class CompInjecaoDepedenciaApplication  implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(CompInjecaoDepedenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1034,150,20);
		System.out.println("Pedido código " + order.getCode() );
		System.out.println("Valor Total: " + orderService.total(order));

		order = new Order(2282,800,10);
		System.out.println("Pedido código " + order.getCode() );
		System.out.println("Valor Total: " + orderService.total(order));

		order = new Order(1309,95.90,0);
		System.out.println("Pedido código " + order.getCode() );
		System.out.println("Valor Total: " + orderService.total(order));

	}
}
