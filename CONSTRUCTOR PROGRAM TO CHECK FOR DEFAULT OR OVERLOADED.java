//PREVIOUS AND THIS PROGRAMS ARE OF CONSTRUCTORS.
class Constructortry
{
	private String name;
	private int sal;

	Constructortry()
	{
		name="DEFAULT";
		sal=00;
	}
	Constructortry(int s)
	{
		name="Overload";
		sal=s;
	}
	public int getSal()
	{
		return sal;
	}
}
public class Main
{
	public static void main(String[] args) {
		Constructortry ob=new Constructortry();		
		Constructortry ob2=new Constructortry(10000);
		System.out.println(ob.getSal());
		System.out.println(ob2.getSal());
	}
}
