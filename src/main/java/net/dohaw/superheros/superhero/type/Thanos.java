package net.dohaw.superheros.superhero.type;

import net.dohaw.superheros.superhero.SuperheroType;
import net.dohaw.superheros.superhero.SuperheroWrapper;
import net.dohaw.superheros.superhero.spell.SpellType;

import java.util.Arrays;
import java.util.List;

public class Thanos extends SuperheroWrapper {

    public Thanos() {
        super(SuperheroType.THANOS);
    }

    @Override
    protected List<SpellType> compileSpells() {
        return Arrays.asList(SpellType.FREEZE, SpellType.LEVITATE);
    }

}
