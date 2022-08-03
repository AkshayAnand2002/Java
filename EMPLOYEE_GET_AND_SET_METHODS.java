class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n) {
        name=n;
    }
}
public class Main
{
	public static void main(String[] args) {
		Employee akshay = new Employee();
        akshay.setName("AkshayAnand");
        System.out.println(akshay.getName());
        akshay.salary=500;
        System.out.println(akshay.getSalary());
	}
}
//COMPILED ON ONLINEGDB.
