package simple.list;
import recursion.*;



/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class Node {
    
    // reflection ; 
    Node next; 
    Node previous ;
    
    
    Entity entity; 

    public Node(Entity entity) {
        this.entity = entity;
    }
    
    void print(){
        System.out.print("My entity : "); 
        entity.print();

        //recurstion.
        if(next !=null)
            next.print();
    }
    
}
