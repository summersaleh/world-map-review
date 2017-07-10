package worldMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UpdateReviewController {
	
	@Resource
	private ContinentRepository continentRepo;

	@Resource
	private CountryRepository countryRepo;
	
	@Resource
	private TagRepository tagRepo;
	
	
	@RequestMapping("/tags")
	public String fetchTag(@RequestParam("id") long id, Model model) {
		model.addAttribute("tags", tagRepo.findOne(id));
		model.addAttribute("countries", countryRepo.findAll());
		return "tags";
	}
	

	
	@RequestMapping("/tags/delete")
	public String deleteTag(@RequestParam long tagId, @RequestParam long countryId) {
		Tag toDelete = tagRepo.findOne(tagId);
		for(Country countries: toDelete.getCountries()) {
			countries.remove(toDelete);
			countryRepo.save(countries);
		}
		tagRepo.delete(toDelete);
		return "redirect:/country?id=" + countryId;
	}
	
	@RequestMapping("/tags/add")
	public String createTag(@RequestParam(value = "id") Long id, String name) {
		Tag tag = new Tag(name);
		tagRepo.save(tag);
		Country countries = countryRepo.findOne(id);
		countries.add(tag);
		countryRepo.save(countries);
		return "redirect:/country?id=" + id;
	}
	
	
//	@RequestMapping("/tags/cloud")
//	public String createCloud() {
//		Tag selected = tagRepo.findOne(id);
//		tagRepo.save(selected);
//		return "foodCloud";
//	}

}
