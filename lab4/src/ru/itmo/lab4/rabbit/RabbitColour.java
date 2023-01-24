package ru.itmo.lab4.rabbit;

public enum RabbitColour {
    WHITE("Белый"),
    BLACK("Чёрный"),
    BROWN("Коричневый");

    private String colour;

    RabbitColour(String colour){this.colour = colour;}

    @Override
    public String toString(){return colour;}
}
