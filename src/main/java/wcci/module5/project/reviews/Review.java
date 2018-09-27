package wcci.module5.project.reviews;

public class Review {

	private Long id;
	private String name;
	private String numPlayers;

	public Review(long id, String name, String numPlayers) {
		this.id = id;
		this.name = name;
		this.numPlayers = numPlayers;
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

}
