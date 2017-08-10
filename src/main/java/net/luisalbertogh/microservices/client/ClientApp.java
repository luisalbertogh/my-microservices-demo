/**
 * Client app.
 */
package net.luisalbertogh.microservices.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @author loga
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false) // Disable component scanner
public class ClientApp {
	/**
	 * URL uses the logical name of rider-service - upper or lower case,
	 * doesn't matter.
	 */
	public static final String RIDERS_SERVICE_URL = "http://RIDERS-SERVICE";
	
	/**
	 * Balanced REST template.
	 * @return
	 */
	@LoadBalanced
	@Bean
	protected RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	
	
	/**
	 * Run the application using Spring Boot and an embedded servlet engine.
	 * 
	 * @param args
	 *            Program arguments - ignored.
	 */
	public static void main(String[] args) {
		/* Tell server to look for web-server.properties or web-server.yml */
		System.setProperty("spring.config.name", "client-app");
		SpringApplication.run(ClientApp.class, args);
	}
}
