package ru.itmo.lab4.places;
public enum LightLevel {
    POOR("слабо"),
    GOOD("хорошо"),
    BRILLIANT("прекрасно");

    private String type;

    LightLevel(String type){this.type = type;}

    @Override
    public String toString() {
        return type;
    }
}
