package ru.itmo.lab4.rabbit;

import ru.itmo.lab4.myexceptions.ExistException;
import ru.itmo.lab4.places.Place;

public class Rabbit {
    private RabbitColour colour;
    private final String name = "Кролик";



    public Rabbit(RabbitColour colour){
        this.colour = colour;
    }

    public RabbitColour getColour() {
        return colour;
    }

    public void dissapeared(){
        class Turn extends Place{
            public Turn(String name) throws ExistException {
                super(name);
                if (!name.equals("поворот")) throw new ExistException("разработчик отправил кролика не туда");
            }
            @Override
            public String toString() {
                return getName();
            }
        }

        try{
            Turn turn = new Turn("поворот");
            System.out.println(colour + " " + name + " бесследно исчез за " + turn.toString());
        }
        catch (ExistException e){
            System.err.println(e.getMessage());
        }
    }

}
