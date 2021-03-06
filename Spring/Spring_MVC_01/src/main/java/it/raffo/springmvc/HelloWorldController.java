package it.raffo.springmvc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HelloWorldController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("GET: home");
		return "home";
	}
	
	@RequestMapping(value = "/helloWorld/{id}", method = RequestMethod.GET)
	public String helloWorld(@PathVariable("id") int id) {
		logger.info("GET: helloWorld/"+id);
		return "hello";
	}
	
}
