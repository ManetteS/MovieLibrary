package movielibrary;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Library {
	private ArrayList<Movie> movies;
	
	public Library() {
		this.movies = new ArrayList<Movie>();
		
		// For the tests
		this.movies.add(new Movie("The Godfather",1972,"Crime","Marlon Brando; Al Pacino","The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."));
		this.movies.add(new Movie("The Dark Knight",2008,"Action","Christian Bale; Heath Ledger","When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, the caped crusader must come to terms with one of the greatest psychological tests of his ability to fight injustice."));
		this.movies.add(new Movie("The Good, the Bad and the Ugly",1966,"Western","Clint Eastwood; Eli Wallach; Lee Van Cleef","A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery."));
	}
	
	/**
	 * Returns the complete list of movies.
	 */
	public ArrayList<Movie> getAll() {
		return movies;
	}
	
	/**
	 * Returns the index of the first movie in list "movies" with the same title as the argument "title".
	 */
	private int find(String title) {
		int i = 0;
		while (i < this.movies.size() && !this.movies.get(i).getTitle().equals(title)) {
			i++;
		}
		if (i == this.movies.size()) {
			return -1;
		} else {
			return i;
		}
	}
	
	/**
	 * Adds a movie to list "movies", created from the five arguments.
	 */
	public boolean addMovie(String title, String releaseYear, String genre, String actors, String plot) {
		try {
			int year = Integer.parseInt(releaseYear);
			if (title.equals("")) {
				return false;
			} else {
				this.movies.add(new Movie(title, year, genre, actors, plot));
				return true;
			}
		} catch(NumberFormatException er) {
			return false;
		}
	}
	
	/**
	 * Returns the first movie in list "movies" with the same title as the argument "title".
	 */
	public Movie retrieveMovie(String title) {
		int index = this.find(title);
		if (index >= 0) {
			return this.movies.get(index);
		} else {
			return null;
		}
	}
	
	/**
	 * Updates the first movie in list "movies" with the same title as the argument "title".
	 */
	public boolean updateMovie(String title, String newTitle, String releaseYear, String genre, String actors, String plot) {
		int index = this.find(title);
		if (index >= 0 && !title.equals("")) {
			int year = 0;
			try {
				year = Integer.parseInt(releaseYear);
			} catch(NumberFormatException er) {}
			Movie movie = this.movies.get(index);
			movie.setTitle(newTitle);
			movie.setReleaseYear(year);
			movie.setGenre(genre);
			movie.setActors(actors);
			movie.setPlot(plot);
			return true;
			
		} else {
			return false;
		}
	}
	
	/**
	 * Deletes the first movie in list "movies" with the same title as the argument "title".
	 */
	public boolean deleteMovie(String title) {
		int index = this.find(title);
		if (index >= 0) {
			this.movies.remove(index);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Returns the list of every movie from list "movies" released the same year as the argument.
	 */
	public ArrayList<Movie> getByYear(int releaseYear) {
		ArrayList<Movie> result = new ArrayList<Movie>();
		for (Movie movie : this.movies) {
			if (movie.getReleaseYear() == releaseYear) {
				result.add(movie);
			}
		}
		return result;
	}
}
