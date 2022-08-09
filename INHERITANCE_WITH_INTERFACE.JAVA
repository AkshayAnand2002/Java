interface camera{
    void takesnap();
    void recordvideo();
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
	}
}
/*
OUTPUT->
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
*/
