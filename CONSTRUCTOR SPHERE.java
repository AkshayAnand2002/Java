class Radius {
    private int radius;
    public Radius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius ;
    }

    public double volume() {
        return (4.0/3.0) *Math.PI * radius * radius * radius;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Radius r = new Radius(12);
        System.out.println(r.surfaceArea());
        System.out.println(r.volume());
}
}
