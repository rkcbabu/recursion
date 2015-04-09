package recursion;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class Test{ 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Folder drive = new Folder("Main");
        
        Folder folder1 = new Folder("Folder1");
        File msDoc = new File("MSDOC",18);
        
        drive.addEntity(folder1);
        drive.addEntity(msDoc);
        
        folder1.addEntity(new File("File1",23));
        folder1.addEntity(new File("File2",25));
        folder1.addEntity(new File("File2",99));
        
        System.out.println(drive.getSize());
        System.out.println(folder1.getCount());
        drive.print();
    }
    
}
