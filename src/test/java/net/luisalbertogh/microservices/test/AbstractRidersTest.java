/**
 * Microservices test cases.
 */
package net.luisalbertogh.microservices.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import net.luisalbertogh.microservices.riders.Rider;
import net.luisalbertogh.microservices.riders.RiderController;

/**
 * @author loga
 *
 */
public abstract class AbstractRidersTest {

	/** Rider controller */
	@Autowired
	protected RiderController riderController;
	
	/**
	 * Test.
	 */
	@Test
	public void countRiders(){
		List<Rider> riders = riderController.findAllRiders();
		Assert.notEmpty(riders, "List must contains elements");
		org.junit.Assert.assertEquals(riders.size(), 3);
	}
}
