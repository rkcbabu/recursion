package multiple.inheritance;

import java.time.Clock;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public abstract class Chhori implements Aama1, Aama2, Aama3{

    @Override
    public void aama1Task1() {
        System.out.println("This is parent1 Task1");
    }

    @Override
    public void commonTask() {
  System.out.println("This is common Task");
    }

    @Override
    public void aama2Task1() {
          System.out.println("This is parent2 Task1");
    }

    @Override
    public void aama3Task1() {
          System.out.println("This is parent3 Task1");
    }
    
}
