package mypokemons;

import mymoves.DisarmingVoice;
import ru.ifmo.se.pokemon.*;
public class Jigglypuff extends Igglybuff{
    public Jigglypuff(String name, int level){
        super(name, level);
        setStats(115, 45, 20, 45,25,20);
        setType(Type.NORMAL, Type.FAIRY);
        addMove(new DisarmingVoice());

    }
}
