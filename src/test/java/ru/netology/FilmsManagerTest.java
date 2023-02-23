package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    @Test
    public void addFilms() {
        FilmsManager manager = new FilmsManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilm() {
        FilmsManager manager = new FilmsManager();
        manager.add("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void noFilms() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void limitFilmsDefault () {
        FilmsManager limit = new FilmsManager();
        limit.add("Film 1");
        limit.add("Film 2");
        limit.add("Film 3");
        limit.add("Film 4");

        String[] expected = {"Film 4", "Film 3","Film 2","Film 1"};
        String[] actual = limit.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void limitFilms () {
        FilmsManager limit = new FilmsManager(3);
        limit.add("Film 1");
        limit.add("Film 2");
        limit.add("Film 3");
        limit.add("Film 4");

        String[] expected = {"Film 4", "Film 3","Film 2"};
        String[] actual = limit.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
