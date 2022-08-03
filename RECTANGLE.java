class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int parimeter(){
        return 2*(length+breadth);
    }
}
public class Main
{
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
        rec.length = 5;
        rec.breadth = 7; 
        System.out.println(rec.area());
        System.out.println(rec.parimeter());
	}
}
