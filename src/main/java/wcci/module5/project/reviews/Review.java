package wcci.module5.project.reviews;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;

public class Review {

	private Long id;
	private String name;
	private String numPlayers;
	private String image;
	private String lengthOfPlay;
	private Collection<String> gameTags;
	private Calendar releaseDate;

	public Review(long id, String name, String numPlayers, String image, String lengthOfPlay, Calendar releaseDate, Collection<String> gameTags) {
		this.id = id;
		this.name = name;
		this.numPlayers = numPlayers;
		this.image = image;
		this.lengthOfPlay = lengthOfPlay;
		this.releaseDate = releaseDate;
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
	
	public String getImage() {
		return image;
	}
	
	public String getLengthOfPlay() {
		return lengthOfPlay;
	}
	
	public Collection<String> getGameTags() {
		return gameTags;
	}
	
	public String getReleaseDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-yyyy");
//		Calendar calendar = new GregorianCalendar(2015, 10, 1);
		return sdf.format(releaseDate.getTime());
	}

}
