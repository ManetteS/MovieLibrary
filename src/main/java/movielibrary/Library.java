package movielibrary;

import java.util.ArrayList;

public class Library {
	private ArrayList<Movie> movies;
	
	public Library() {
		this.movies = new ArrayList<Movie>();
	}
	
	public void addMovie(String title, int releaseYear, String genre, String actors, String plot) {
		this.movies.add(new Movie(title, releaseYear, genre, actors, plot));
	}
	
	public void retrieveMovie() {
		
	}
	
	public void updateMovie() {
		
	}
	
	public void deleteMovie() {
		
	}
}
