//package worldMap;
//
//import java.util.Set;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.OrderBy;
//
//@Entity
//public class ReviewTags {
//	
//@Id
//@GeneratedValue
//private long id;
//private String tag;
//
//@OneToMany(mappedBy = "reviewTags")
//private Set<Continent> continents;
//
//public long getId() {
//	return id;
//}
//
//public String getTag() {
//	return tag;
//}
//
//public Set<Continent> getContinents() {
//	return continents;
//}
//
//private ReviewTags() {
//	
//}
//public ReviewTags(String tag) {
//	this.tag = tag;
//}
//	
//}
