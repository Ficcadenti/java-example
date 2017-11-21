package it.raffo.springmvc.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String triangolo(Model model) {
		logger.info("GET: /formTriangolo");
		
		Triangolo t=new Triangolo();
		t.setType("Equilatero");
		t.setAltezza(30);
		model.addAttribute("triangoloComm", t);
		
		return "formTriangolo";
		
//		return new ModelAndView("formTriangolo","triangoloComm",new Triangolo());
	}
	
	@RequestMapping(value = "/showTriangolo", method = RequestMethod.GET)
	public ModelAndView showTriangolo(@Valid
			@ModelAttribute("triangoloComm") 
			Triangolo triangolo,
			BindingResult result,
			Model model)
	{
		logger.info("GET: /showTriangolo");
		ModelAndView mev=new ModelAndView();
		if(result.hasErrors())
		{
			logger.info("error: "+result.getFieldError("altezza"));
			model.addAttribute("triangoloComm", triangolo);
			mev.setViewName("formTriangolo");
		}
		else
		{
			model.addAttribute("type",triangolo.getType());
			model.addAttribute("altezza",triangolo.getAltezza());
			mev.setViewName("showTriangolo");
		}
		
		return mev;
		
		
	}
	
	@RequestMapping(value = "/formTriangolo1", method = RequestMethod.GET)
	public String test(Model model) {
		logger.info("GET: /formTriangolo1");
		
		Triangolo t=new Triangolo();
		t.setType("Equilatero");
		t.setAltezza(30);
		model.addAttribute("triangoloComm", t);
		
		return "formTriangolo1";
	}
	
	@RequestMapping(value = "/showTriangolo1", method = RequestMethod.POST)
	public ModelAndView showTriangolo1(
			@Valid
			@ModelAttribute("triangoloComm")
			Triangolo triangolo,
			BindingResult result,
			Model model)
	{
		logger.info("GET: /showTriangolo1");
		if(result.hasErrors())
		{
			logger.info("error: "+result.getFieldError("altezza"));
			model.addAttribute("triangoloComm", triangolo);
			return new ModelAndView("formTriangolo1");
		}
		else
		{
			model.addAttribute("type",triangolo.getType());
			model.addAttribute("altezza",triangolo.getAltezza());
			return new ModelAndView("showTriangolo1");
		}
	}
	
	
	
}
