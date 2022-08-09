//CREATE A CLASS MONKEY WITH JUMP() AND BITE() METHODS.
//CREATE A CLASS HUMAN WHICH INHERITS THIS MONKEY CLASS AND
//IMPLEMENTS BASICANIMAL INTERFACE WITH EAT() AND SLEEP()
//METHODS.
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
	    human a = new human();
	    a.sleep();
	    a.eat();
	    a.speak();
	    a.jump();
	    a.bite();
	}
}
/*
OUTPUT->
SLEEPING...
EATING...
HELLO HELLO!!
JUMPING...
BITING...
*/
