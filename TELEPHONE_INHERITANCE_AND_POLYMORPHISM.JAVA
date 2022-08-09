//CREATE A CLASS TELEPHONE WITH ring(),lift() and disconnect()
//METHODS AS ABSTRACT METHODS.CREATE ANOTHER CLASS 
//SMART TELEPHONE AND DEMONSTRATE POLYMORPHISM.
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
interface BasicTelephone{
    void snap();
    void wifi();
}
class SmartTelephonePhone extends Telephone implements BasicTelephone{
    public void wifi(){
        System.out.println("Opening Wifi");
    }
    public void snap(){
        System.out.println("Taking snap");
    }
    public void ring(){
        System.out.println("Ring");
    }
    public void lift(){
        System.out.println("Lifting");
    }
    public void disconnect(){
        System.out.println("Disconnecting");
    }
}
public class Main
{
	public static void main(String[] args) {
	   Telephone tl= new SmartTelephonePhone();
	    //SmartTelephonePhone() is used as telephone.
        //tl.snap();-->error cannot use snap method 
        //becoz the reference is telephone which does not have snap method
        //tl.wifi();-->error cannot use wifi method becoz the reference 
        //is telephone which does not have wifi method
        tl.ring();
        tl.lift();
        tl.disconnect();

        BasicTelephone btl= new SmartTelephonePhone();
        //SmartTelephonePhone() is used as BasicTelephone.
        btl.snap();
        btl.wifi();

	}
}
/*
OUTPUT->
Ring
Lifting
Disconnecting
Taking snap
Opening Wifi
*/
