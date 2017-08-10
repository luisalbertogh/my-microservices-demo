/**
 * Eureka microservices registration and discovery server.
 */
package net.luisalbertogh.microservices.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author loga
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistrationServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Tell Boot to look for registration-server.yml - default is application.properties or application.yml */
		System.setProperty("spring.config.name", "registration-server");
		SpringApplication.run(ServiceRegistrationServer.class, args);
	}

}
