class base{
    //WE KNOW THAT CONSTRUCTOR HAS THE SAME BASE AS CLASS.
    base(){
        System.out.println("I am a constructor.");
    }
    base(int x){
        System.out.println("I am an overloaded constructor with value of x: "+x);
    }
    public int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;
    }
}
class derived extends base{
    derived(){
        System.out.println("I AM A DERIVED CLASS CONSTRUCTOR.");
    }
    derived(int x,int y){
        super(x);
        System.out.println("I AM AN OVERLOADED CONSTRUCTOR OF DERIVED CLASS WITH VALUE OF y AS : "+y);
    }
    public int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
}
public class Main
{
	public static void main(String[] args) {
	      base b = new base();
	   //   derived d = new derived();
          derived d = new derived(14,9);
}
}
 /*OUTPUT-
I am a constructor.
I am an overloaded constructor with value of x: 14
I AM AN OVERLOADED CONSTRUCTOR OF DERIVED CLASS WITH VALUE OF y AS : 9
 */ 
