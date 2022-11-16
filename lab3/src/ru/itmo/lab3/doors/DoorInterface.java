package ru.itmo.lab3.doors;

import ru.itmo.lab3.Key;

public interface DoorInterface {
    boolean checkIfLocked();
    boolean equals(Key key);

    int hashCode();

    String getPattern();


}
