package worldMap;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Country {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	// Many countries to one continents Does annotation only apply to the one
	// under it?
	@ManyToOne
	private Continent continent;

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

	public Country(Continent continent, String name) {
		this.continent = continent;
		this.name = name;
	}

}
