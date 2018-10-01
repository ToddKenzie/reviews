package wcci.module5.project.reviews;

public class Expansion {
	
	private long id;
	private String name;
	private String numPlayers;
	private String synopsis;
	private String weblink;

	public Expansion(long id, String name, String numPlayers, String synopsis, String weblink) {
		this.id = id;
		this.name = name;
		this.numPlayers = numPlayers;
		this.synopsis = synopsis;
		this.weblink = weblink;
	}
	
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNumPlayers() {
		return numPlayers;
	}
	
	public String getSynopsis() {
		return synopsis;
	}
	
	public String getWeblink() {
		return weblink;
	}

}
