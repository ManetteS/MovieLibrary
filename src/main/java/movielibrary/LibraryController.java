package movielibrary;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
        return library.retrieveMovie(title).info();
    }
}
