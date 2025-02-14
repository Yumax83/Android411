package lesson35.DZ36_Catalog_films;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View_cf {
    Scanner input = new Scanner(System.in);

    public String waitUserAnswer() {
        System.out.println("================ Редактирование данных каталога фильмов ================");
        System.out.println("Действия со фильмами: ");
        System.out.println("1 - добавление фильма" +
                "\n2 - каталог фильмов" +
                "\n3 - просмотр определенного фильма" +
                "\n4 - удаление фильма" +
                "\nq - выход из программы");
        System.out.print("Выберите вариант действия: ");
        String userAnswer = input.nextLine();
        System.out.println("==============================================================");
        return userAnswer;
    }

    public Map addUserFilm() {
        Map<String, String> dictFilm = new LinkedHashMap<>();
        dictFilm.put("название", "");
        dictFilm.put("жанр", "");
        dictFilm.put("режиссера", "");
        dictFilm.put("год выпуска", "");
        dictFilm.put("длительность", "");
        dictFilm.put("студию", "");
        dictFilm.put("актеров", "");
        for (Map.Entry<String, String> el : dictFilm.entrySet()) {
            System.out.print("Введите " + el.getKey() + " фильма: ");
            dictFilm.put(el.getKey(), input.nextLine());
        }
        System.out.println("==============================================================");
        return dictFilm;

    }

    public void showAllFilms(Collection films) {
        System.out.println("====================== Список фильмов ========================");
        for (var element : films) {
            System.out.println(element);
        }
        System.out.println("==============================================================");

    }

}
