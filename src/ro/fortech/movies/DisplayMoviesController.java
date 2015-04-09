package ro.fortech.movies;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ro.fortech.movies.MovieAccess;
import ro.fortech.movies.Movie;

@Stateless
public class DisplayMoviesController {
	
	@Inject
	private MovieAccess movieAccess;

	public List<Movie> displayMovies() {

		return movieAccess.searchDocument();

	}

}
