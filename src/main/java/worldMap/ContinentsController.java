package worldMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Need the annotation 
@Controller
public class ContinentsController {

	@Resource
	private ContinentsRepository continentsRepo;
	
	@Resource
	private CountriesRepository countriesRepo;
	
	
	
	@RequestMapping("/continents")
	public String fetchContinents(Model model) {
		model.addAttribute("continents", continentsRepo.findAll());
		return "worldMapDetail";
	}

//	@RequestMapping("/continents/countries")
//	public String fetchSingleReview(@RequestParam("id") Long id, Model model) {
//		model.addAttribute("countries", countriesRepo.findOne(id));
//		return "countriesDetail";
//	}
	
	
	
	
}
