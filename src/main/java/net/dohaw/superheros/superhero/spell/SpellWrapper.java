package net.dohaw.superheros.superhero.spell;

import net.dohaw.superheros.Wrapper;
import net.dohaw.superheros.superhero.SuperheroType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public abstract class SpellWrapper extends Wrapper<SpellType> {

    private ItemStack item;
    private SuperheroType superheroType;

    public SpellWrapper(SpellType KEY, SuperheroType superheroType) {
        super(KEY);
        this.superheroType = superheroType;
        this.item = createItem();
        if(item != null){
            ItemMeta meta = item.getItemMeta();
            meta.getPersistentDataContainer().set(Spell.SPELL_ITEM_KEY, PersistentDataType.STRING, KEY.toString());
            item.setItemMeta(meta);
        }
    }

    public abstract void cast(Player caster);

    public abstract ItemStack createItem();

    public SuperheroType getSuperheroType() {
        return superheroType;
    }

    public ItemStack getItem() {
        return item;
    }

}
