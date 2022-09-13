/*
Write a java program that computes the resulting force (in accordance with xy coordinate
system) in x and y directions (shown in below Fig. 1) from the magnitude of the input force
“F” (given in Newton) and ‘theta (shown in Fig. 1) (given in Degree)’.
*/
import java.util.*;
public class Main
{   double F,angle;
    void ans(){
        System.out.println("X COMPONENT: "+F*Math.cos(Math.toRadians(angle)));
        System.out.println("Y COMPONENT: "+F*Math.sin(Math.toRadians(angle)));
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main p = new Main();
		p.F=sc.nextDouble();
		p.angle=sc.nextDouble();
		p.ans();
	}
}
/*
5
30
X COMPONENT: 4.330127018922194
Y COMPONENT: 2.4999999999999996
*/
