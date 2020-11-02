
package testForeachOrderedandForeach;

public class testForeachOrdered {

    public static void main(String[] args) {
        
    String str = "sushil mittal";
    System.out.println("****forEach without using parallel****");
    str.chars().forEach(s -> System.out.print((char) s));
    System.out.println("\n****forEach with using parallel****");

    str.chars().parallel().forEach(s -> System.out.print((char) s));
    System.out.println("\n****forEachOrdered with using parallel****");

    str.chars().parallel().forEachOrdered(s -> System.out.print((char) s));
    
    System.out.println("");
        
    }
    
}
