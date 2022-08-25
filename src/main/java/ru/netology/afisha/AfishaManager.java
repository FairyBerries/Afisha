package ru.netology.afisha;

public class AfishaManager {

    private Film[] films = new Film[0];
    private int limitFilms = 10;

    public AfishaManager() {
    }

    public AfishaManager(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    public void add(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] findAll() {

        return films;
    }

    public Film[] findLast() {
        int resultLength;
        if (limitFilms > films.length) {
            resultLength = films.length;
        } else {
            resultLength = limitFilms;
        }

        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }


}
