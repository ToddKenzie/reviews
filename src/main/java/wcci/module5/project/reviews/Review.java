package wcci.module5.project.reviews;

public class Review {

	private Long id;
	private String name;
	private String numPlayers;
	private String image;
	private String gameMode;
	private String lengthOfPlay;

	public Review(long id, String name, String numPlayers, String image, String gameMode, String lengthOfPlay) {
		this.id = id;
		this.name = name;
		this.numPlayers = numPlayers;
		this.image = image;
		this.gameMode = gameMode;
		this.lengthOfPlay = lengthOfPlay;
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
	
	public String getGameMode() {
		return gameMode;
	}
	
	public String getLengthOfPlay() {
		return lengthOfPlay;
	}

}
