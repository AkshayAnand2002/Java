//ACCESS MODIFIERS
//public,protected,default modifiers can be accessed in same
//package but private modifiers can't be accessed in the same package.
//class of different package -> subclass.
//public and protected can inherit from class of different package
//called as subclass but default and private can't inherit from subclass.
//If an element in class is not in same class,package and also does not belong
//to subclass then it belongs to world modifier.
//ONLY PUBLIC MEMBERS CAN BE ACCESSED OR PUBLIC MODIFIER CAN
//BE ACCESSED IN THE WORLD AND NOT PROTECTED,DEFAULT AND PRIVATE MODIFIERS.
import java.util.*;
class c1{
    public int x=5;
    protected int y=45;
    int z=6;//default
    private int a=78;
    public void meth1(){
    //public, protected,default,private modifiers can be accessed 
    //in the same class.
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class Main
{
	public static void main(String[] args) {
	   c1 c = new c1();
	   c.meth1();//5
	}
}
/*
OUTPUT->
5
45
6
78
*/
