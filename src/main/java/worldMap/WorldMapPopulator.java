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

		Continent europe = new Continent("Europe", "images/europe2.png", "Europe is a continent that comprises the westernmost part of Eurasia. Europe is bordered by the Arctic Ocean to the north, the Atlantic Ocean to the west, and the Mediterranean Sea to the south. ");
		continentRepo.save(europe);
		Country countries = new Country(europe, "Spain");
		countryRepo.save(countries);
		
		Continent northAmerica = new Continent("North America", "images/northamerica2.png", "North America is a continent entirely within the Northern Hemisphere and almost all within the Western Hemisphere. It can also be considered a northern subcontinent of the Americas.");
		continentRepo.save(northAmerica);
		countryRepo.save(new Country(northAmerica, "USA"));
		
		Continent southAmerica = new Continent("South America", "images/southamerica.png", "South America is a continent located in the western hemisphere, mostly in the southern hemisphere, with a relatively small portion in the northern hemisphere. ");
		continentRepo.save(southAmerica);
		countryRepo.save(new Country(southAmerica, "Peru"));
		
		Continent africa = new Continent("Africa", "images/africa.png", "Africa has 54 sovereign countries—the most on any continent—and is the second largest continent in terms of both land area and population. Africa is bounded by the Mediterranean Sea to the north.");
		continentRepo.save(africa);
		countryRepo.save(new Country(africa, "Madagascar"));
		
		Continent asia = new Continent("Asia", "images/asia.png", "Asia is Earth's largest and most populous continent, located primarily in the eastern and northern hemispheres and sharing the continental landmass of Eurasia with the continent of Europe.");
		continentRepo.save(asia);
		countryRepo.save(new Country(asia, "Bhutan"));
		
		
		Continent australia = new Continent("Australia", "images/australia.png", "Australia, officially the Commonwealth of Australia, is a country comprising the mainland of the Australian continent, the island of Tasmania and numerous smaller islands. ");
		continentRepo.save(australia);
		countryRepo.save(new Country(australia, "Island of Tasmaina"));
		

	}

}
