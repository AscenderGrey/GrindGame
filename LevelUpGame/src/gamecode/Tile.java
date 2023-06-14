package gamecode;

import gamecode.Type;

public class Tile {

    private Type type;

    public void setType(Type type) {
        this.type = type;
    }

    public Tile(Type type){
        this.type = type;
    }

    public Type getType(){
        return type;
    }



}
