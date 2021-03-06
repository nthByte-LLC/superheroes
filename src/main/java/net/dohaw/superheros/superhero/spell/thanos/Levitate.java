package net.dohaw.superheros.superhero.spell.thanos;

import net.dohaw.superheros.SuperherosPlugin;
import net.dohaw.superheros.superhero.SuperheroType;
import net.dohaw.superheros.superhero.spell.Spell;
import net.dohaw.superheros.superhero.spell.SpellType;
import net.dohaw.superheros.superhero.spell.SpellWrapper;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;
import java.util.List;

public class Levitate extends SpellWrapper {

    public Levitate() {
        super(SpellType.LEVITATE, SuperheroType.THANOS);
    }

    @Override
    public boolean cast(Player caster, SuperherosPlugin plugin) {
        caster.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 5 * 20, 0));
        Spell.playSound(caster, Sound.ENTITY_CHICKEN_AMBIENT);
        Spell.spawnParticle(caster, Particle.END_ROD, 10, 1, 1, 1);
        return true;
    }

    @Override
    public Material getItemMaterial() {
        return Material.FEATHER;
    }

    @Override
    public String getItemDisplayName() {
        return "&eLevitate";
    }

    @Override
    public List<String> getItemLore() {
        return Arrays.asList("&7Levitates you for 5 seconds");
    }

}
