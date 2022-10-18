package mymoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SandAttack extends StatusMove {
    public SandAttack(){
        super(Type.GROUND, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        defender.setMod(Stat.ACCURACY, -1);
    }

    @Override
    protected String describe() {
        return "использует Sand Attack";
    }

}
