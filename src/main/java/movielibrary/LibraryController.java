package movielibrary;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
	
	@Resource
	private Library library = new Library();
	
	@RequestMapping("/")
    public String showLibrary() {
        String result = "Current movies: ";
		for (Movie movie : library.getAll()) {
        	result += movie.toString()+" | ";
        };
        return result;
    }
	
	@RequestMapping("/{title}")
    public String retrieve(@PathVariable(value = "title") String title) {
        Movie movie = library.retrieveMovie(title);
		if (movie == null) {
			return "This movie does not exist.";
		} else {
			return movie.info();
		}
    }
	
	@RequestMapping("/delete")
    public String delete(@RequestParam(value="title", defaultValue="") String title) {
        if (library.deleteMovie(title)) {
        	return "The movie '"+title+"' has been deleted.";
        } else {
        	return "This movie does not exist.";
        }
    }
	
	@RequestMapping("/update")
    public String update(@RequestParam(value="title", defaultValue="") String title,
    		@RequestParam(value="newTitle", defaultValue="") String newTitle,
    		@RequestParam(value="releaseYear", defaultValue="") String releaseYear,
    		@RequestParam(value="genre", defaultValue="") String genre,
    		@RequestParam(value="actors", defaultValue="") String actors,
    		@RequestParam(value="plot", defaultValue="") String plot) {
        if (library.updateMovie(title,newTitle,releaseYear,genre,actors,plot)) {
        	return "The movie '"+title+"' has been updated.";
        } else {
        	return "This movie does not exist.";
        }
    }
	
	@RequestMapping("/add")
    public String add(@RequestParam(value="title", defaultValue="") String title,
    		@RequestParam(value="releaseYear", defaultValue="") String releaseYear,
    		@RequestParam(value="genre", defaultValue="") String genre,
    		@RequestParam(value="actors", defaultValue="") String actors,
    		@RequestParam(value="plot", defaultValue="") String plot) {
		if (library.addMovie(title,releaseYear,genre,actors,plot)) {
        	return "The movie '"+title+"' has been added.";
        } else {
        	return "The title and/or the release year were missing. The movie has not been added.";
        }
    }

	@RequestMapping("/byYear")
    public String retrieveByYear(@RequestParam(value="year", defaultValue="") String year) {
        try {
        	int releaseYear = Integer.parseInt(year);
        	ArrayList<Movie> movies = library.getByYear(releaseYear);
        	if (movies.size() > 0) {
        		String result = "Movies from "+releaseYear+" : ";
        		for (Movie movie : movies) {
                	result += movie.toString()+" | ";
                };
                return result;
        	} else {
        		return "There is currently no movie from this year in memory.";
        	}
        } catch(NumberFormatException er) {
        	return "The specified year was incorrect.";
        }
    }
}
