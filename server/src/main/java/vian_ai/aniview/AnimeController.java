package vian_ai.aniview;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")

public class AnimeController {
    @Autowired
    private AnimeService animeService;
    
    @GetMapping
    public ResponseEntity<List<Anime>> getAllMovies() {
        return new ResponseEntity<List<Anime>>(animeService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{movId}")
    public ResponseEntity<Optional<Anime>> getSingleMovie(@PathVariable String movId) {
        return new ResponseEntity<Optional<Anime>>(animeService.singleMovie(movId), HttpStatus.OK);
    }
}
