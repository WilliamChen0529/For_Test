
package ProncipleNote;

public class prpEncapsulation {
    
    long a = 8L;     // l
    double b = 2D;   // d
    float c = 3F;    // f
    
    private String prpEncapsulation;

    public void setPrpEncapsulation(String prpEncapsulation) {
        this.prpEncapsulation = prpEncapsulation;
    }
    
    public String getPrpEncapsulation() {
        return prpEncapsulation;
    }
    
}

/*

Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

To achieve encapsulation in Java −

Declare the variables of a class as private.

Provide public setter and getter methods to modify and view the variables values.

*/