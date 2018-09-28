package wcci.module5.project.reviews;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;

public class Review {

	private Long id;
	private String name;
	private String numPlayers;
	private String lengthOfPlay;
	private Calendar releaseDate;
	private String synopsis;
	private String reviewText;
	private String weblink;
	private Collection<String> gameTags;

	public Review(long id, String name, String numPlayers, String lengthOfPlay, Calendar releaseDate, String synopsis, String reviewText, String weblink, Collection<String> gameTags) {
		this.id = id;
		this.name = name;
		this.numPlayers = numPlayers;
		this.lengthOfPlay = lengthOfPlay;
		this.releaseDate = releaseDate;
		this.synopsis = synopsis;
		this.reviewText = reviewText;
		this.weblink = weblink;
		this.gameTags = gameTags;
	}

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNumPlayers() {
		return numPlayers;
	}
	
	public String getLengthOfPlay() {
		return lengthOfPlay;
	}
	
	public String getReleaseDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-yyyy");
		return sdf.format(releaseDate.getTime());
	}
	
	public String getSynopsis() {
		return synopsis;
	}
	
	public String getReviewText() {
		return reviewText;
	}

	public String getWeblink() {
		return weblink;
	}
	
	public Collection<String> getGameTags() {
		return gameTags;
	}
	
}
