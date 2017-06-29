package worldMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Need the annotation 
@Controller
public class CountriesController {

	@Resource
	private ContinentRepository continentRepo;
	
	@Resource
	private CountryRepository countryRepo;
	
	
	
	@RequestMapping("/continents")
	public String fetchContinents(Model model) {
		model.addAttribute("continents", continentRepo.findAll());
		return "continentsList";
	}

	@RequestMapping("/continent")
	public String fetchContinent(@RequestParam("id") int id, Model model) {
		model.addAttribute(continentRepo.findOne(id));
		return "continentsDetail";
	}
	
	@RequestMapping("/countries")
	public String fetchCountries(Model model) {
		model.addAttribute("countries", countryRepo.findAll());
		return "countriesList";
	}

	@RequestMapping("/country")
	public String fetchCountry(@RequestParam("id") Long id, Model model) {
		Country selectedCountry = countryRepo.findOne(id);
		model.addAttribute(selectedCountry);
//		same as model.addAttribute("Country", selectedCountry);
		return "countriesDetail";
	}
	
//	@RequestMapping("/continents/countries")
//	public String fetchSingleReview(@RequestParam("id") Long id, Model model) {
//		model.addAttribute("countries", countriesRepo.findOne(id));
//		return "countriesDetail";
//	}
	
	
	
	
}
