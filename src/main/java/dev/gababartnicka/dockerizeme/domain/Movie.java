package dev.gababartnicka.dockerizeme.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Movie {

    @Id
    private String id;

    private String title;
    private Double rating;
    private Long number;
}
