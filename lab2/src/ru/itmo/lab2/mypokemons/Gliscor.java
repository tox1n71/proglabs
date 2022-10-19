package ru.itmo.lab2.mypokemons;

import ru.itmo.lab2.mymoves.ThunderFang;

public class Gliscor extends Gligar{
    public Gliscor(String name, int level){
        super(name, level);
        setStats(75, 95, 125, 45, 75, 95);
        addMove(new ThunderFang());
    }
}
