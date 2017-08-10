/**
 * Client rider service.
 */
package net.luisalbertogh.microservices.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import net.luisalbertogh.microservices.riders.Rider;

/**
 * @author loga
 *
 */
@Service
public class RiderService {
	/** REST template to access REST web services */
	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;
	
	/** The service URL */
	protected String serviceUrl;
	
	/**
	 * RiderService constructor.
	 * 
	 * @param serviceUrl - The service URL
	 */
	public RiderService(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	
	/**
	 * Find all riders.
	 * @return List of riders
	 */
	public List<Rider> findAllRiders(){
		Rider[] riders = null;

		try {
			riders = restTemplate.getForObject(serviceUrl
					+ "/riders", Rider[].class);
		} catch (HttpClientErrorException e) { // 404
			// Nothing found
		}

		if (riders == null || riders.length == 0)
			return null;
		
		return Arrays.asList(riders);
	}

	/**
	 * @return the restTemplate
	 */
	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	/**
	 * @param restTemplate the restTemplate to set
	 */
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	/**
	 * @return the serviceUrl
	 */
	public String getServiceUrl() {
		return serviceUrl;
	}

	/**
	 * @param serviceUrl the serviceUrl to set
	 */
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
}
