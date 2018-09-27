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
		createReview1();
		createReview2();
		createReview3();
		createReview4();

	}

	// tester
	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			allReviews.put(review.getId(), review);
		}
	}

	public Review findOne(long reviewId) {
		return allReviews.get(reviewId);
	}

	public Collection<Review> findAll() {
		return allReviews.values();
	}

	private void createReview1() {
		long id = 1L;
		String name = "The Grizzled";
		String numPlayers = "2-5";
		String lengthOfPlay = "30 minutes";

		String synopsis = "Playing as a group of WWI soldiers from France, your objective is not to win the war, just survive it.";

		String reviewText = "Barkadeer hang the jib pink weigh anchor reef sails deadlights chandler Spanish Main tender marooned. Line nipper marooned lugsail lateen sail weigh anchor aye strike colors Shiver me timbers provost. Maroon grapple lanyard log scurvy American Main spanker Jack Ketch yardarm Blimey.\r\n"
				+ "<br /><br />"
				+ "Sheet bilged on her anchor jib wench stern jack swab fire in the hole clap of thunder gangplank. Poop deck gangplank ballast wherry lad starboard fire ship code of conduct reef crack Jennys tea cup. Draft jury mast strike colors gibbet measured fer yer chains lookout avast spyglass scurvy code of conduct.";

		Collection<String> gameTags = new ArrayList<>();
		gameTags.add("Cooperative");
		gameTags.add("WWI");
		gameTags.add("Card");
		gameTags.add("Strategy");

		Review rev = new Review(id, name, numPlayers, lengthOfPlay, new GregorianCalendar(2015, 9, 1),
				synopsis, reviewText, gameTags);
		allReviews.put(rev.getId(), rev);
	}

	private void createReview2() {
		long id = 2L;
		String name = "Black Orchestra";
		String numPlayers = "1-5";
		String lengthOfPlay = "90 minutes";

		String synopsis = "You and your friends play as people inside Germany during the rise of Hitler attempting to kill him and stop his reign of terror.";

		String reviewText = "Prow scuttle parrel provost Sail ho shrouds spirits boom mizzenmast yardarm. Pinnace holystone mizzenmast quarter crow's nest nipperkin grog yardarm hempen halter furl. Swab barque interloper chantey doubloon starboard grog black jack gangway rutters.\r\n"
				+ "<br /><br />"
				+ "Deadlights jack lad schooner scallywag dance the hempen jig carouser broadside cable strike colors. Bring a spring upon her cable holystone blow the man down spanker Shiver me timbers to go on account lookout wherry doubloon chase. Belay yo-ho-ho keelhaul squiffy black spot yardarm spyglass sheet transom heave to.";

		Collection<String> gameTags = new ArrayList<>();
		gameTags.add("Cooperative");
		gameTags.add("WWII");
		gameTags.add("Board");
		gameTags.add("Strategy");
		gameTags.add("Single Player");

		Review rev = new Review(id, name, numPlayers, lengthOfPlay,
				new GregorianCalendar(2016, 10, 1), synopsis, reviewText, gameTags);
		allReviews.put(rev.getId(), rev);
	}

	private void createReview3() {
		long id = 3L;
		String name = "The Mind";
		String numPlayers = "2-4";
		String lengthOfPlay = "20 minutes";

		String synopsis = "Simple rules: Play the cards in sequence.  The catch: you can't discuss what's in your hand at all.";

		String reviewText = "Jack Tar jib Jack Ketch jack killick jolly boat lad sutler keel parrel. Rigging bring a spring upon her cable crimp Gold Road lookout landlubber or just lubber gally Jack Ketch topmast heave to. Bowsprit lookout scourge of the seven seas Shiver me timbers American Main keelhaul jury mast clap of thunder black spot knave."
				+ "<br /><br />"
				+ "Gun jolly boat ye scallywag maroon fire in the hole belaying pin Blimey parley bucko. Nipperkin hang the jib reef sails swab jury mast gabion Sea Legs Corsair quarter coxswain. Nelsons folly belaying pin fathom skysail stern Davy Jones' Locker lateen sail Sea Legs wench hardtack.";

		Collection<String> gameTags = new ArrayList<>();
		gameTags.add("Cooperative");
		gameTags.add("Card");
		gameTags.add("Strategy");
		gameTags.add("Abstract");
		gameTags.add("Social");

		Review rev = new Review(id, name, numPlayers, lengthOfPlay,
				new GregorianCalendar(2018, 5, 1), synopsis, reviewText, gameTags);
		allReviews.put(rev.getId(), rev);
	}
	
	private void createReview4() {
		long id = 4L;
		String name = "Concordia";
		String numPlayers = "2-5";
		String lengthOfPlay = "90 minutes";

		String synopsis = "Part board game, part deck-builder: develop your trade network across Ancient Europe to dominate your rivals.";

		String reviewText = "Sutler scallywag Yellow Jack jolly boat ho measured fer yer chains rope's end hearties grog blossom draft. Hands holystone jib brigantine hogshead ho pinnace careen chandler scuttle. Gabion pillage barque lookout topgallant shrouds skysail bring a spring upon her cable barkadeer Blimey."
				+ "<br /><br />"
				+ "Quarter bilge water rutters lanyard heave to sheet hang the jib avast salmagundi skysail. Gold Road lugger barque loot aye wench hearties Buccaneer no prey, no pay port. Jack aft scuttle heave to case shot quarter hempen halter sloop Sea Legs heave down.";

		Collection<String> gameTags = new ArrayList<>();
		gameTags.add("Competitive");
		gameTags.add("Board");
		gameTags.add("Strategy");
		gameTags.add("Deck-Builder");
		gameTags.add("Ancient Europe");

		Review rev = new Review(id, name, numPlayers, lengthOfPlay,
				new GregorianCalendar(2013, 9, 1), synopsis, reviewText, gameTags);
		allReviews.put(rev.getId(), rev);
	}

}
