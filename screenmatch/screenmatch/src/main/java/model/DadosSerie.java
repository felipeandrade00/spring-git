package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosSerie(@JsonAlias("original_title") String titulo, @JsonAlias("tagline") String tagline, @JsonAlias("vote_average") String avaliacao){
    
}
