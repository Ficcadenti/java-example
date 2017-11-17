package it.raffo.springmvc.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import it.raffo.springmvc.model.Triangolo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class WebAppController {
	
	private static final Logger logger = LoggerFactory.getLogger(WebAppController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		logger.info("GET: /");
		return new ModelAndView("home","triangoloComm",new Triangolo());
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String helloWorld() {
		logger.info("GET: /home");
		return "home";
	}
	
	@RequestMapping(value = "/formTriangolo", method = RequestMethod.GET)
	public ModelAndView triangolo() {
		logger.info("GET: /formTriangolo");
		return new ModelAndView("formTriangolo","triangoloComm",new Triangolo());
	}
	
	@RequestMapping(value = "/showTriangolo", method = RequestMethod.GET)
	public String showTriangolo(@ModelAttribute Triangolo triangolo,Model model)
	{
		model.addAttribute("type",triangolo.getType());
		model.addAttribute("altezza",triangolo.getAltezza());
		return "showTriangolo";
	}
	
}
