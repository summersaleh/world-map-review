package worldMap;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;

public class ContinentsPopulator implements CommandLineRunner {

	@Resource
	private ContinentsRepository continentsRepo;

	@Resource
	private CountriesRepository countriesRepo;

	@Override
	public void run(String... args) throws Exception {

		Continents europe = new Continents("Europe", "images/europe.png",
				"Europe is a continent that comprises the westernmost part of Eurasia. Europe is bordered by the Arctic Ocean to the north, the Atlantic Ocean to the west, and the Mediterranean Sea to the south.");

		continentsRepo.save(europe);

	}

}
