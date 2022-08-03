class ekclass{
    int a;
    public int geta(){
        return a;
    }
    ekclass(int v){
        // a=v;
        this.a=v;
    }
    public int returnone(){
        return 1;
    }
}
class doclass extends ekclass{
    doclass(int c){
        super(c);//calls ekclass(int v)
        //used or means to constructor with integer arguement.
        System.out.println("I AM A CONSTRUCTOR.");
    }
}
public class Main
{
	public static void main(String[] args) {
	   ekclass e = new ekclass(65);
	   doclass d = new doclass(5);
	   System.out.println(e.geta());
}
}
//this is a way foe us to reference an object of the 
//class which is being created/referenced.
//this.area=2 --->> this is a reference to current object.
//super is a reference used to refer immediate parent class
//object which can be used to refer immediate parent class 
//instance variable, which can be used to make parent class
//methods, which can be used to invoke parent class 
//constructor.
