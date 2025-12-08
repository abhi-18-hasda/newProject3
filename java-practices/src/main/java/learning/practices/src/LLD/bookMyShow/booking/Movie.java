package learning.practices.src.LLD.bookMyShow.booking;

public class Movie {
	private int movieId;
	private String name;
	private int duration;
	private String language;
	private String genre;
	public Movie() {
		
	}
	public Movie(int movieId, String name, int duration, String language, String genre) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.duration = duration;
		this.language = language;
		this.genre = genre;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + ", duration=" + duration + ", language=" + language
				+ ", genre=" + genre + "]";
	}
}
