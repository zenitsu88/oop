
import java.util.*;
class exception
{
            public static void main(String args[])
            {
                        Scanner scr=new Scanner(System.in);
                        int num1,num2,q;
                        try
                        {
                                    System.out.println("\nEnter the value of first integer : ");
                                    num1=Integer.parseInt(scr.next());
                                    System.out.println("\nEnter the value of second integer : ");
                                    num2=Integer.parseInt(scr.next());
                                    q=num1/num2;
                                    System.out.println("\nQuotient is : "+q);
                        }
                        catch(NumberFormatException e)
                        {
                                    System.out.println(e);
                        }
                        catch(ArithmeticException e)
                        {
                                    System.out.println(e);
                        }
            }
}



