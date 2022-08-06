package ru.netology.afisha;

public class AfishaManager {

    private Film[] Films = new Film[0];
    private int LimitFilms = 10;

    public AfishaManager() {
    }

    public AfishaManager(int limitFilms) {
        LimitFilms = limitFilms;
    }

    public void add(Film film) {
        int length = Films.length + 1;
        Film[] tmp = new Film[length];
        for (int i = 0; i < Films.length; i++) {
            tmp[i] = Films[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        Films = tmp;
    }

    public Film[] findAll() {

        return Films;
    }

    public Film[] findLast() {
        int resultLength;
        if (LimitFilms > Films.length)
        {
            resultLength = Films.length;
        }
        else {
            resultLength = LimitFilms;
        }

        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = Films.length - i - 1;
            result[i] = Films[index];
        }
        return result;
    }


}
