package worldMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Countries {

	@ManyToOne
	private Continents continents;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	public Countries(String name) {
		this.name = name;
	}

	
	
	
		
	 
	
	
}
