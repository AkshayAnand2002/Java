class cylinder{
    private int radius;
    private int height;
    public int getradius(){
        return radius;
    }
    public cylinder(int radius,int height){
        this.radius = radius;
        this.height=height;
    }
    public void setradius(int radius){
        this.radius=radius;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int height){
        this.height=height;
    }
    public double surfacearea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class Main
{
	public static void main(String[] args) {
	    cylinder mycylinder = new cylinder(9,12);
	    //mycylinder.setheight(12);
	    System.out.println(mycylinder.getheight());
	    //mycylinder.setradius(9);
	    System.out.println(mycylinder.getradius());
	    System.out.println(mycylinder.surfacearea());
	    System.out.println(mycylinder.volume());
}
}
