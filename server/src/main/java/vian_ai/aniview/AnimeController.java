package vian_ai.aniview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "*")
public class AnimeController {
    @Autowired
    private AnimeService animeService;

    @GetMapping
    public ResponseEntity<List<Anime>> getMovies() {
        return new ResponseEntity<List<Anime>>(animeService.findAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Anime>> getSingleMovie(@PathVariable String movId) {
        return new ResponseEntity<Optional<Anime>>(animeService.findMovieBymovId(movId), HttpStatus.OK);
    }
}
