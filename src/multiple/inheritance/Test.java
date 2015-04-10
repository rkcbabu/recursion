package multiple.inheritance;

/**
 *
 * @author Ram Chaulagai <ram.chaulagai.np@gmail.com>
 */
public  class Test {
    public static void main(String[] args) {
//        Aama1 aama1 = new Chhori();
        Aama1 chhori = new Chori1();
        chhori.aama1Task1();
        chhori.commonTask();
        
        Aama2 ch2 = (Aama2) chhori; 
        ch2.aama2Task1();
        ch2.commonTask();
        
        Double a = 10.00; 
        
//        Integer i = (Integer)a;
       
        
        
        
//        Chhori chhori = new Chori1();
        
//        
//        chhori.aama1Task1();
//        chhori.aama2Task1();
//        chhori.aama3Task1();
//        chhori.commonTask();
//        
//        chhori = new Chori2();
//        
//        chhori.aama1Task1();
//        chhori.aama2Task1();
//        chhori.aama3Task1();
//        chhori.commonTask();
        
        
    }
    
}
