package ru.itmo.lab4;

public enum AuthorFeeling {
    DISSAPOINTMENT("Увы"),
    HAPPINESS("О радость");

    private String feeling;

    AuthorFeeling(String type){this.feeling = type;}

    @Override
    public String toString(){return feeling;}

    public static void expressDisappointment(){
        System.out.print("Но " + DISSAPOINTMENT + ' ');
    }
}
