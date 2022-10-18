package mymoves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){ super(Type.GHOST, 80, 100);}

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Math.random() < 0.2){
            defender.setMod(Stat.SPECIAL_DEFENSE , -1);
        }
    }

    @Override
    protected String describe() {
        return "использует Shadow Ball";
    }
}
