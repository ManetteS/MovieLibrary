package movielibrary;

public class Movie {
	private String title;
	private int releaseYear;
	private String genre;
	private String actors;
	private String plot;
	
	public Movie(String title, int releaseYear, String genre, String actors, String plot) {
		this.title = title;
		this.releaseYear = releaseYear;
		this.genre = genre;
		this.actors = actors;
		this.plot = plot;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getReleaseYear() {
		return this.releaseYear;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public String getActors() {
		return this.actors;
	}
	
	public String getPlot() {
		return this.plot;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setActors(String actors) {
		this.actors = actors;
	}
	
	public void setPlot(String plot) {
		this.plot = plot;
	}
	
	public String info() {
		return this.getTitle()+" ("+this.getReleaseYear()+", "+this.getGenre()+") [casting: "+this.getActors()+"]: "+this.getPlot();
	}
	
	@Override
	public String toString() {
		return this.getTitle()+" ("+this.getReleaseYear()+")";
	}
}
