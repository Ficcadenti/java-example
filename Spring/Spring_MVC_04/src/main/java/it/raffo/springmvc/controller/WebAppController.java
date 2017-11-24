package it.raffo.springmvc.controller;


import static org.hamcrest.CoreMatchers.instanceOf;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import it.raffo.springmvc.model.Triangolo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class WebAppController implements HandlerExceptionResolver{
	
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
	
	@RequestMapping(value = "/errors", method = RequestMethod.GET)
	public String errors() {
		logger.info("GET: /errors");
		return "errors";
	}
	
	@RequestMapping(value = "/formUpload", method = RequestMethod.GET)
	public String formUpload() {
		logger.info("GET: /formUpload");
		return "formUpload";
	}
	
	@RequestMapping(value = "/showUpload", method = RequestMethod.POST)
	public ModelAndView showUpload(@RequestParam("name") String name, @RequestParam("file") MultipartFile file, Exception e, Model model) throws IOException 
	{
		logger.info("POST: /showUpload");
		if(!file.isEmpty())
		{
			ModelAndView modelAndView=new ModelAndView("showUpload");
			byte[] bytes=file.getBytes();
			modelAndView.addObject("name", name);
			return modelAndView;
		}
		else
		{
			return new ModelAndView("errors");
		}
	}
	
	@RequestMapping(value = "/formTriangolo", method = RequestMethod.GET)
	public String triangolo(Model model) {
		logger.info("GET: /formTriangolo");
		
		Triangolo t=new Triangolo();
		t.setType("Equilatero");
		t.setAltezza(30);
		model.addAttribute("triangoloComm", t);
		
		return "formTriangolo";
		
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
			mev.addObject("triangoloComm", triangolo);
			mev.setViewName("formTriangolo");
		}
		else
		{
			mev.addObject("type",triangolo.getType());
			mev.addObject("altezza",triangolo.getAltezza());
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
		logger.info("POST: /showTriangolo1");
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

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		logger.info("GET: /resolveException");
		if(ex instanceof MaxUploadSizeExceededException)
		{
			ModelAndView modelAndView=new ModelAndView("errors");
			modelAndView.addObject("error", ex.getMessage());
			logger.info("Errore: "+ex.getMessage());
			return modelAndView;
		}
		else
		{
			return new ModelAndView("errors");
		}
	}
	
	
	
}
