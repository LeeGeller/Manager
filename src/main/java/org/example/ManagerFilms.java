package org.example;

public class ManagerFilms {
    private String[] names = new String[0];
    private int count;

    public ManagerFilms() {
        this.count = 5;
    }

    public ManagerFilms(int count) {
        this.count = count;
    }

    public String[] getCount() {
        return findLast();
    }

    public String[] setCount(int count) {
        this.count = count;
        return findLast();
    }

    public void addFilmsManager(String name) {

        String[] tmp = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            tmp[i] = names[i];
        }
        tmp[tmp.length - 1] = name;
        names = tmp;
    }

    public String[] findLast() {
        int resultLength;

        String[] tmp = new String[names.length + 1];
        if (names.length < count) {
            resultLength = names.length;
        } else {
            resultLength = count;
        }
        String[] reversed = new String[resultLength];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = names[names.length - 1 - i];
        }
        return reversed;
    }


    public String[] findAll() {

        return names;

    }

}


