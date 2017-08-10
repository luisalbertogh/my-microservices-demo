/**
 * Client rider controller.
 */
package net.luisalbertogh.microservices.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.luisalbertogh.microservices.riders.Rider;

/**
 * @author loga
 *
 */
@RestController
public class RiderController {
	/** Rider service */
	@Autowired
	protected RiderService riderService;
	
	/**
	 * Default constructor
	 * @param riderService - The rider service
	 */
	public RiderController(RiderService riderService) {
		this.riderService = riderService;
}	
	
	/** Find all riders */
//	@RequestMapping("/riders")
//	public String findAllRaiders(Model model) {
//		List<Rider> riders = riderService.findAllRiders();
//		if (riders != null)
//			model.addAttribute("riders", riders);
//		return "riders";
//	}

	/** Find all riders */
	@RequestMapping("/riders")
	public String findAllRaiders(Model model) {
		String list = "";
		List<Rider> riders = riderService.findAllRiders();
		  if (riders != null && !riders.isEmpty()) {
		    for (Rider rider : riders) {
		      list += rider + "<br/>";
		    }
		  }
		  return list;
	}
	
	/**
	 * @return the riderService
	 */
	public RiderService getRiderService() {
		return riderService;
	}

	/**
	 * @param riderService the riderService to set
	 */
	public void setRiderService(RiderService riderService) {
		this.riderService = riderService;
	}
}
