class base{
    //WE KNOW THAT CONSTRUCTOR HAS THE SAME NAME AS CLASS.
    base(){
        System.out.println("I am a constructor.");
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
//CONSTRUCTOR.
}
}
  
