package ru.itmo.lab3;
import ru.itmo.lab3.doors.Door;

import java.util.List;

public class Alice {
    private String name;

    public Alice(String name){
        this.name = name;
    }

    public void goAround(int repeat){
        if (repeat == 1)
        System.out.println(name + " обошла все подземелье.");
        else if (repeat == 2)
            System.out.println(name + " дважды обошла все подземелье.");
        else if (repeat < 1)
            System.out.println(name + " расстроилась и не пошла по подземелью.");
        else System.out.println(name + " несколько раз обошла все подземелье.");
        }
    public void tryToOpenDoor(List<Door> doors){
        int count = 0;
        for (Door d : doors) {
            if (!d.checkIfLocked())
                count++;
        }
        if (count == 0)
            System.out.println( name + " по несколько раз подергала каждую дверь, но, к большому сожалению, все они оказались заперты.");
        else System.out.println(name + " по несколько раз подергала каждую дверь и " + count + " из них открылись");
    }
    public void thinking(){
        System.out.println(name + " уныло расхаживала взад и вперед, пытаясь придумать, как ей отсюда выбраться...");
    }

    public void foundSomething(Object smth){
        System.out.println("Но вдруг она наткнулась на " + smth.toString());
    }
    public void smile(){
        System.out.println("Алиса очень обрадовалась: она подумала, что это ключ от какой-нибудь из дверей.");
    }
    public void tryToOpenWithKey(Key key, List<Door> doors){
        int count = 0;

        System.out.println(name + " попыталась открыть двери с помощью ключа...");
        for (Door d: doors){
            if (d.equals(key))
                count++;
        }
        if (count == 0)
            System.out.println("Но увы!\nМожет быть, замки были слишком большие,\nа может быть, ключик был слишком маленький, только он никак не хотел открывать ни одной двери.");
        else
            System.out.println(name + " смогла открыть " + count + " двери с помощью ключа");
    }

    public void continueTrying(){
        System.out.println("Она добросовестно проверяла одну дверь за другой\nи тут-то она впервые заметила штору, спускавшуюся до самого пола, а за ней...");
    }
}

