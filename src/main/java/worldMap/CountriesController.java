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
	public String fetchContinent(@RequestParam("id") long id, Model model) {
		model.addAttribute(continentRepo.findOne(id));
		return "continentsDetail";
	}
	
	@RequestMapping("/countries")
	public String fetchCountries(Model model) {
		model.addAttribute("countries", countryRepo.findAll());
		return "countriesList";
	}

	@RequestMapping("/country")
	public String fetchCountriesDetail(@RequestParam("id") long id, Model model) {
		Country selectedCountry = countryRepo.findOne(id);
		model.addAttribute(selectedCountry);
//		same as model.addAttribute("Country", selectedCountry);
		return "countriesDetail";
	}
	
//	@RequestMapping("/addCountry")
//	public String addCountry(@RequestParam("countryId") long id, @RequestParam("name") String newCountryName) {
//		
//		Continent selected = continentRepo.findOne(id);
//		Country newCountry = new Country(selected, newCountryName);
//		countryRepo.save(newCountry);
//		
//	return "redirect:/continent?id=" + id;
//	}
//	
//	@RequestMapping("/country/delete")
//	public String deleteCountry(@RequestParam("countryId") long countryId) {
//		
//		Country toDelete = countryRepo.findOne(countryId);
//		long continentId = toDelete.getContinent().getId();
//		
//		countryRepo.delete(toDelete);
//		
//		return "redirect:/continent?id=" + continentId;
//	}
	
	
	
	
}
