/**
 * Rider DAO interface.Use CRUD repository Spring Data operations
 */
package net.luisalbertogh.microservices.riders;

import org.springframework.data.repository.CrudRepository;

/**
 * @author loga
 *
 */
public interface RiderDAO extends CrudRepository<Rider, String> {
	/* EMPTY */
}
