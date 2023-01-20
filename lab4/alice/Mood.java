package ru.itmo.lab4.alice;

public enum Mood {
    SADLY("уныло"),
    JOYFULLY("радостно"),
    CONSCIENTIOUSLY("добросовестно");

    private String type;

    Mood(String type){this.type = type;}

    @Override
    public String toString(){return type;}
}

