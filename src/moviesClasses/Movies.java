package movies_classes;

import java.util.*;

public class Movies {
    TreeSet<Movie> movieList = new TreeSet<>();

    public int countMovies(){
        return movieList.size();
    }

    public TreeSet<Movie> getMovieList(){
        return movieList;
    }

    //get descended sort of collection
    public TreeSet<Movie> getDescendedMovieList(){
        TreeSet<Movie> descendedMovieList = new TreeSet<>(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.compareTo(o1);
            }
        });
        descendedMovieList.addAll(movieList);
        return descendedMovieList;
    }
}
