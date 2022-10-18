package mymoves;

import ru.ifmo.se.pokemon.*;

public class DisarmingVoice extends SpecialMove {

    public DisarmingVoice(){super(Type.FAIRY, 40,0);}

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует Disarming Voice";
    }
}
