/**
 * Integration test suite (web + services).
 */
package net.luisalbertogh.microservices.test;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import net.luisalbertogh.microservices.riders.RidersConfiguration;

/**
 * @author loga
 *
 */
@SpringBootApplication
@Import(RidersConfiguration.class)
class RidersMain {
	public static void main(String[] args) {
		/* Look for riders-server.properties or riders-server.yml */
		System.setProperty("spring.config.name", "riders-server");
		SpringApplication.run(RidersMain.class, args);
	}
}

/**
 * Launch tests.
 * @author loga
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=RidersMain.class)
public class RidersITest extends AbstractRidersTest {
}
