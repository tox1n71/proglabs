package ru.itmo.lab2.mypokemons;

import ru.itmo.lab2.mymoves.Harden;
import ru.itmo.lab2.mymoves.RockPolish;
import ru.itmo.lab2.mymoves.SandAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gligar extends Pokemon {
    public Gligar(String name, int level){
        super(name, level);
        setStats(65,75,105,35,65,85);
        setType(Type.GROUND, Type.FLYING);
        setMove(new Harden(), new RockPolish(), new SandAttack());
    }
}
