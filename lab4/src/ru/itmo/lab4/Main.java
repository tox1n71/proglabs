package ru.itmo.lab4;

import ru.itmo.lab4.doors.Door;
import ru.itmo.lab4.furniture.Curtain;
import ru.itmo.lab4.keys.Key;
import ru.itmo.lab4.keys.PhysicalKey;
import ru.itmo.lab4.myexceptions.ExistException;
import ru.itmo.lab4.places.*;
import ru.itmo.lab4.furniture.Table;
import ru.itmo.lab4.alice.Alice;
import ru.itmo.lab4.rabbit.Rabbit;
import ru.itmo.lab4.rabbit.RabbitColour;

public class Main {
        public static void main(String[] args){
                Light light = new Light(LightLevel.POOR, " освещалось рядами висячих ламп");
                Dungeon dungeon = new Dungeon("подземелье", "Низкое", "длинное", light);
                Table glasstable = new Table("столик", "маленький стеклянный столик");
                Key goldkey = new PhysicalKey("крохотный золотой ключик", "]][][[][");
                Door door1 = new Door(1, "]][]]]]]");
                Door door2 = new Door(2, "[[[[[]]]");
                Door door3 = new Door(3, "[[[[[[[]");
                Door door4 = new Door(4, "[[]]][]]");
                Alice alice = new Alice("Алиса");

                Curtain curtain = new Curtain("штора", "спускавшаяся до самого пола");
                //lab4 additionals
                Rabbit rabbit = new Rabbit(RabbitColour.WHITE);
                Door.SmallDoor smallDoor = new Door().new SmallDoor("маленькая дверца", "]][][[][", "сантиметров 30 высотой");
                Place strangePlace = new Place("cтранное место") {
                        @Override
                        public String toString() {
                                return getName();
                        }
                }; // Анонимный класс, наследник абстрактного класса Place + метод

                AuthorFeeling.expressDisappointment();
                rabbit.dissapeared();
                alice.foundHerself(strangePlace);

                //lab3
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
                //lab4 ending
                curtain.doorDetected(smallDoor);
                smallDoor.tryToOpen(goldkey, alice);
        }
}