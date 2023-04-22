package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestOfManager {

    ManagerFilms manager = new ManagerFilms();
    String name1 = "Бладшот";
    String name2 = "Вперёд";
    String name3 = "Отель 'Белград'";
    String name4 = "Джентельмены";
    String name5 = "Человек-невидимка";
    String name6 = "Фильм";
    String name7 = "0";


    @Test
    public void ShouldFilmsManagerAddFilm() {
        manager.addFilmsManager(name1);
        manager.addFilmsManager(name2);
        manager.addFilmsManager(name3);
        manager.addFilmsManager(name4);
        manager.addFilmsManager(name5);


        String[] expected = {name1, name2, name3, name4, name5};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void maxFilm() {
        manager.addFilmsManager(name1);
        manager.addFilmsManager(name2);
        manager.addFilmsManager(name3);
        manager.addFilmsManager(name4);
        manager.addFilmsManager(name5);

        String[] expected = {name5, name4, name3, name2, name1};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ManagerFilmsTest() {

        manager.addFilmsManager(name1);
        manager.addFilmsManager(name2);
        manager.addFilmsManager(name3);
        manager.addFilmsManager(name4);
        manager.addFilmsManager(name5);


        String[] expected = {name5, name4, name3};
        String[] actual = manager.setManagerFilms(3);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ManagerFilmsTestBorder() {

        manager.addFilmsManager(name1);
        manager.addFilmsManager(name2);
        manager.addFilmsManager(name3);


        String[] expected = {name3, name2, name1};
        String[] actual = manager.setManagerFilms(5);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ManagerFilmsTestBorder2() {

        manager.addFilmsManager(name1);
        manager.addFilmsManager(name2);
        manager.addFilmsManager(name3);
        manager.addFilmsManager(name4);

        String[] expected = {name4};
        String[] actual = manager.setManagerFilms(1);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ManagerFilmsTestOne() {

        manager.addFilmsManager(name1);


        String[] expected = {name1};
        String[] actual = manager.setManagerFilms(3);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ManagerFilmsTestBasic() {

        manager.addFilmsManager(name1);
        manager.addFilmsManager(name2);
        manager.addFilmsManager(name3);
        manager.addFilmsManager(name4);
        manager.addFilmsManager(name5);
        manager.addFilmsManager(name6);


        String[] expected = {name6, name5, name4, name3, name2};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ManagerFilmsTestBasic2() {

        String[] expected = {name7};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ManagerFilmsTestZero() {

        manager.addFilmsManager(name1);
        manager.addFilmsManager(name2);
        manager.addFilmsManager(name3);
        manager.addFilmsManager(name4);
        manager.addFilmsManager(name5);
        manager.addFilmsManager(name6);


        String[] expected = {name6, name5, name4, name3, name2};
        String[] actual = manager.setManagerFilms(0);
        Assertions.assertArrayEquals(expected, actual);
    }
}

