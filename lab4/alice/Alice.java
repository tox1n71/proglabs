package ru.itmo.lab4.alice;

import ru.itmo.lab4.interfaces.VisibleObject;
import ru.itmo.lab4.keys.Key;
import ru.itmo.lab4.myexceptions.MyExceptions;
import ru.itmo.lab4.places.Place;

public class Alice {


    private final String name;

    public Alice(String name) throws MyExceptions.ExistException {
        if(name != "Алиса") throw new MyExceptions.ExistException("некорректное имя главного героя");
        this.name = name;
    }

    public String getName() {
            return name;
    }

    public void foundHerself(Place place){
        System.out.println("А " + getName() + " очутилась в " + place.toString());
    }

    public void goAround(int repeat, Place place) {
        String placeName = place.toString();
        if (repeat == 1) System.out.println(name + " обошла все " + placeName);
        else if (repeat == 2) System.out.println(name + " дважды обошла все " + placeName);
        else if (repeat < 1) System.out.println(name + " не пошла по " + placeName);
        else System.out.println(name + " несколько раз обошла все " + placeName);
    }
    public void startPullingDoors(){

        System.out.println(name + " "+ Mood.CONSCIENTIOUSLY + " проверяла двери");
    }
//    public void tryToOpenDoor(List<Door> doors) {
//        int count = 0;
//        for (Door d : doors) {
//            d.pull();
//            if (!d.checkIfLocked()) count++;
//        }
//        if (count == 0)
//            System.out.println(name + " по несколько раз подергала каждую дверь, но, к большому сожалению, все они оказались заперты.");
//        else
//            System.out.println(name + " по несколько раз подергала каждую дверь и " + count + " из них открылись");


    public void sadThinking() {
//        System.out.println(name + " уныло расхаживала взад и вперед, пытаясь придумать, как ей отсюда выбраться...");
        System.out.println(name + " " + Mood.SADLY + " думала как ей выбраться");
    }

    public void seeSomething(VisibleObject smth) {
        System.out.println(name + " увидела " + smth.toString());
    }

//    public void smile() {
//        System.out.println(name + " " + Mood.JOYFULLY + " улыбнулась ");
//    }
    public void joyfullThinking(Key key){
        System.out.println(name + " " + Mood.JOYFULLY + " подумала, что " + key.toString() + " откроет дверь ");
    }

//    public void tryToOpenWithKey(Key key, List<Door> doors) {
//        int count = 0;
//
//        System.out.println(name + " попыталась открыть двери с помощью ключа...");
//        for (Door d : doors) {
//            if (d.equals(key)) count++;
//        }
//        if (count == 0)
//            System.out.println("Но увы!\nМожет быть, замки были слишком большие,\nа может быть, ключик был слишком маленький, только он никак не хотел открывать ни одной двери.");
//        else System.out.println(name + " смогла открыть " + count + " двери с помощью ключа");
//    }

//    public void continueTrying() {
//        System.out.println("Она добросовестно проверяла одну дверь за другой\nи тут-то она впервые заметила штору, спускавшуюся до самого пола, а за ней...");
//    }
    public void startTryingToOpen(){
        System.out.println(name + " " + Mood.CONSCIENTIOUSLY + " начала проверять двери ");
    }

}

