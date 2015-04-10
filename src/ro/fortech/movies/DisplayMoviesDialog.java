package ro.fortech.movies;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

@ManagedBean(name = "displayMoviesDialog")
@RequestScoped
public class DisplayMoviesDialog implements Serializable {

	private static final long serialVersionUID = -1718678896995420865L;

	@Inject
	private DisplayMoviesController displayCtrl;
	private List<Movie> moviesList;

	public DisplayMoviesDialog() {
		System.out.println("sdasd");
	}

	@PostConstruct
	public void init() {
		setMoviesList(displayCtrl.displayMovies());
	}

	public List<Movie> getMoviesList() {
		return moviesList;
	}

	public void setMoviesList(List<Movie> moviesList) {
		this.moviesList = moviesList;
	}
}
