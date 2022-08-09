//CREATE AN ABSTRACT CLASS PEN WITH METHODS write() AND 
//refill() AS ABSTRACT METHODS. CREATE A CONCRETE CLASS
//fountainpen WITH ADDITIONAL METHOD changeNib().
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    void write(){
        System.out.println("WRITE");
    }
    void refill(){
        System.out.println("REFILL");
    }
    void changeNib(){
        System.out.println("CHANGING THE NIB.");
    }
}
public class Main
{
	public static void main(String[] args) {
        fountainpen pen = new fountainpen();
        pen.changeNib();
	}
}
//OUTPUT->CHANGING THE NIB.
