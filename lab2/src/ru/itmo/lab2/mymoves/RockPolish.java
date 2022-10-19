package ru.itmo.lab2.mymoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class RockPolish extends StatusMove {
    public RockPolish(){super(Type.ROCK, 0,0);}

    @Override
    protected void applySelfEffects(Pokemon attacker) {
        attacker.setMod(Stat.SPEED, 2);
    }

    @Override
    protected String describe() {
        return "использует Rock Polish";
    }
}
