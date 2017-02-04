package movielibrary;

import java.util.ArrayList;

public class Library {
	private ArrayList<Movie> movies;
	
	public Library() {
		this.movies = new ArrayList<Movie>();
	}
	
	public ArrayList<Movie> display() {
		return movies;
	}
	
	public void addMovie(String title, int releaseYear, String genre, String actors, String plot) {
		this.movies.add(new Movie(title, releaseYear, genre, actors, plot));
	}
	
	public Movie retrieveMovie(int id) {
		return this.movies.get(id);
	}
	
	public void updateMovie(int id, String title, int releaseYear, String genre, String actors, String plot) {
		this.movies.get(id).setTitle(title);
		this.movies.get(id).setReleaseYear(releaseYear);
		this.movies.get(id).setGenre(genre);
		this.movies.get(id).setActors(actors);
		this.movies.get(id).setPlot(plot);
	}
	
	public void deleteMovie(int id) {
		this.movies.remove(id);
	}
}
