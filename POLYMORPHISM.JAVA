//POLYMORPHISM
//IMPLEMENTING AN INTERFACE FORCES METHOD IMPLEMENTATION.
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
    public void samplemeth(){
        System.out.println("meth");
    }
}
public class Main
{
	public static void main(String[] args) {
        camera cam1 = new smartphone();
//THE ABOVE LINE MEANS THIS IS A SMARTPHONE BUT USED AS A CAMERA.
        //cam1.getnetworks(); //this is not allowed AS IT IS USED
        //AS A CAMERA AND WHICH DOES NOT CONTAIN getnetworks OF 
        //WIFI.
        //cam1.samplemeth(); //not allowed as samplemeth() is a 
        //method of smartphone and not of camera and here cam1 is used 
        //as camera and not smartphone.
        cam1.recordvideo();//cam1 camera has method recordvideo.
        cam1.takesnap();//cam1 camera has method takesnap.
        smartphone sm = new smartphone();
        sm.samplemeth();
        sm.recordvideo();
        sm.callnumber(9797);
        
	}
}
/*
OUTPUT->
RECORDING VIDEO NOW.
TAKING SNAPSHOT NOW.
meth
RECORDING VIDEO NOW.
CALLING 9797
*/
