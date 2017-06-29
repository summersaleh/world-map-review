package worldMap;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.ui.Model;

@Entity
public class Continents {
	private Set<Model>models;
	@OneToMany(mappedBy ="continents") 
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String imageURL;
	private String description;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getImageURL() {
		return imageURL;
	}

	public String getDescription() {
		return description;
	}

	public Continents(String name, String imageURL, String description) {
		this.name = name;
		this.imageURL = imageURL;
		this.description = description;
	}
	
	

}
