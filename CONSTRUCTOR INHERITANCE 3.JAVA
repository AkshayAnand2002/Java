class base{
    //WE KNOW THAT CONSTRUCTOR HAS THE SAME BASE AS CLASS.
    base(){
        System.out.println("I am a constructor.");
    }
    base(int a){
        System.out.println("I am an overloaded constructor with value of a: "+a);
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
        super(0);
//NOW WE DON'T want to get base() so we use super(0) 
//TO GET base(int a) with value of a = 0.
//IF WE DON'T USE super() then by default base()
//is executed.
        System.out.println("I AM A DERIVED CLASS CONSTRUCTOR.");
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
	      derived d = new derived();
//IF DERIVED CLASS DOES NOT HAVE ITS OWN constructor
//THEN IT CALLS THE CONSTRUCTOR OF BASE CLASS.	 
//BUT IF IT HAS ITS OWN CONSTRUCTOR I.E. DERIVED class
//CONSTRUCTOR THEN WHEN CALLED IT PRINTS THE DERIVED class
//CONSTRUCTOR AND THE BASE CLASS CONSTRUCTOR.
//FIRST BASE CLASS CONSTRUCTOR COMES THEN DERIVED CLASS 
//CONSTRUCTOR.
}
}
  
