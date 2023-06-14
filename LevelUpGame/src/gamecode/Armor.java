package gamecode;

import gamecode.AbstractSprite;

public abstract class Armor extends AbstractSprite {
    public String rarity;
    public int defense;
    public Type type;
    public Armor(int lvl) {
        super(lvl);
        this.rarity = rarity;
        this.defense = defense;
        this.type = type;
    }
}
