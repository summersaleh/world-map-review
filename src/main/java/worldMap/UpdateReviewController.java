package worldMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UpdateReviewController {
	
	@Resource
	private ContinentRepository continentRepo;

	@Resource
	private CountryRepository countryRepo;
	
//	delete individual country reviews
	@RequestMapping("/deleteReview")
	public String deleteReview(@RequestParam long id) {
		countryRepo.delete(id);
		return "deleteReview";
	}

}
