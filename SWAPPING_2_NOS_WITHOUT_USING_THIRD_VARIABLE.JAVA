//SWAPPING 2 NOS. WITHOUT USING A THIRD VARIABLE
import java.util.*;  
public class Main   
{  
    public static void main(String args[])   
    {   
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
        /*Define variables*/  
        int x = sc.nextInt();  
        int y = sc.nextInt();  
        System.out.println("before swapping numbers: "+x +" "+ y);  
       /*Swapping*/  
        x = x + y; //x is sum of 2 nos.
        y = x - y; //y=(x+y)-y=x i.e. y is assigned value of x.
        x = x - y; //x=(x+y)-y=(x+y)-x=y//x is assigned value of y.
        //IN 2ND STEP OF SWAPPING , y WAS ASSIGNED VALUE OF x WHICH
        //WAS USED IN 3RD STEP.
        System.out.println("After swapping: "+x +"  " + y);   
    }   
}  
