//INTERFACE
//MANY INTERFACES CAN BE IMPLEMENTED TO MAKE ONE CLASS.
//MORE THAN 1 INTERFACES CAN BE IMPLEMENTED.
//MORE THAN 1 ABSTRACT CLASS IS NOT ALLOWED.
//I.E. EXTENDS KEYWORD USED FOR MAKING CLASSES CAN'T BE USED 
//MORE THAN 1. USING EXTENDS WE CAN'T MAKE > 1 CLASS.
//USING EXTENDS ONLY 1 CLASS CAN BE MADE.
interface bicycle{
    int a =45;
    void applybrake(int decrement);
    void speedup(int increment);
}
interface hornbicycle{
    int a1=34;
    void blowhorn1();
    void blowhorn2();
}
class avoncycle implements bicycle,hornbicycle{
    void blowhorn(){
        System.out.println("PEE PEE PO PO ...");
    }
    public void applybrake(int decrement){
        System.out.println("APPLYING BRAKES.");
    }
    public void speedup(int increment){
        System.out.println("APPLYING SPEEDUP.");
    }
    public void blowhorn1(){
        System.out.println("BLOW HORN PEE BLOW HORN PEE.");
    }
    public void blowhorn2(){
        System.out.println("BLOW HORN PO BLOW HORN PO.");
    }
}
public class Main
{
	public static void main(String[] args) {
        avoncycle cycle = new avoncycle();
        cycle.applybrake(1);
        System.out.println(cycle.a);
        cycle.speedup(2);
        //WE CAN CREATE PROPERTIES IN INTERFACES.
        //BUT WE CAN'T MODIFY PROPERTIES IN INTERFACES 
        //AS THEY ARE FINAL.
        //cycle.a=456; //TRYING TO MODIFY THE VALUE OF a GIVES ERROR.
        cycle.blowhorn1();
        cycle.blowhorn2();
	}
}
/*
OUTPUT->
APPLYING BRAKES.
45
APPLYING SPEEDUP.
BLOW HORN PEE BLOW HORN PEE.
BLOW HORN PO BLOW HORN PO.
*/
