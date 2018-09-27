package wcci.module5.project.reviews;

import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> allReviews = new HashMap<>();
	
	
	public ReviewRepository() {
		Collection<String> gameTags1 = new ArrayList<>();
		gameTags1.add("Cooperative");
		gameTags1.add("WWI");
		gameTags1.add("Card");
		gameTags1.add("Strategy");
		
		
		Review rev1 = new Review(1L, "The Grizzled", "2-5", "thegrizzed", "30 minutes", new GregorianCalendar(2015, 9, 1),gameTags1);
		allReviews.put(rev1.getId(), rev1);
	
		Collection<String> gameTags2 = new ArrayList<>();
		gameTags2.add("Cooperative");
		gameTags2.add("WWII");
		gameTags2.add("Board");
		gameTags2.add("Strategy");
		gameTags2.add("Single Player");
		
		Review rev2 = new Review(2L, "Black Orchestra", "1-5", "black-orchestra", "90 minutes", new GregorianCalendar(2016, 10, 1),gameTags2);
		allReviews.put(rev2.getId(), rev2);
		
		
	}

	//tester
	public ReviewRepository(Review...reviews) {
		for (Review review : reviews) {
			allReviews.put(review.getId() ,review);
		}
	}

	public Review findOne(long reviewId) {
		return allReviews.get(reviewId);
	}

	public Collection<Review> findAll() {
		return allReviews.values();
	}

}
