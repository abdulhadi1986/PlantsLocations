package nl.abdulhadi.projects.PlantsLocations.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import nl.abdulhadi.projects.PlantsLocations.dto.SpicemenDto;
import nl.abdulhadi.projects.PlantsLocations.services.SpicemenStubInterface;

@Controller
public class PlantPlacesController {
	
	@Autowired
	private SpicemenStubInterface spicemenInterface;
	
	@GetMapping(value = "/home")
	public String start(Model model) {
		SpicemenDto spicemen = spicemenInterface.getSpicemen(1); 
		model.addAttribute("spicemen" , spicemen);
		return "index" ; 
	}
	
	@GetMapping(value = "/addnew", params= {"name"})
	public String addNew(Model model,
						@RequestParam(value= "name" , required = false, defaultValue = "name")String name) {
		SpicemenDto spicemen = spicemenInterface.getSpicemen(2);
		spicemen.setName(name);
		model.addAttribute("spicemen" , spicemen);
		return "index" ; 
	}
	
	@RequestMapping (value="/home", method= RequestMethod.GET, params= {"loyalty"})
	public ModelAndView getLoyalty() {
		SpicemenDto spicemen = spicemenInterface.getSpicemen(2);
		spicemen.setDescription("this one from loyalty");
		ModelAndView mv = new ModelAndView(); 
		mv.setViewName("index");
		mv.addObject("spicemen" , spicemen); 
		return mv; 
	}

}
