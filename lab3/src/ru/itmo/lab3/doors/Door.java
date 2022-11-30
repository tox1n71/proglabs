package ru.itmo.lab3.doors;
import ru.itmo.lab3.keys.Key;
import ru.itmo.lab3.alice.Alice;

import java.util.Objects;

public class Door {
    private String pattern;
    private int number;
    private boolean lock = true;



    public Door(int number, String pattern) {
        this.pattern = pattern;
        this.number = number;
    }


    public boolean checkIfLocked() {
        return lock;
    }


    public void bePushed(Alice alice){

        System.out.println(alice.getName() + " подергала " + toString());
        if (checkIfLocked()){
            System.out.println(toString()+  " заперта");
        }
        else {
            System.out.println(toString() + " открылась");
        }
    }

    private boolean compareWithKeyPattern(Key key){
        return pattern == key.getPattern();
    }


    public void tryToOpen(Key key, Alice alice) {
        System.out.println(alice.getName() + " c помощью " + key.toString() + " пытается открыть " + toString() + "...");
        if (compareWithKeyPattern(key)){
            System.out.println(key.toString() + " подошел к " + toString());

        }
        else {
            System.out.println("Увы! " + key.toString() + " не хочет открывать " + toString() + '.');
        }

    }




    public String toString(){
        return "дверь № " + Integer.toString(number);
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Door door = (Door) obj;
        return number == door.number && lock == door.lock && Objects.equals(pattern, door.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern, number, lock);
    }

}
// или же
// int result = pattern.hashCode()
// result = 31 * result + Integer.hashCode(number) + 1231 (если lock true)
// или + 1237 (false)
