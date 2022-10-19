package ru.itmo.lab2.mypokemons;


import ru.itmo.lab2.mymoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class TapuLele extends Pokemon {
    public TapuLele(String name, int level){
        super(name, level);
        setStats(70, 85, 75, 130, 115, 95);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new QuickAttack(), new ThunderShock(), new Thunderbolt(), new Screech());
    }
}
