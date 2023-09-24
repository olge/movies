package org.example.Movies;
public class MoviesManager {
    private String[] movies = new String[0];
    private int limitMovies;

    public MoviesManager(int limitMovies) {
        this.limitMovies = limitMovies;
    }

    public MoviesManager() {
        this.limitMovies = 5;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limitMovies) {
            resultLength = movies.length;
        } else {
            resultLength = limitMovies;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}