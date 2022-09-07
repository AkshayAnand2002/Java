import java.util.*;
public class Main
{   double side1,side2,side3;
    private static double area;
    public static double calcarea(double side1,double side2,double side3){
        double s;
        s=(side1+side2+side3)/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double side1=sc.nextDouble();
		double side2=sc.nextDouble();
		double side3=sc.nextDouble();
		area=calcarea(side1,side2,side3);
		System.out.format("AREA:%.2f\n",area);
	}
}
