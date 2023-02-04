package vian_ai.aniview;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository animeRepository;
    
    public List<Anime> allMovies() {
        return animeRepository.findAll();
    }

    public Optional<Anime> singleMovie(String movId) {
        return animeRepository.findMovieBymovId(movId);
    }
}
