/*
Requirements:
A courier service company has offices in four important place (places are denoted by codes – 1,2,3 and 4) in a city, but they have only one car. From these offices, they can send parcel to any other office. Let us assume that only one request is serviced at a time, and no new request is taken till the current request is serviced.  If the source and destination are the same, an error message has to be given.
Once a valid request is given at an office, the car does the following:
1.	goes to the source office
2.	takes the parcel
3.	goes to the destination office
delivers the parcel
*/
import java.util.*;
public class Main
{   static void source()
	{
		System.out.println();
		System.out.println("Going to the source office");
		System.out.println("...");
		System.out.println();
	}
	static void reached_src()
	{
		System.out.println("Reached to the source");
		System.out.println("...");
		System.out.println();
	}
	static void go()
	{
		System.out.println("Taking the parcel");
		System.out.println("...");
		System.out.println();
	}
	static void des()
	{
		System.out.println("Going to the destination office");
		System.out.println("...");
		System.out.println();
	}
	static void reached_des()
	{
		System.out.println("Reached to the destination");
		System.out.println("...");
		System.out.println();
	}
	static void delivered()
	{
		System.out.println("Parcel Delivered!!!");
	}
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter the source station");
		int source=a.nextInt();
		System.out.println("enter the destination station");
		int destination=a.nextInt();
		if(source == destination)
		{
			System.out.println("Source & Destination stations are same.");
		}
		else
		{
			source();
			reached_src();
			go();
			des();
			reached_des();
			delivered();
		}
		a.close();
	}
}
