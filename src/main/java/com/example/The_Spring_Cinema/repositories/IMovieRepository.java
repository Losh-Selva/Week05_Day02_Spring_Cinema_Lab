package com.example.The_Spring_Cinema.repositories;

import com.example.The_Spring_Cinema.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovieRepository extends JpaRepository<Movie, Integer> {

}
