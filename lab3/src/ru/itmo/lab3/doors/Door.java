package ru.itmo.lab3.doors;
import ru.itmo.lab3.Key;

import java.util.Objects;

public class Door implements DoorInterface {
    private String pattern;
    private boolean lock = true;


    public Door(String pattern){this.pattern = pattern;}

    @Override
    public boolean checkIfLocked() {
        return lock;
    }

    @Override
    public String getPattern() {
        return pattern;
    }

    @Override
    public boolean equals(Key key) {
        return key.getPattern() == this.pattern;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern);
    }

}
