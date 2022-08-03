class Square
{
	int side;
	public void set(int s)
	{
		side = s;
	}
	public int area()
	{
		return side*side;
	}
	public int perimeter()
	{
		return 4*side;
	}
}
class Rectangle
{
	int length,breadth;
	public void set(int l,int b)
	{
		length = l;
		breadth = b;
	}
	public int area()
	{
		return length*breadth;
	}
	public int perimeter()
	{
		return 2*(length+breadth);
	}
}
class Circle
{
	int radius;
	public void set(int r)
	{
		radius = r;
	}
	public double area()
	{
		return (22/7)*radius*radius;
	}
	public double circumference()
	{
		return 2*(22/7)*radius;
	}
}
public class Main
{
	public static void main(String[] args) {
		Square s = new Square();
		s.set(15);
		System.out.println("Area of square : "+ s.area());
		System.out.println("Perimeter of square : "+ s.perimeter());
		
		Rectangle r = new Rectangle();
		r.set(10, 5);
		System.out.println("Area of rectangle : "+ r.area());
		System.out.println("Perimeter of rectangle : "+ r.perimeter());
		
		Circle c = new Circle();
		c.set(7);
		System.out.println("Area of circle : "+ c.area());
		System.out.println("Circumference of circle  : "+ c.circumference());
	}
}
