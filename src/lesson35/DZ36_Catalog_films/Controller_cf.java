package lesson35.DZ36_Catalog_films;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class Controller_cf {
    private Model_cf filmModel;
    private View_cf userInterface;

    public Controller_cf() {
        this.filmModel = new Model_cf();
        this.userInterface = new View_cf();
    }

    void run() {
        String answer = "";
        while (!answer.equals("q")) {
            answer = userInterface.waitUserAnswer();
            checkUserAnswer(answer);
        }
    }

    public void checkUserAnswer(String answer) {
        if (answer.equals("1")) {
            Map film = userInterface.addUserFilm();
            filmModel.addFilm(film);
        } else if (answer.equals("2")) {
            Collection films = filmModel.getAllFilms();
            userInterface.showAllFilms(films);
        }
    }
}

