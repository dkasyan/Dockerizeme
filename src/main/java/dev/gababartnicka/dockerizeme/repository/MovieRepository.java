package dev.gababartnicka.dockerizeme.repository;

import dev.gababartnicka.dockerizeme.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String> {
}
