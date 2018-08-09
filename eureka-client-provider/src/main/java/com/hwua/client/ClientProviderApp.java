package com.hwua.client;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientProviderApp {

	public static void main(String[] args) {
		
		int port =8081;
//		System.out.println("请输入端口：");
//		Scanner input = new Scanner(System.in);
//		port= input.nextInt();
		new SpringApplicationBuilder(ClientProviderApp.class)
		.properties("server.port="+port)
		.run(args);
		
		

	}

}
