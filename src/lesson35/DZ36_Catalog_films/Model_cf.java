package lesson35.DZ36_Catalog_films;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model_cf {
    private Map<String, Film> films;

    public Model_cf() {
        this.films = new LinkedHashMap<>();
    }

    public void addFilm(Map dictFilm) {
        Film film = new Film(dictFilm);
        films.put((String) dictFilm.get("название"), film);
    }

    public Collection getAllFilms() {
        return films.values();
    }

}

class Film {
    private String title;
    private String genre;
    private String director;
    private String year;
    private String time;
    private String studio;
    private String actors;

    public Film(Map dictFilm) {
        this.title = (String) dictFilm.get("название");
        this.genre = (String) dictFilm.get("жанр");
        this.director = (String) dictFilm.get("режиссера");
        this.year = (String) dictFilm.get("год выпуска");
        this.time = (String) dictFilm.get("длительность");
        this.studio = (String) dictFilm.get("студию");
        this.actors = (String) dictFilm.get("актеров");
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getYear() {
        return year;
    }

    public String getStudio() {
        return studio;
    }

    public String getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return title + director;
    }
}
