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
		
		if (genre.equals("")) {
			this.genre = "unknown";
		} else {
			this.genre = genre;
		}
		
		if (actors.equals("")) {
			this.actors = "unknown";
		} else {
			this.actors = actors;
		}
		
		if (plot.equals("")) {
			this.plot = "unknown";
		} else {
			this.plot = plot;
		}
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
		if (!title.equals("")) {
			this.title = title;
		}
	}
	
	public void setReleaseYear(int releaseYear) {
		if (releaseYear != 0) {
			this.releaseYear = releaseYear;
		}
	}
	
	public void setGenre(String genre) {
		if (!genre.equals("")) {
			this.genre = genre;
		}
	}
	
	public void setActors(String actors) {
		if (!actors.equals("")) {
			this.actors = actors;
		}
	}
	
	public void setPlot(String plot) {
		if (!plot.equals("")) {
			this.plot= plot;
		}
	}
	
	/**
	 * Returns a string with complete data about the movie (title, release year, genre, actors and plot).
	 */
	public String info() {
		return this.getTitle()+" ("+this.getReleaseYear()+", "+this.getGenre()+") [casting: "+this.getActors()+"]: "+this.getPlot();
	}
	
	/**
	 * Returns a string with the title and the release year of the movie.
	 */
	@Override
	public String toString() {
		return this.getTitle()+" ("+this.getReleaseYear()+")";
	}
}
