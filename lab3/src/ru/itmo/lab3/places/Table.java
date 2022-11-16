package ru.itmo.lab3.places;
public class Table extends Place{
    private String name;

    public Table(String name){
        super(name);
        this.name = name;

    }
    public void somethingOnTable(Object smth){
        System.out.println("На столе лежал " + smth.toString() + ".");
    }

    @Override
    public String toString() {
        return name;
    }
}
