package ru.itmo.lab4.doors;
import ru.itmo.lab4.AuthorFeeling;
import ru.itmo.lab4.keys.Key;
import ru.itmo.lab4.alice.Alice;


import java.util.Objects;

public class Door {
    private String pattern;
    private int number;
    private boolean lock = true;
    private String name;



    public Door(int number, String pattern){
        this.pattern = pattern;
        this.number = number;
    }
    public Door(){};
    public Door(String name, String pattern){
        this.name = name;
        this.pattern = pattern;
    }
    public class SmallDoor extends Door{
        private String height;

        public SmallDoor(String name, String pattern, String height){
            super(name, pattern);
            this.height = height;
        }

        @Override
        public String toString(){
            return getName();
        }
        public String getHeight(){
            return height;
        }
    }


    public String getName() {
        return name;
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

    private boolean compareWithKeyPattern(Key key) {
        return getPattern() == key.getPattern();
    }


    public void tryToOpen(Key key, Alice alice) {
        System.out.println(alice.getName() + " c помощью " + key.toString() + " пытается открыть " + toString() + "...");
        if (compareWithKeyPattern(key)){
            System.out.println(AuthorFeeling.HAPPINESS + " " + key.toString() + " подошел к " + toString());

        }
        else {
            System.out.println(AuthorFeeling.DISSAPOINTMENT + "! " + key.toString() + " не хочет открывать " + toString() + '.');
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
