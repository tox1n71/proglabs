package ru.itmo.lab4.myexceptions;

public class MyExceptions extends Exception{
    public static class ExistException extends RuntimeException {
        public ExistException(String message){
        super(message);
        }
    }
    public class ScenerioException extends Exception{
        public ScenerioException(){
            super();
        }
    }
}
