/**
 * Riders microservices configuration.
 */
package net.luisalbertogh.microservices.riders;

import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author loga
 *
 */
@Configuration
@EnableAutoConfiguration
public class RidersConfiguration {
	/* Logger */
	protected Logger logger;

	/**
	 * Default constructor.
	 */
	public RidersConfiguration() {
		logger = Logger.getLogger(getClass().getName());
	}
	
	/**
	* Store some riders for testing.
	*
	* @param riderDAO
	*            - The rider DAO
	* @return The command line runner
	*/
	@Bean
	public CommandLineRunner demo(RiderDAO riderDAO) {
		logger.info("Loading 3 riders for testing...");
		return (args) -> {
			riderDAO.save(new Rider("Froom", "Sky", "Kenian", 23));
			riderDAO.save(new Rider("Contador", "Trek", "Spanish", 22));
			riderDAO.save(new Rider("Quintana", "Movistar", "Colombian", 11));
		};
	}
}
