package ro.fortech.movies;

public class Movie {

	private String title;
	private String director;
	private int year;
	private int id;

	public Movie(String title, String director, int year, int id) {
		super();
		this.title = title;
		this.director = director;
		this.year = year;
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
