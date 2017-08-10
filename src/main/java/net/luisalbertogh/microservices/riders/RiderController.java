/**
 * Rider RESTful controller.
 */
package net.luisalbertogh.microservices.riders;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author loga
 *
 */
@RestController
public class RiderController {

	/** A logger reference */
	private Logger logger;
	
	/**
	 * Default constructor.
	 */
	public RiderController(){
		logger = Logger.getLogger(getClass().getName());
	}
	
	/** The rider DAO */
	@Autowired
	private RiderDAO riderDAO;
	
	/**
	* Find all riders.
	*
	* @return The riders list.
	*/
	@RequestMapping("/riders")
	public List<Rider> findAllRiders() {
	  return (List<Rider>) this.getRiderDAO().findAll();
	}

	/**
	 * @return the riderDAO
	 */
	public RiderDAO getRiderDAO() {
		return riderDAO;
	}

	/**
	 * @param riderDAO the riderDAO to set
	 */
	public void setRiderDAO(RiderDAO riderDAO) {
		this.riderDAO = riderDAO;
	}
}
