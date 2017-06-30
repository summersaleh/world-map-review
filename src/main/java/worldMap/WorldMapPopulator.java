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

		Continent europe = new Continent("Europe", "images/europe2.png",
				"Europe is a continent that comprises the westernmost part of Eurasia. Europe is bordered by the Arctic Ocean to the north, the Atlantic Ocean to the west, and the Mediterranean Sea to the south. ");
		continentRepo.save(europe);
		Country countries = new Country(europe, "Spain", "46,468,102", "Spanish", "images/spain.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n"
						+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n"
						+ "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\n"
						+ "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n"
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\r\n"
						+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		countryRepo.save(countries);
		countryRepo.save(new Country(europe, "Iceland", "330,823", "Icelandic", "images/iceland2.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n"
						+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n"
						+ "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\n"
						+ "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n"
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\r\n"
						+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));
		countryRepo.save(new Country(europe, "Germany", "82,175,700", "German", "images/germany2.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n"
						+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n"
						+ "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\n"
						+ "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n"
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\r\n"
						+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));

		Continent northAmerica = new Continent("North America", "images/northamerica2.png",
				"North America is a continent entirely within the Northern Hemisphere and almost all within the Western Hemisphere. It can also be considered a northern subcontinent of the Americas.");
		continentRepo.save(northAmerica);
		countryRepo.save(new Country(northAmerica, "USA", "325,145,963", "English", "images/iceland2.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n"
						+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n"
						+ "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\n"
						+ "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n"
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\r\n"
						+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));

		Continent southAmerica = new Continent("South America", "images/southamerica.png",
				"South America is a continent located in the western hemisphere, mostly in the southern hemisphere, with a relatively small portion in the northern hemisphere. ");
		continentRepo.save(southAmerica);
		countryRepo.save(new Country(southAmerica, "Peru", "31,151,643", "Spanish", "images/iceland2.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n"
						+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n"
						+ "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\n"
						+ "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n"
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\r\n"
						+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));

		Continent africa = new Continent("Africa", "images/africa.png",
				"Africa has 54 sovereign countries—the most on any continent—and is the second largest continent in terms of both land area and population. Africa is bounded by the Mediterranean Sea to the north.");
		continentRepo.save(africa);
		countryRepo.save(new Country(africa, "Madagascar", "24,430,325", "Malagasy", "images/iceland2.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n"
						+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n"
						+ "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\n"
						+ "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n"
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\r\n"
						+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));

		Continent asia = new Continent("Asia", "images/asia.png",
				"Asia is Earth's largest and most populous continent, located primarily in the eastern and northern hemispheres and sharing the continental landmass of Eurasia with the continent of Europe.");
		continentRepo.save(asia);
		countryRepo.save(new Country(asia, "Bhutan", "742,737", "Dzongkha", "images/iceland2.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n"
						+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n"
						+ "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\n"
						+ "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n"
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\r\n"
						+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));

		Continent australia = new Continent("Australia", "images/australia.png",
				"Australia, officially the Commonwealth of Australia, is a country comprising the mainland of the Australian continent, the island of Tasmania and numerous smaller islands. ");
		continentRepo.save(australia);
		countryRepo.save(new Country(australia, "Island of Tasmaina", "519,100", "Tasmanian", "images/iceland2.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n"
						+ "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n"
						+ "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\n"
						+ "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n"
						+ "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\r\n"
						+ "proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));

	}

}
