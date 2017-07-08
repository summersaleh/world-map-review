package worldMap;

import java.util.Set;
import java.util.SortedSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;


//Name name an entity a plural name
@Entity
public class Continent {
//	Why is this one int and the many ID long?
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	private String image;
	private String description;

	// One continent to many countries
	@OneToMany(mappedBy = "continent")
	@OrderBy("name")
	private Set<Country> countries;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getImage() {
		return image;
	}
	
	public String getDescription() {
		return description;
	}
	

	// JPA needs no argument constructor
	public Continent() {
	}

	public Set<Country> getCountries() {
		return countries;
	}

	public Continent(String name, String image, String description) {
		this.name = name;
		this.image = image;
		this.description = description;

	}

}
