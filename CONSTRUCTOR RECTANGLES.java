class rectangle{
    private int length;
    private int breadth;
    public rectangle(){
        this.length=4;
        this.breadth=5;
    }
    public rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
}
public class Main
{
	public static void main(String[] args) {
	    rectangle r = new rectangle();
	    rectangle r1 = new rectangle(12,56);
	    System.out.println(r.getlength());//4
	    System.out.println(r.getbreadth());//5
	    System.out.println(r1.getlength());//12
	    System.out.println(r1.getbreadth());//56
	    
}
}
  
