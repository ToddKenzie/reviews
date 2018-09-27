package wcci.module5.project.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> allReviews = new HashMap<>();
	
	
	public ReviewRepository() {
		Review rev1 = new Review(1L, "The Grizzled", "2-5");
		Review rev2 = new Review(2L, "Black Orchestra", "1-5");
		
		allReviews.put(rev1.getId(), rev1);
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
