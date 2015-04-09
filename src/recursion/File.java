package recursion;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class File implements Entity{
    String name; 
    int size ; 

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public void print() {
        System.out.println("File: "+name +" Size: "+size);
    }

    @Override
    public int getCount() {
        return 1; 
    }
    
}
