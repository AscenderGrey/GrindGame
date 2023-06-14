package gamecode;

import gamecode.AbstractSprite;
import gamecode.Type;

public abstract class Wepons extends AbstractSprite {
    public String rarity;
    public int damage;
    public Type type;

    public Wepons(int lvl, String rarity, int damage, Type type) {
        super(lvl);
        this.rarity = rarity;
        this.damage = damage;
        this.type = type;
    }
}
