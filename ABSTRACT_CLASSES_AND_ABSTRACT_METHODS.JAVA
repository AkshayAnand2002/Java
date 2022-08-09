//ABSTRACT CLASSES AND ABSTRACT METHODS
abstract class base{//abstract classes are classes using which
//more classes will be formed.
//objects can't be formed  abstract classes.
    public base(){
        System.out.println("I AM THE CONSTRUCTOR OF BASE 2.");
    }
    public void sayhello(){
        System.out.println("HELLO");
    }
    abstract public void greet();//abstract method makes class abstract.
    //anything can be overwritten into greet.
    //greet() method is overridden by greet() of derived class.
    abstract public void greet2();//similarly for greet2().
}
class derived extends base{
    public void greet(){//overrides greet of base class.
        System.out.println("GOOD MORNING.");
    }
    public void greet2(){//overrides greet of base class.
        System.out.println("GOOD AFTERNOON.");
    }
}
//IF WE MAKE NEW CLASS THAT (SUBCLASS) SHOULD EITHER BE AN
//ABSTRACT CLASS OR IT SHOULD OVERRIDE THE ABSTRACT METHOD.
abstract class derived2 extends base{
    public void th(){
        System.out.println("I AM GOOD.");
    }
}
public class Main
{
	public static void main(String[] args) {
        derived d = new derived();//derived: not an abstract class.
        //hence object can be formed. 
        //base b = new base(); --> objects of abstract class
        //can't be formed.
        //derived2 e = new derived2(); --> objects of abstract class
        //can't be formed.
	}
}
//OUTPUT->
//I AM THE CONSTRUCTOR OF BASE 2.
