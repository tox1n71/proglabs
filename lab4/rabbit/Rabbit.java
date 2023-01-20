package ru.itmo.lab4.rabbit;

import ru.itmo.lab4.myexceptions.MyExceptions;
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
            public Turn(String name) throws MyExceptions.ExistException {
                super(name);
                if (!name.equals("поворот")) throw new MyExceptions.ExistException("разработчик отправил кролика не туда");

            }
        }
        Turn turn = new Turn("поворот");
        try{
            System.out.println(colour + " " + name + " бесследно исчез за " + turn.toString());
        }
        catch (MyExceptions.ExistException e){
            System.err.println(e.getMessage());
        }
    }

}
