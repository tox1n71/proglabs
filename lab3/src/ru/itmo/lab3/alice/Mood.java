package ru.itmo.lab3.alice;

public enum Mood {
    SADLY("уныло"),
    JOYFULLY("радостно"),
    CONSCIENTIOUSLY("добросовестно");

    private String type;

    Mood(String type){this.type = type;}

    @Override
    public String toString(){return type;}
}

