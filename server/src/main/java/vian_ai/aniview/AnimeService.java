package vian_ai.aniview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository animeRepository;

    public List<Anime> findAllMovies() {
        return animeRepository.findAll();
    }

    public Optional<Anime> findMovieBymovId(String movId) {
        return animeRepository.findMovieBymovId(movId);
    }
}