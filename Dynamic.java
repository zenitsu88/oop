
import java.util.*;
abstract class Shape
{
    
    double val1 ,val2;
    
    void input()
 {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter first value");
        
        val1 = s.nextDouble();
        
        System.out.println("Enter Second value");
        
        val2 = s.nextDouble();
        
 }
       abstract void Compute_area();
   
}
     class Triangle extends Shape
{
     void Compute_area() 
{
        double area;
        area = 0.1f/0.2 * val1 * val2;
        System.out.println("Traiangle Area :"+area);
}
}
class Rectangle extends Shape
{
    void Compute_area()
{
        double area;
        area = val1 * val2;
        System.out.println("Rectangle area :"+area);
    }
}



public class Dynamic
{
    public static void main(String args[])
{

        
        Shape T = new Triangle();
        Shape R = new Rectangle();
  
        
        T.input();
        T.Compute_area();
       
        R.input();
        R.Compute_area();
        
       
   }
}
