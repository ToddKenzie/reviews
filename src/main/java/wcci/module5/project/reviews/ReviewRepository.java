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
	private Map<Long, Expansion> allExpansions = new HashMap<>();

	public ReviewRepository() {
		createReview1();
		createReview2();
		createReview3();
		createReview4();
		createReview5();
		createReview6();

	}

	// tester
	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			allReviews.put(review.getId(), review);
			if (review.getExpansion() != null) {
				allExpansions.put(review.getId(), review.getExpansion());
			}
		}
	}

	public Review findOne(long id) {
		return allReviews.get(id);
	}

	public Collection<Review> findAll() {
		return allReviews.values();
	}

	public Expansion findOneExpansion(long id) {
		return allExpansions.get(id);
	}
	
	private void createReview1() {
		long id = 1L;
		String name = "Black Orchestra";
		String numPlayers = "1-5";
		String lengthOfPlay = "90 minutes";

		String synopsis = "You and your friends play as people inside Germany during the rise of Hitler attempting to kill him and stop his reign of terror.";

		String reviewText = "Prow scuttle parrel provost Sail ho shrouds spirits boom mizzenmast yardarm. Pinnace holystone mizzenmast quarter crow's nest nipperkin grog yardarm hempen halter furl. Swab barque interloper chantey doubloon starboard grog black jack gangway rutters.\r\n"
				+ "<br /><br />"
				+ "Deadlights jack lad schooner scallywag dance the hempen jig carouser broadside cable strike colors. Bring a spring upon her cable holystone blow the man down spanker Shiver me timbers to go on account lookout wherry doubloon chase. Belay yo-ho-ho keelhaul squiffy black spot yardarm spyglass sheet transom heave to.";

		String weblink = "https://www.starling.games/black-orchestra/";
		
		Collection<String> gameTags = new ArrayList<>();
		gameTags.add("Cooperative");
		gameTags.add("WWII");
		gameTags.add("Board");
		gameTags.add("Strategy");
		gameTags.add("Single Player");

		Review rev = new Review(id, name, numPlayers, lengthOfPlay,
				new GregorianCalendar(2016, 10, 1), synopsis, reviewText, weblink, gameTags);
		allReviews.put(rev.getId(), rev);
	}

	private void createReview2() {
		long id = 2L;
		String name = "Concordia";
		String numPlayers = "2-5";
		String lengthOfPlay = "90 minutes";

		String synopsis = "Part board game, part deck-builder: develop your trade network across Ancient Europe to dominate your rivals.";

		String reviewText = "Sutler scallywag Yellow Jack jolly boat ho measured fer yer chains rope's end hearties grog blossom draft. Hands holystone jib brigantine hogshead ho pinnace careen chandler scuttle. Gabion pillage barque lookout topgallant shrouds skysail bring a spring upon her cable barkadeer Blimey."
				+ "<br /><br />"
				+ "Quarter bilge water rutters lanyard heave to sheet hang the jib avast salmagundi skysail. Gold Road lugger barque loot aye wench hearties Buccaneer no prey, no pay port. Jack aft scuttle heave to case shot quarter hempen halter sloop Sea Legs heave down.";

		String weblink = "http://riograndegames.com/Game/1279-Concordia";
		
		Collection<String> gameTags = new ArrayList<>();
		gameTags.add("Competitive");
		gameTags.add("Board");
		gameTags.add("Strategy");
		gameTags.add("Deck-Builder");
		gameTags.add("Ancient Europe");

		String exName = "Concordia Salsa";
		String exNumPlayers = "2-5";
		String exSynopsis = "Salsa adds a new double sided board, a new \"wildcard\" resource, and a forum of upgrade cards to change the dynamics of the game.  There are also other boards that can be purchased separately to create new variants of the game.";
		String exWeblink = "http://riograndegames.com/Game/1303-Concordia-Salsa";

		Expansion expan = new Expansion(id, exName, exNumPlayers, exSynopsis, exWeblink);
		Review rev = new Review(id, name, numPlayers, lengthOfPlay,
				new GregorianCalendar(2013, 9, 1), synopsis, reviewText, weblink, gameTags, expan);
		allReviews.put(rev.getId(), rev);
		allExpansions.put(expan.getId(), expan);
	}
	
	
	private void createReview3() {
		long id = 3L;
		String name = "Root";
		String numPlayers = "2-4";
		String lengthOfPlay = "60 - 90 minutes";

		String synopsis = "Multiple factions are vying for control of the forest (or just reputation) in their own, unique way.";

		String reviewText = "Chase guns Letter of Marque wherry trysail matey fathom quarter starboard belaying pin gangplank. Wench Cat o'nine tails ballast rigging sheet fire in the hole rope's end spike mutiny Shiver me timbers. Lookout crow's nest dead men tell no tales gangway clipper snow brigantine spanker schooner hail-shot."
				+ "<br /><br />"
				+ "Lass loaded to the gunwalls grog lateen sail pillage gangplank driver splice the main brace hulk knave. Flogging grog blossom scuttle main sheet salmagundi rum stern provost hearties wench. Lugger blow the man down overhaul swing the lead man-of-war snow furl run a shot across the bow line scourge of the seven seas.";

		String weblink = "http://ledergames.com/root/";
		
		Collection<String> gameTags = new ArrayList<>();
		gameTags.add("Competitive");
		gameTags.add("Board");
		gameTags.add("Asymmetric");
		gameTags.add("Cute Animals");
		gameTags.add("Area Control");
		
		String exName = "Root: The Riverfolk Expansion";
		String exNumPlayers = "1-6";
		String exSynopsis = "Riverfolk add 2 new factions, an additional Vagabond, and an AI-played Cat faction to increase the opportunities, variants, players, and fun.";
		String exWeblink = "https://leder-games.myshopify.com/products/root-the-riverfolk-expansion?variant=19417078726714";

		Expansion expan = new Expansion(id, exName, exNumPlayers, exSynopsis, exWeblink);
		

		Review rev = new Review(id, name, numPlayers, lengthOfPlay,
				new GregorianCalendar(2018, 7, 1), synopsis, reviewText, weblink, gameTags, expan);
		allReviews.put(rev.getId(), rev);
		allExpansions.put(expan.getId(), expan);
	}

	private void createReview4() {
		long id = 4L;
		String name = "The Grizzled";
		String numPlayers = "3-5";
		String lengthOfPlay = "30 minutes";
		
		String synopsis = "Playing as a group of WWI soldiers from France, your objective is not to win the war, just survive it.";
		
		String reviewText = "Barkadeer hang the jib pink weigh anchor reef sails deadlights chandler Spanish Main tender marooned. Line nipper marooned lugsail lateen sail weigh anchor aye strike colors Shiver me timbers provost. Maroon grapple lanyard log scurvy American Main spanker Jack Ketch yardarm Blimey.\r\n"
				+ "<br /><br />"
				+ "Sheet bilged on her anchor jib wench stern jack swab fire in the hole clap of thunder gangplank. Poop deck gangplank ballast wherry lad starboard fire ship code of conduct reef crack Jennys tea cup. Draft jury mast strike colors gibbet measured fer yer chains lookout avast spyglass scurvy code of conduct.";
		
		String weblink = "https://cmon.com/product/the-grizzled/the-grizzled";
		
		Collection<String> gameTags = new ArrayList<>();
		gameTags.add("Cooperative");
		gameTags.add("WWI");
		gameTags.add("Card");
		gameTags.add("Strategy");
		
		String exName = "The Grizzled: At Your Orders!";
		String exNumPlayers = "1-5";
		String exSynopsis = "At Your Orders! adds a task deck that you can modify the difficulty.  This expansion helps balance the game in ways due to the new mechanics introduced.  The expansion also adds a solo-play variant.";
		String exWeblink = "https://www.coolstuffinc.com/p/225304";

		Expansion expan = new Expansion(id, exName, exNumPlayers, exSynopsis, exWeblink);
		
		
		Review rev = new Review(id, name, numPlayers, lengthOfPlay, new GregorianCalendar(2015, 9, 1),
				synopsis, reviewText, weblink, gameTags, expan);
		allReviews.put(rev.getId(), rev);
		allExpansions.put(expan.getId(), expan);
	}
	
	private void createReview5() {
		long id = 5L;
		String name = "The Mind";
		String numPlayers = "2-4";
		String lengthOfPlay = "20 minutes";
		
		String synopsis = "Simple rules: Play the cards in sequence.  The catch: you can't discuss what's in your hand at all.";
		
		String reviewText = "Jack Tar jib Jack Ketch jack killick jolly boat lad sutler keel parrel. Rigging bring a spring upon her cable crimp Gold Road lookout landlubber or just lubber gally Jack Ketch topmast heave to. Bowsprit lookout scourge of the seven seas Shiver me timbers American Main keelhaul jury mast clap of thunder black spot knave."
				+ "<br /><br />"
				+ "Gun jolly boat ye scallywag maroon fire in the hole belaying pin Blimey parley bucko. Nipperkin hang the jib reef sails swab jury mast gabion Sea Legs Corsair quarter coxswain. Nelsons folly belaying pin fathom skysail stern Davy Jones' Locker lateen sail Sea Legs wench hardtack.";
		
		String weblink = "https://www.pandasaurusgames.com/product/the-mind/";
		
		Collection<String> gameTags = new ArrayList<>();
		gameTags.add("Cooperative");
		gameTags.add("Card");
		gameTags.add("Strategy");
		gameTags.add("Abstract");
		gameTags.add("Social");
		
		Review rev = new Review(id, name, numPlayers, lengthOfPlay,
				new GregorianCalendar(2018, 5, 1), synopsis, reviewText, weblink, gameTags);
		allReviews.put(rev.getId(), rev);
	}
	
	private void createReview6() {
		long id = 6L;
		String name = "Way of the Panda";
		String numPlayers = "2-4";
		String lengthOfPlay = "60 - 90 minutes";
		
		String synopsis = "Your clan and other panda clans are attempting to retake and rebuild your land from the human ninjas.";
		
		String reviewText = "Careen bowsprit bilge water red ensign ye lee chase guns me list Spanish Main. Ho blow the man down salmagundi barque Cat o'nine tails Spanish Main snow crow's nest grapple plunder. Grapple rope's end quarterdeck scuttle fire ship marooned brig me topgallant bring a spring upon her cable."
				+ "<br /><br />"
				+ "Parley crack Jennys tea cup Buccaneer gabion Plate Fleet pinnace log square-rigged belaying pin yardarm. Lee log jury mast chase line Arr draught mizzen quarterdeck Pieces of Eight. Bring a spring upon her cable cackle fruit gangway to go on account matey crack Jennys tea cup Plate Fleet six pounders hempen halter grog blossom.";
		
		String weblink = "https://cmon.com/product/way-of-the-panda/way-of-the-panda";
		
		Collection<String> gameTags = new ArrayList<>();
		gameTags.add("Competitive");
		gameTags.add("Board");
		gameTags.add("Strategy");
		gameTags.add("Pandas");
		gameTags.add("Asia");
		gameTags.add("Ninjas");
		
		Review rev = new Review(id, name, numPlayers, lengthOfPlay,
				new GregorianCalendar(2018, 5, 1), synopsis, reviewText, weblink, gameTags);
		allReviews.put(rev.getId(), rev);
	}

}
