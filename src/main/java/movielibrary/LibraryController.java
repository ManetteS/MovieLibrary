package movielibrary;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
	
	@Resource
	private Library library;
	
	@RequestMapping("/")
    public ArrayList<Movie> showLibrary() {
        return library.display();
    }
	
}
