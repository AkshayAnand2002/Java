class base{
    int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;
    }
    public void print(){
        System.out.println("I AM A CONSTRUCTOR.");
    }
}
class derived extends base{
    public int y;
    public int gety(){
        return y;
    }
    public void set(int y){
        this.y=y;
    }
}
public class Main
{
	public static void main(String[] args) {
	    //CREATING AN OBJECT OF BASE CLASS.
	    base b = new base();
	    b.setx(4);
	    System.out.println(b.getx());
	    //CREATING AN OBJECT OF DERIVED CLASS.
	   derived d = new derived();
	   d.setx(44);
	   System.out.println(d.getx());
}
}
  
