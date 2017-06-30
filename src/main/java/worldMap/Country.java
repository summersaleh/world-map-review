package worldMap;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Country {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String population;
	private String language;
	private String image;
	@Lob
	private String description;

	// Many countries to one continents Does annotation only apply to the one
	// under it?
	@ManyToOne
	private Continent continent;
	
	
	
	public Continent getContinent() {
		return continent;
	}
	
	



	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// JPA needs this
	private Country() {
	}

	public Country(String name) {
		this.name = name;
	}

	public Country(Continent continent, String name, String population, String language, String image, String description) {
		this.continent = continent;
		this.name = name;
		this.population = population;
		this.language = language;
		this.image = image;
		this.description = description;
	}

	



	public String getImage() {
		return image;
	}





	public String getDescription() {
		return description;
	}





	public String getPopulation() {
		return population;
	}





	public String getLanguage() {
		return language;
	}

}
