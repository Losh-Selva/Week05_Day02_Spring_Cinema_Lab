package com.example.The_Spring_Cinema.services;

import com.example.The_Spring_Cinema.models.Movie;
import com.example.The_Spring_Cinema.models.Reply;
import com.example.The_Spring_Cinema.repositories.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    Movie movie;
    @Autowired
    IMovieRepository movieRepository;

    public MovieService() {
    }

        //List All Movies
        public List<Movie> getAll() {
            return movieRepository.findAll();
        }
        //Get Movie by ID
        public Optional<Movie> getMovieById (int id){
            return movieRepository.findById(id);
        }

        //Save Movies
        public Movie saveMovie(){
            return movieRepository.save(movie);
            }
        //Deleting movie with reply method
        public Reply deleteMovie(){
        Reply reply;
            movieRepository.delete(movie);
                return new Reply(
                    true,
                    "Successfully deleted movie"
                );
            }
        public Movie updateMovie(int id, String title){
        Movie changedMovie;
          movieRepository.findById(movie.getId());
          movie.setTitle(movie.getTitle());
            return movieRepository.save(movie);
        }
}
