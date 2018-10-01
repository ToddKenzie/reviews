package wcci.module5.project.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import static java.util.Arrays.asList;

import java.util.Collection;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@WebMvcTest(ReviewController.class)
public class ReviewControllerMockMvcTest {
	
	@Resource
	MockMvc mvc;
	
	@MockBean
	private ReviewRepository reviewRepo;
	
	@Mock
	private Review review1;
	
	@Mock
	private Review review2;
	
	@Mock
	private Expansion expansion;
	
	@Test
	public void serverStatusForAllReviewsShouldBeOk() throws Exception {
		mvc.perform(get("/show-reviews")).andExpect(status().isOk());
	}
	
	@Test
	public void shouldRouteToAllReviewsSite() throws Exception {
		mvc.perform(get("/show-reviews")).andExpect(view().name(is("reviews")));
	}
	
	@Test
	public void shouldPutAllReviewsIntoModel() throws Exception {
		Collection<Review> allReviews = asList(review1, review2);
		when(reviewRepo.findAll()).thenReturn(allReviews);
		mvc.perform(get("/show-reviews")).andExpect(model().attribute("reviews", is(allReviews)));
	}
	
	
	@Test
	public void serverStatusForOneReviewShouldBeOk() throws Exception {
		mvc.perform(get("/review?id=1")).andExpect(status().isOk());
	}
	
	@Test
	public void shouldRouteToSingleReviewSite() throws Exception {
		mvc.perform(get("/review?id=1")).andExpect(view().name(is("review")));
	}
	
	@Test
	public void shouldPutSingleReviewIntoModel() throws Exception {
		when(reviewRepo.findOne(1L)).thenReturn(review1);
		mvc.perform(get("/review?id=1")).andExpect(model().attribute("reviews",  is(review1)));
	}
	
	@Test
	public void serverStatusForExpansionShouldBeOK() throws Exception {
		mvc.perform(get("/expansion?id=1")).andExpect(status().isOk());
	}
	
	@Test
	public void shouldRouteToExpansionSite() throws Exception {
		mvc.perform(get("/expansion?id=1")).andExpect(view().name(is("expansion")));
	}
	
	@Test
	public void shouldPutSingleExpansionIntoModel() throws Exception {
		when(reviewRepo.findOneExpansion(1L)).thenReturn(expansion);
		mvc.perform(get("/expansion?id=1")).andExpect(model().attribute("reviews", is(expansion)));
	}
	

}
