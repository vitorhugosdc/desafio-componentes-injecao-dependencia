package com.vitor.desafio;

import com.vitor.desafio.entities.Order;
import com.vitor.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    @Autowired
    OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Code: ");
        int code = sc.nextInt();
        System.out.print("Basic: ");
        double basic = sc.nextDouble();
        System.out.print("Discount: ");
        double discount = sc.nextDouble();

        Order order = new Order(code, basic, discount);

        System.out.println("Pedido código " + order.getCode());
        System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order)));
        sc.close();
    }
}
