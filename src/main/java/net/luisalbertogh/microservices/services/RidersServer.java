/**
 * Riders microservice.
 */
package net.luisalbertogh.microservices.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import net.luisalbertogh.microservices.riders.RidersConfiguration;

/**
 * @author loga
 *
 */
@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(RidersConfiguration.class)
public class RidersServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Tell server to look for riders-server.properties or riders-server.yml */
		System.setProperty("spring.config.name", "riders-server");
		SpringApplication.run(RidersServer.class, args);
	}

}
