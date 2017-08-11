/**
 * Unit test cases (only service).
 */
package net.luisalbertogh.microservices.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.luisalbertogh.microservices.riders.RidersConfiguration;

/**
 * @author loga
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=RidersConfiguration.class)
public class RidersTest extends AbstractRidersTest {
}
