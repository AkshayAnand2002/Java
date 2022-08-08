//CREATE A CLASS CIRCLE AND USE INHERITANCE TO CREATE ANOTHER
//CLASS CYLINDER FROM IT.
import java.util.Scanner;
class circle{
    public int radius;
    circle(){
        System.out.println("I AM NON-PARAMETERIZED CONSTRUCTOR OF CIRCLE");
    }
    circle(int r){//constructor
    System.out.println("I AM CIRCLE PARAMETERISED CONSTRUCTOR.");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends circle{
    public int height;
    cylinder(int r,int h){//constructor
        super(r);//calling superclass circle function with radius integer r.
        System.out.println("I AM CYLINDER PARAMETERIZED CONSTRUCTOR.");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class cylinder1 extends circle{
    public int height;
    cylinder1(int r1,int h1){//constructor
    //SINCE EXTENDS FROM CIRCLE CLASS BUT NO SUPER() IS USED SO
    //IT CALLS THE DEFAULT CONSTRUCTOR IN CIRCLE SUPERCLASS
    //I.E. circle() .
        System.out.println("I AM CYLINDER PARAMETERIZED CONSTRUCTOR.");
        this.height=h1;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Main
{
	public static void main(String[] args) {
	    //circle objc = new circle(1);
        cylinder obj = new cylinder(12,3);
        System.out.println(obj.volume());//1357.17
        //this gets radius assigned by circle(r) function.
        System.out.println();
        cylinder1 obj1 = new cylinder1(12,3);
        System.out.println(obj1.volume());//0.0
        //Here,circle has no arguement and is default 
        //constructor with no radius input.
        //this.radius=0 so volume=0.
	}
}
/*
OUTPUT->
I AM CIRCLE PARAMETERISED CONSTRUCTOR.
I AM CYLINDER PARAMETERIZED CONSTRUCTOR.
1357.1680263507906

I AM NON-PARAMETERIZED CONSTRUCTOR OF CIRCLE
I AM CYLINDER PARAMETERIZED CONSTRUCTOR.
0.0
*/
