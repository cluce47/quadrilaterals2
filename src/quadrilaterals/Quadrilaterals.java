package quadrilaterals;

/**
 *
 * @author Carol
 */
import java.util.Scanner;
import java.lang.NumberFormatException;

public class Quadrilaterals {
    /**
     * @param args the command line arguments
     */
    double length;
    double width;
    
    public Quadrilaterals(){
        length=0.0;
        width=0.0;
    }
    
    public Quadrilaterals(double l,double w){
        length=l;
        width=w;
    }
    
    public double area(double dim1, double dim2){
        return dim1*dim2;
    }
    
    public double perimeter(double dim1, double dim2){
        return 2*(dim1+dim2);
    }
            
    private static double getValue(String instruction){
        System.out.print(instruction);
        Scanner in = new Scanner(System.in);
        String strNumber;
        do{
            strNumber=in.next();
        }while (!isDouble(strNumber));
        return Double.parseDouble(strNumber);
    }
    
    private static boolean isDouble(String toCheck){
        try {
            double value = Double.parseDouble(toCheck);
            return true;
        }
        catch(NumberFormatException err){
            System.out.println("Not a number, try again please.");
            return false;
        }
    }
    
    public static void main(String[] args) {
        Quadrilaterals quad1 = new Quadrilaterals();
        quad1.length=getValue("What is the length? ");
        quad1.width=getValue("What is the width? ");
        System.out.println("The rectangle area is "+quad1.area(quad1.length, quad1.width));
        System.out.println("The rectangle perimeter is "+quad1.perimeter(quad1.length, quad1.width));
        
        Square sq1 = new Square();
        sq1.side=(getValue("What is the side length? "));
        System.out.println("The square area is "+sq1.area(sq1.side, sq1.side));
        System.out.println("The square perimeter is "+sq1.perimeter(sq1.side, sq1.side));
        
        Parallelogram para1 = new Parallelogram();
        para1.length=getValue("What is the base length? ");
        para1.height=getValue("What is the height? ");
        System.out.println("The parallelogram area is "+para1.area(para1.length, para1.height));  
        System.out.println("The parallelogram perimeter is "+para1.perimeter(para1.length, para1.height));       
    }
    
}
