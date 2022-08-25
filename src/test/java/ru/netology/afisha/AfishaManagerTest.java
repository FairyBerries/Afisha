package ru.netology.afisha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTest {

    @Test
    public void shouldNonFilms() {
        AfishaManager manager = new AfishaManager();
        Film[] films = manager.findAll();

        assertEquals(0, films.length);
    }

    @Test
    public void shouldOneFilm() {
        AfishaManager manager = new AfishaManager();

        Film[] expectedFilms = new Film[1];
        Film film = new Film("Sun");
        expectedFilms[0] = film;
        manager.add(film);
        Film[] films = manager.findAll();

        assertArrayEquals(expectedFilms, films);
    }

    @Test
    public void shouldLotsFilms() {
        AfishaManager manager = new AfishaManager();

        Film[] expectedFilms = new Film[3];

        Film film1 = new Film("Sun");
        manager.add(film1);
        expectedFilms[0] = film1;

        Film film2 = new Film("Moon");
        manager.add(film2);
        expectedFilms[1] = film2;

        Film film3 = new Film("Star");
        manager.add(film3);
        expectedFilms[2] = film3;

        Film[] films = manager.findAll();

        assertArrayEquals(expectedFilms, films);
    }

    @Test
    public void shouldNonLastFilms() {
        AfishaManager manager = new AfishaManager();
        Film[] films = manager.findLast();
        Film[] expectedFilms = new Film[0];

        assertArrayEquals(expectedFilms, films);
    }

    @Test
    public void shouldOneLastFilm() {
        AfishaManager manager = new AfishaManager();
        Film[] expectedFilms = new Film[1];
        Film film = new Film("Sun");
        manager.add(film);
        expectedFilms[0] = film;

        Film[] films = manager.findLast();

        assertArrayEquals(expectedFilms, films);
    }

    @Test
    public void shouldLotsLastFilms() {
        AfishaManager manager = new AfishaManager();
        Film[] expectedFilms = new Film[3];

        Film film1 = new Film("Sun");
        manager.add(film1);
        expectedFilms[2] = film1;

        Film film2 = new Film("Moon");
        manager.add(film2);
        expectedFilms[1] = film2;

        Film film3 = new Film("Star");
        manager.add(film3);
        expectedFilms[0] = film3;

        Film[] films = manager.findLast();

        assertArrayEquals(expectedFilms, films);
    }

    @Test
    public void shouldAllLastFilms() {
        AfishaManager manager = new AfishaManager(5);
        Film[] expectedFilms = new Film[5];

        Film film1 = new Film("Sun");
        manager.add(film1);

        Film film2 = new Film("Moon");
        manager.add(film2);
        expectedFilms[4] = film2;

        Film film3 = new Film("Star");
        manager.add(film3);
        expectedFilms[3] = film3;

        Film film4 = new Film("Wind");
        manager.add(film4);
        expectedFilms[2] = film4;

        Film film5 = new Film("Snow");
        manager.add(film5);
        expectedFilms[1] = film5;

        Film film6 = new Film("Storm");
        manager.add(film6);
        expectedFilms[0] = film6;

        Film[] films = manager.findLast();

        assertArrayEquals(expectedFilms, films);
    }
}
