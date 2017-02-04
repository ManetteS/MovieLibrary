package movielibrary;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
	
	@Resource
	private Library library = new Library();
	
	@RequestMapping("/")
    public String showLibrary() {
        String result = "Current movies :\n";
		for (Movie movie : library.display()) {
        	result += movie.toString()+"\n";
        };
        return result;
    }
	
}
