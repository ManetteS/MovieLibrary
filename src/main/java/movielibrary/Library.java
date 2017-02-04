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
	
	public ArrayList<Movie> display() {
		return movies;
	}
	
	private Movie find(String title) throws Error {
		int i = 0;
		while (i < this.movies.size() && !this.movies.get(i).getTitle().equals(title)) {
			i++;
		}
		if (i == this.movies.size()) {
			throw new Error("This movie does not exist");
		} else {
			return this.movies.get(i);
		}
	}
	
	public void addMovie(String title, int releaseYear, String genre, String actors, String plot) {
		this.movies.add(new Movie(title, releaseYear, genre, actors, plot));
	}
	
	public Movie retrieveMovie(String title) {
		return this.find(title);
	}
	
	public void updateMovie(String title, String newTitle, int releaseYear, String genre, String actors, String plot) {
		Movie movie = this.find(title);
		movie.setTitle(newTitle);
		movie.setReleaseYear(releaseYear);
		movie.setGenre(genre);
		movie.setActors(actors);
		movie.setPlot(plot);
	}
	
	public void deleteMovie(String title) {
		this.movies.remove(title);
	}
}
