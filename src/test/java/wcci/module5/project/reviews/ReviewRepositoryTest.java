package wcci.module5.project.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {

	long reviewId = 1L;
	Review review1 = new Review(reviewId, "", "", "", null, "", "", "", null);
	
	long reviewId2 = 2L;
	private Expansion expansion = new Expansion(reviewId2, "", "", "", "");
	Review review2 = new Review(reviewId2, "", "", "", null, "", "", "", null, expansion);
	
	ReviewRepository underTest;
	
	@Test
	public void shouldFindAReview() {
		underTest = new ReviewRepository(review1);
		Review check = underTest.findOne(reviewId);
		assertThat(check, is(review1));
	}
	
	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(review1, review2);
		Collection<Review> reviews = underTest.findAll();
		assertThat(reviews, containsInAnyOrder(review1, review2));
	}
	
	@Test
	public void shouldFindOneExpansion() {
		underTest = new ReviewRepository(review1, review2);
		Expansion check = underTest.findOneExpansion(reviewId2);
		assertThat(check, is(expansion));
	}
	
}
