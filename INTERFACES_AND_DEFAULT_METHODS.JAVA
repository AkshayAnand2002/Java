//INHERITANCE,INTERFACES,DEFAULT METHODS
//DEFAULT METHODS ENABLE US TO ADD NEW FUNCTIONALITY TO 
//EXISTING INTERFACES.
interface camera{
    void takesnap();
    void recordvideo();
    //void record4kvideo();
    //if we add the above constructor later after writing
    //program then we need to fix errors in all classes using
    //interface camera.So we use default method.
    private void greet(){
        System.out.println("GOOD MORNING.");
    }
    //INTERFACES CAN ALSO INCLUDE PRIVATE METHODS FOR DEFAULT
    //METHODS TO USE.
    default void record4kvideo(){
        greet();//TO GET GREET OUTPUT COMMENT THE NON-DEFAULT
        //record4kvideo() PRESENT IN CLASS BELOW.
        System.out.println("RECORDING IN 4K NOW...");
    }//IF THIS DEFAULT METHOD IS OVERWRITTEN IN ANY DERIVED 
    //CLASS BELOW THEN THAT OVERWRITTEN METHOD WILL BE EXECUTED.
}
interface wifi{
    String[] getnetworks();
    void connecttonetworks(String network);
}
class cellphone{
    void callnumber(int phonenumber){
        System.out.println("CALLING "+phonenumber);
    }
    void pickcall(){
        System.out.println("CONNECTING... ");
    }
}
class smartphone extends cellphone implements wifi,camera{
    public void takesnap(){
        System.out.println("TAKING SNAPSHOT NOW.");
    }
    public void recordvideo(){
        System.out.println("RECORDING VIDEO NOW.");
    }
    // public void record4kvideo(){//OVERWRITTEN DEFAULT METHOD HERE.
    //     System.out.println("RECORDING 4K VIDEO NOW.");
    // }//IF record4kvideo() is called then this will be called
    // //if not commented out and not that default method.
    public String[] getnetworks(){
        System.out.println("GETTING LIST OF NETWORKS.");
        String[] networklist={"ABC","DEF","GHI","JKL","MNO"};
        return networklist;
    }
    public void connecttonetworks(String network){
        System.out.println("CONNECTING TO "+network);
    }
}
public class Main
{
	public static void main(String[] args) {
        smartphone sm = new smartphone();
        String[] arr = sm.getnetworks();
        for(String item:arr){
            System.out.println(item);
        }
        sm.takesnap();
        sm.callnumber(90000);
        sm.pickcall();
        sm.recordvideo();
        sm.record4kvideo();
        //sm.greet();//THIS CAN'T BE DONE AS greet() is PRIVATE
        //method and can't be called.
	}
}
/*
OUTPUTS->
GETTING LIST OF NETWORKS.
ABC
DEF
GHI
JKL
MNO
TAKING SNAPSHOT NOW.
CALLING 90000
CONNECTING... 
RECORDING VIDEO NOW.
GOOD MORNING.
RECORDING IN 4K NOW...
*/
