package gamecode;

import gamecode.Map;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MapMouseListener extends MouseAdapter
{
    private Map map;
    public MapMouseListener(Map _map){
        map = _map;
    }
    @Override public void mouseClicked(final MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        int tileX = x/10;
        int tileY = y/10;


    }

}
