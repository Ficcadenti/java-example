package it.raffo.springmvc;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import it.raffo.spring.bean.Triangolo;
import it.raffo.spring.bean.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("GET: home");
		return "home";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		logger.info("GET: test");
		return "test";
	}
	
	@RequestMapping(value = "/test_gson", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public User testGSON() {
		logger.info("GET: test_gson");
		
		User user = new User();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		
		user.setId(1);
		user.setName("Luca");
		user.setSurname("Ficcadenti");
		try {
			user.setBirtday(ft.parse("1976-11-13"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Gson gson = new GsonBuilder().setPrettyPrinting().create();  
		String usersJson = gson.toJson(user);        
		System.out.println(usersJson);
		
		return user;
	}
	
	@RequestMapping(value = "/triangolo", method = RequestMethod.GET)
	public ModelAndView triangolo()
	{
		return new ModelAndView("triangoloForm","triangoloComm",new Triangolo());
	}
	
	@RequestMapping(value = "/showTriangolo", method = RequestMethod.GET)
	public String showTriangolo(@ModelAttribute Triangolo triangolo,Model model)
	{
		model.addAttribute("type",triangolo.getType());
		model.addAttribute("altezza",triangolo.getAltezza());
		return "showTriangolo";
	}
	
}
