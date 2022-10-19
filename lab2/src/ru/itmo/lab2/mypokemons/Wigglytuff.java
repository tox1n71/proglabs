package ru.itmo.lab2.mypokemons;


import ru.itmo.lab2.mymoves.Flamethrower;
import ru.ifmo.se.pokemon.*;
public class Wigglytuff extends Jigglypuff{
    public Wigglytuff(String name, int level){
        super(name, level);
        setStats(140,70,45,85,50,45);
        setType(Type.NORMAL, Type.FAIRY);
        addMove(new Flamethrower());
    }
}
