package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class Folder implements Entity {

    String name;
    List<Entity> entities = new ArrayList<Entity>();

    void addEntity(Entity entity) {
        entities.add(entity);
    }

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        // class method recursion ; 
        int s=0 ; 
        for(Entity e : entities)
            s+=e.getSize();
        return s;
    }
     @Override
    public void print() {
        System.out.println("Folder: "+name );
        for(Entity e : entities)
            e.print();
    }

    @Override
    public int getCount() {
        int c= 1 ; 
        for(Entity e : entities)
            c += e.getCount();
        return c; 
    }
}
