//CREATE A CLASS RECTANGLE AND USE INHERITANCE TO CREATE ANOTHER
//CLASS CUBOID.
class RectangleR{
    RectangleR(){
        System.out.print("The perimeter of the Rectangle is: ");
    }
    public int length;
    public int width;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    RectangleR(int l , int w){
        this.length = l; this.width = w;
    }
    public double perimeter(){
        return 2* (this.length + this.width);
    }
}
class Cuboid extends RectangleR{
    public int height;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    Cuboid(int l , int w , int h){
        super(l,w);
        this.height = h;
    }
    public double perimeter(){
        return 4 * (this.length + this. width + this.height);
    }
}
public class Main
{
	public static void main(String[] args) {
		RectangleR objR = new RectangleR();
        objR.setLength(4); objR.setWidth(5);
        System.out.println(objR.perimeter());
        Cuboid Cuboid = new Cuboid(4,5,6);
        System.out.println("Perimeter of Cuboid : " + Cuboid.perimeter());
	}
}
