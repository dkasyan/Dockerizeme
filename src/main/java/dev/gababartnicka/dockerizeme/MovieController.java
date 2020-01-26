package dev.gababartnicka.dockerizeme;

import dev.gababartnicka.dockerizeme.domain.Movie;
import dev.gababartnicka.dockerizeme.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/movies")
@RequiredArgsConstructor
public class MovieController {
    private final MovieRepository movieRepository;

    @GetMapping
    public ResponseEntity<List<Movie>> getAll() {
        final List<Movie> all = movieRepository.findAll();
        return ResponseEntity.ok(all);
    }

    @GetMapping("/init")
    public List<Movie> initialize() {
        if(movieRepository.count() != 0)
            return Collections.emptyList();

        Movie movie1 = new Movie();
        movie1.setNumber(1L);
        movie1.setTitle("CHILLING ADVENTURES OF SABRINA");
        movie1.setRating(7.3);

        Movie movie2 = new Movie();
        movie2.setNumber(2L);
        movie2.setTitle("Joker");
        movie2.setRating(8.5);


        Movie movie3 = new Movie();
        movie3.setNumber(3L);
        movie3.setTitle("You");
        movie3.setRating(7.0);


        movieRepository.insert(movie1);
        movieRepository.insert(movie2);
        movieRepository.insert(movie3);

        return movieRepository.findAll();
    }
}
