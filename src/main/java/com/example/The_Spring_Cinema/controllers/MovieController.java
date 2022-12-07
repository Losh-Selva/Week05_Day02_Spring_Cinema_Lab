package com.example.The_Spring_Cinema.controllers;

import com.example.The_Spring_Cinema.models.Movie;
import com.example.The_Spring_Cinema.models.Reply;
import com.example.The_Spring_Cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
    @Autowired
    MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        List<Movie> movies = movieService.getAll();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity <Movie> getMovieById(@PathVariable int id){
        Optional<Movie> movie = movieService.getMovieById(id);
        if (movie.isPresent()) {
            return new ResponseEntity<>(movie.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping()
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        Movie movieSaved = movieService.saveMovie();
        return new ResponseEntity<>(movieSaved, HttpStatus.CREATED);
    }
    @DeleteMapping()
    public ResponseEntity<Reply> deleteMovie(@RequestBody Movie movie){
        Reply reply = movieService.deleteMovie();
        return new ResponseEntity<>( HttpStatus.ACCEPTED);
    }
    @PatchMapping(value = "/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie, @PathVariable int id, @PathVariable String title) {
        Movie updatedMovie = movieService.updateMovie( id, title);
        return new ResponseEntity<>(updatedMovie, HttpStatus.OK);
    }
}
