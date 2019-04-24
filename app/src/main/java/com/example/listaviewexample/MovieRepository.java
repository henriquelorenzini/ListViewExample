package com.example.listaviewexample;

import java.util.Arrays;
import java.util.List;

class Movie{
    private String title;

    public Movie(String title){this.title = title; }

    @Override
        public  String toString() {
          return this.title;
    }

}


public class MovieRepository {
    private List<Movie> models;

    public MovieRepository() {
        this.models = Arrays.asList(
                new Movie("Donnie Darko"),
                new Movie("Back To The Future"),
                new Movie("Green Book"),
                new Movie("Get Out"),
                new Movie("Us"),
                new Movie("Guava Island")
        );
    }
    public Movie get(Integer id){
        return this.models.get(id);

    }

    public List<Movie> getAll(){
        return this.models;
    }
}
