

import java.util.Scanner;

class Complex_Op 
{
   float real,imag;
    Complex_Op()	
       {
            real=0;
            imag=0;
       }
     Complex_Op(float r,float i)  
       {
           real = r;
           imag = i;
       }	
     public void  AddNumbers(Complex_Op C1,Complex_Op C2)
      {
          float real, imag;
          
          real = (C1.real + C2.real); 
          
          imag = (C1.imag + C2.imag);
          
          System.out.println("Addition is:("+ real + ") + (" + imag + ")i" );
     }
     public void  SubNumbers(Complex_Op C1,Complex_Op C2)
     {
           float real, imag;
    
           real = (C1.real - C2.real); 
    
           imag = (C1.imag - C2.imag);
    
          System.out.println("Subtraction is:("+ real + ") + (" + imag + ")i" );
     }
      public void  MulNumbers(Complex_Op C1,Complex_Op C2)
     {
	
	    float real, imag;
    
            real = (C1.real * C2.real)-(C1.imag*C2.imag); 
            imag = (C1.real*C2.imag)+(C1.imag*C2.real);
    
           System.out.println("Multiplication is:("+ real + ") + (" + imag + ")i" );
    }

     public void  DivNumbers(Complex_Op C1,Complex_Op C2)
    { 
	    float real, imag;
    
             real = ((C1.real * C2.real)+(C1.imag*C2.imag))/((C2.real * C2.real)+(C2.imag*C2.imag)); 
    
             imag = ((C2.real*C1.imag)-(C2.imag*C1.real))/((C2.real * C2.real)+(C2.imag*C2.imag));
    
             System.out.println("Division is:("+ real + ") + (" + imag + ")i" );
    }


    }      
     public class Complex 
       {		
           public static void main(String args[])
           
       {
      
             float real, imag;		
             Complex_Op cal = new Complex_Op ();
        	   
              Scanner input =  new Scanner(System.in);
       	      System.out.println("Enter the first no.\\n");
              real = input.nextInt();
              imag = input.nextInt(); 
              Complex_Op Object1  = new Complex_Op(real, imag);
     
               System.out.println("Enter the Second Number\\n");
	       real = input.nextInt(); 
	       imag = input.nextInt(); 
       	       Complex_Op Object2  = new Complex_Op(real, imag);
       	       cal.AddNumbers(Object1 , Object2);
       	       cal.SubNumbers(Object1 , Object2);
       	       cal.MulNumbers(Object1 , Object2);
       	       cal.DivNumbers(Object1 , Object2);
             }				
       }

