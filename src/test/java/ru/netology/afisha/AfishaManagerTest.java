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

        Film film = new Film("Sun");
        manager.add(film);
        Film[] films = manager.findAll();

        assertEquals(1, films.length);
    }

    @Test
    public void shouldLotsFilms() {
        AfishaManager manager = new AfishaManager();

        Film film1 = new Film("Sun");
        manager.add(film1);

        Film film2 = new Film("Moon");
        manager.add(film2);

        Film film3 = new Film("Star");
        manager.add(film3);

        Film[] films = manager.findAll();

        assertEquals(3, films.length);
    }



    }
