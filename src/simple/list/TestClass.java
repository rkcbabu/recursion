package simple.list;

import java.util.ArrayList;
import java.util.List;
import recursion.Entity;
import recursion.File;
import recursion.Folder;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class TestClass {

    public static void main(String[] args) {
        SimpleList entities = new SimpleList();
        entities.add(new Folder("Folder1"));
        entities.add(new File("File1", 123));
        entities.add(new Folder("Folder2"));
        entities.add(new File("File2", 23));
        entities.add(new File("File3", 3));
        entities.add(new File("File3", 3));
        entities.add(new Folder("Folder1"));
        entities.add(new File("File1", 123));
        entities.add(new Folder("Folder2"));
        entities.add(new File("File2", 23));
        entities.add(new File("File3", 3));
        entities.add(new File("File3", 3));
        entities.add(new Folder("Folder1"));
        entities.add(new File("File1", 123));
        entities.add(new Folder("Folder2"));
        entities.add(new File("File2", 23));
        entities.add(new File("File3", 3));
        entities.add(new File("File3", 3));

        entities.print();
//        for ( Entity e : entities){
            
//        }
        
//        ent = new ArrayList();
//        ent.add("asdf");
//        ent.add("asdf");
//        ent.add("asdf");
//        ent.add("asdf");
//        ent.add("asdf");
//        System.out.prin
//        List<String> tln(ent);

//        System.out.println(entities);
    }
}
