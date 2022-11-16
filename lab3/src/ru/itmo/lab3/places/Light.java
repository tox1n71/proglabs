package ru.itmo.lab3.places;
public enum Light {
    POOR("слабо освещалось рядами висячих ламп"),
    GOOD("хорошо освещалось уличными фонарями"),
    BRILLIANT("прекрасно освещалось LED-панелями");

    private String type;

    Light(String type){this.type = type;}

    @Override
    public String toString() {
        return type;
    }
}
