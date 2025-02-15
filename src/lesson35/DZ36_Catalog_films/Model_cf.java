package lesson35.DZ36_Catalog_films;
import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model_cf {
    private Map<String, Film> films;
    private String dbName;

    public Model_cf() {
        this.dbName = "dbFilms";
        this.films = loadData(); //new LinkedHashMap<>();
    }

    public void addFilm(Map dictFilm) {
        Film film = new Film(dictFilm);
        films.put((String) dictFilm.get("название"), film);
    }

    public Collection getAllFilms() {
        return films.values();
    }
    public Map getSingleFilm(String userFilm) {
        Film film = films.get(userFilm);
        Map<String, String> dictFilm = new LinkedHashMap<>();
        dictFilm.put("название", film.getTitle());
        dictFilm.put("жанр",film.getGenre());
        dictFilm.put("режиссер", film.getDirector());
        dictFilm.put("год выпуска", film.getYear());
        dictFilm.put("длительность", film.getTime());
        dictFilm.put("студия", film.getStudio());
        dictFilm.put("актеры", film.getActors());
        return dictFilm;
    }
    public Film removeFilm(String userTitle){
        return films.remove(userTitle);
    }
    public void saveData(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dbName))) {
            oos.writeObject(films);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public LinkedHashMap loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dbName))){
            return (LinkedHashMap) ois.readObject();
        }catch (Exception ex) {
            return  new LinkedHashMap();
        }
    }
}

class Film  implements Serializable {
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
    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return title+  " (" + director + ')';
    }
}
