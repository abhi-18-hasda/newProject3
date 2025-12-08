package learning.practices.src.LLD.bookMyShow.booking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import learning.practices.src.LLD.bookMyShow.enums.City;

public class MovieController {
	Map<City, List<Movie>> map;
	List<Movie> movies;
	
    public MovieController() {
        map = new HashMap<>();
        movies = new ArrayList<>();
    }

	public MovieController(Map<City, List<Movie>> map, List<Movie> movies) {
		super();
		this.map = map;
		this.movies = movies;
	}
	public Map<City, List<Movie>> getMap() {
		return map;
	}
	public void setMap(Map<City, List<Movie>> map) {
		this.map = map;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	@Override
	public String toString() {
		return "MovieController [map=" + map + ", movies=" + movies + "]";
	}
	public void addMovie(Movie movie, City city) {
		movies.add(movie);
        List<Movie> moviesInCity = map.getOrDefault(city, new ArrayList<>());
        moviesInCity.add(movie);
        map.put(city, moviesInCity);
	}
	
	public Movie getMovieByName(String movieName) {
        for (Movie movie : movies) {
            if ((movie.getName()).equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

	public List<Movie> getMoviesByCity(City city) {
        return map.get(city);
    }

	public void removeMovie(Movie movie, City city) {
        movies.remove(movie);
        List<Movie> moviesInCity = map.get(city);
        moviesInCity.remove(movie);
        map.put(city, moviesInCity);
    }

    public void updateMovie(Movie movie, City city) {
        removeMovie(movie, city);
        addMovie(movie, city);
    }

    public void updateMovieById(int movieId, Movie movie) {
        for (Movie movieObj : movies) {
            if (movieObj.getMovieId() == movieId) {
                movieObj.setName(movieObj.getName());
                movieObj.setDuration(movieObj.getDuration());
                movieObj.setGenre(movieObj.getGenre());
                movieObj.setLanguage(movieObj.getLanguage());
                break;
            }
        }
    }

    public void deleteMovieById(int movieId) {
        for (Movie movieObj : movies) {
            if (movieObj.getMovieId() == movieId) {
                movies.remove(movieObj);
                break;
            }
        }
    }

}
