package innerClass;

import recursion.Entity;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public class SimpleList {

    private class Node {

        // reflection ; 
        Node next;
        Node previous;

        Entity entity;

        public Node(Entity entity) {
            this.entity = entity;
        }

        void print() {
            System.out.print("My entity : ");
            entity.print();

            //recurstion.
            if (next != null) {
                next.print();
            }
        }

    }

    Node first; // head ; 
    Node last; // tail ; 

    void add(Entity e) {
        if (first == null) {
            Node node = new Node(e);
            first = node;
            last = node;

            node.next = null;
            node.previous = null; // confusion null ?? first ; 

        } else {
            // i will clear confusion later ; 
            Node node = new Node(e);
            last.next = node;
            node.previous = last;
            node.next = null;

            last = node;

        }
    }

    void print() {
        if (first != null) {
            first.print();
        }
    }

}
