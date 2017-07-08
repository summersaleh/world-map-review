package worldMap;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Tag {
	
@Id
@GeneratedValue
private long id;
private String name;


/**
 * "mappedBy" indicates what instance variable on the other class holds the
 * other end of this relationship
 */
@ManyToMany(mappedBy = "tags")
private Set<Country> countries;

public long getId() {
	return id;
}

public String getName() {
	return name;
}

public Set<Country> getCountries() {
	return countries;
}

private Tag() {
	
}

public Tag(String name) {
	this.name = name;
}
	
}
