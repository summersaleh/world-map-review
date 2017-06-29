package worldMap;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WorldMapPopulator implements CommandLineRunner {

	@Resource
	private ContinentRepository continentRepo;

	@Resource
	private CountryRepository countryRepo;

	@Override
	public void run(String... args) throws Exception {

		Continent europe = new Continent("Europe", "images/europe.png", "Europe is a continent that comprises the westernmost part of Eurasia. Europe is bordered by the Arctic Ocean to the north, the Atlantic Ocean to the west, and the Mediterranean Sea to the south. ");
		continentRepo.save(europe);
		Country countries = new Country(europe, "Spain");
		countryRepo.save(countries);
		
		Continent northAmerica = new Continent("North America", "images/northamerica.png", "North America is a continent entirely within the Northern Hemisphere and almost all within the Western Hemisphere. It can also be considered a northern subcontinent of the Americas.");
		continentRepo.save(northAmerica);
		countryRepo.save(new Country(northAmerica, "USA"));

	}

}
