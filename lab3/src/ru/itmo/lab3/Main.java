package ru.itmo.lab3;

import ru.itmo.lab3.doors.Door;
import ru.itmo.lab3.furniture.Curtain;
import ru.itmo.lab3.keys.Key;
import ru.itmo.lab3.keys.PhysicalKey;
import ru.itmo.lab3.places.Dungeon;
import ru.itmo.lab3.places.Light;
import ru.itmo.lab3.places.LightLevel;
import ru.itmo.lab3.furniture.Table;
import ru.itmo.lab3.alice.Alice;

public class Main {
    public static void main(String[] args){
        Light light = new Light(LightLevel.POOR, " освещалось рядами висячих ламп");
        Dungeon dungeon = new Dungeon("подземелье", "Низкое", "длинное", light);
        Table glasstable = new Table("столик", "маленький стеклянный столик");
        Key goldkey = new PhysicalKey("крохотный золотой ключик", "]][][[][");
        Door door1 = new Door(1 ,"]][]]]]]");
        Door door2 = new Door(2, "[[[[[]]]");
        Door door3 = new Door(3,"[[[[[[[]");
        Door door4 = new Door(4,"[[]]][]]");
        Alice alice = new Alice("Алиса");
        Curtain curtain = new Curtain("штора", "спускавшаяся до самого пола");

        dungeon.environment();
        alice.goAround(2, dungeon);
        alice.startPullingDoors();
        door1.bePushed(alice);
        door2.bePushed(alice);
        door3.bePushed(alice);
        door4.bePushed(alice);
        alice.sadThinking();
        alice.seeSomething(glasstable);
        goldkey.lieOn(glasstable);
        alice.seeSomething(goldkey);
        alice.joyfullThinking(goldkey);
//        alice.tryToOpenWithKey(goldkey, doors);
        alice.startTryingToOpen();
        door1.tryToOpen(goldkey, alice);
        door2.tryToOpen(goldkey, alice);
        door3.tryToOpen(goldkey, alice);
        door4.tryToOpen(goldkey, alice);
        alice.seeSomething(curtain);
        curtain.somethingBehind();
    }
}
