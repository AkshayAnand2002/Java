//DYNAMIC METHOD DISPATCH-WHICH METHOD WILL RUN IS DECIDED ON 
//OR AT RUNTIME SINCE OBJECT IS FORMED AT RUNTIME.
class One{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java.");
    }
}
class Two extends One{
    public void swagat(){
        System.out.println("Aapka swagat hai.");
    }
    public void name(){
        System.out.println("My name is Java in class 2.");
    }
}
public class Main
{
	public static void main(String[] args) {
// 		One obj = new One();
// 		Two nobj= new Two();
// 		nobj.name();
// 		obj.name();
        One obj = new Two();
    //REFERENCE OF SUPERCLASS ONE = OBJECT OBJ OF SUBCLASS.
    //BUT THE OPPOSITE I.E. 
    // Two obj2 = new One(); is not allowed.
    //REFERENCE OF SUBCLASS IS NOT EQUAL TO OBJECT OF SUPERCLASS.
    obj.greet();
    obj.name();//name (from obj) of subclass is executed.
    //name is overridden method.
    //obj.swagat();//NOT ALLOWED
    //NON-OVERRIDDEN METHOD OF SUB-CLASS IS NOT ALLOWED TO 
    //BE CALLED WITH obj.
	}
}
