package wcci.module5.project.reviews;

import java.util.Collection;

public class Review {

	private Long id;
	private String name;
	private String numPlayers;
	private String image;
	private String lengthOfPlay;
	private Collection<String> gameTags;

	public Review(long id, String name, String numPlayers, String image, String lengthOfPlay, Collection<String> gameTags) {
		this.id = id;
		this.name = name;
		this.numPlayers = numPlayers;
		this.image = image;
		this.lengthOfPlay = lengthOfPlay;
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

}
