//CREATE A CLASS MONKEY WITH JUMP() AND BITE() METHODS.
//CREATE A CLASS HUMAN WHICH INHERITS THIS MONKEY CLASS AND
//IMPLEMENTS BASICANIMAL INTERFACE WITH EAT() AND SLEEP()
//METHODS.
//IMPLEMENT POLYMORPHISM
class monkey{
    void jump(){
        System.out.println("JUMPING...");
    }
    void bite(){
        System.out.println("BITING...");
    }
}
interface basicanimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicanimal{
    void speak(){
        System.out.println("HELLO HELLO!!");
    }
    public void eat(){
        System.out.println("EATING...");
    }
    public void sleep(){
        System.out.println("SLEEPING...");
    }
}
public class Main
{
	public static void main(String[] args) {
	   // human a = new human();
	   // a.sleep();
	   // a.eat();
	   // a.speak();
	   // a.jump();
	   // a.bite();
	    monkey m = new human();
	    //HUMAN IS USED AS MONKEY. -->MEANING OF ABOVE LINE
        //SO m WHICH IS MONKEY USES METHODS WHICH IT HAS
        //AND NOT THOSE OF HUMANS.
        //m.speak();-->not allowed as m is monkey and speak 
        //is the method of humans.
        m.jump();
        m.bite();
        basicanimal b = new human();
        //human is used as basicanimal.
        b.sleep();
        b.eat();
        //b.speak();->NOT ALLOWED AS BASIC ANIMAL DOES NOT 
        //HAVE METHOD speak().
	}
}
/*
OUTPUT->
JUMPING...
BITING...
SLEEPING...
EATING...
*/
