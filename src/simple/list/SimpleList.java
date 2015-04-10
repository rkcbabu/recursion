package simple.list;

import recursion.Entity;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class SimpleList {
    Node first ; // head ; 
    Node last ; // tail ; 
    
    void add( Entity e){
        if(first == null ){
            Node node = new Node(e);
            first = node ; 
            last = node ; 
            
            node.next = null; 
            node.previous = null ; // confusion null ?? first ; 
            
        }else{
            // i will clear confusion later ; 
            Node node = new Node(e);
            last.next = node ; 
            node.previous = last ; 
            node.next = null ; 
            
            last = node ; 
            
        }
    }
    
    void print(){
        if(first != null){
             first.print();
        }
    }
   
}
