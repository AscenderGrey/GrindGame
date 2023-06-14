package gamecode;

import java.awt.*;

public class Character extends AbstractSprite{
    public int strength;
    public int intellegence;
    public int agility;
    public int dexterity;
    public String blessing;
    public int posX;
    public int posY;
    public Type direction;

    public Type getDirection() {
        return direction;
    }

    public void setDirection(Type direction) {
        this.direction = direction;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Character(int lvl, int strength, int intellegence, int agility, int dexterity, String blessing, Type direction) {
        super(lvl);
        this.strength = strength;
        this.intellegence = intellegence;
        this.agility = agility;
        this.dexterity = dexterity;
        this.blessing = blessing;
        this.direction = direction;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {strength = strength;
    }

    public int getIntellegence() {
        return intellegence;
    }

    public void setIntellegence(int intellegence) {
        this.intellegence = intellegence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public String getBlessing() {
        return blessing;
    }

    public void setBlessing(String blessing) {
        this.blessing = blessing;
    }

    @Override
    public void draw(Graphics g) {

    }
}
