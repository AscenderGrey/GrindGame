package gamecode;

public abstract class AbstractSprite implements Sprite {
    public int lvl;

    public AbstractSprite(int lvl) {
        this.lvl = lvl;
    }

    @Override
    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
