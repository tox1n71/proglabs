package ru.itmo.lab4.myexceptions;

public class AlicesNameException extends RuntimeException{
    public AlicesNameException(String message){
        super(message);
    }
}
