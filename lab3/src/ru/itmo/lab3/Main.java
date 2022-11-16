package ru.itmo.lab3;

import ru.itmo.lab3.doors.Door;
import ru.itmo.lab3.places.Dungeon;
import ru.itmo.lab3.places.Light;
import ru.itmo.lab3.places.Table;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Dungeon dungeon = new Dungeon("подземелье", "Низкое", "длинное", Light.POOR);
        Table glasstable = new Table("маленький стеклянный столик");
        Key goldkey = new Key("крохотный золотой ключик", glasstable, "]][][[][");
        Door door1 = new Door("]][]]]]]");
        Door door2 = new Door("[[[[[]]]");
        Door door3 = new Door("[[[[[[[]");
        Door door4 = new Door("[[]]][]]");
        List<Door> doors = Arrays.asList(door1, door2, door3, door4);
        Alice alice = new Alice("Алиса");

        dungeon.describe();
        dungeon.environment();
        alice.goAround(2);
        alice.tryToOpenDoor(doors);
        alice.thinking();
        alice.foundSomething(glasstable);
        glasstable.somethingOnTable(goldkey);
        alice.smile();
        alice.tryToOpenWithKey(goldkey, doors);
        alice.continueTrying();
    }
}
