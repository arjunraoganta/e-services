package com.arjun.eservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EServicesApplication {
public static void main(String[] args) {
	SpringApplication.run(EServicesApplication.class, args);
}
}
