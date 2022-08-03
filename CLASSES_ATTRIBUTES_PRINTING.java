class employee{//TEMPLATE HAVING ATTRIBUTES INSIDE IT.
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("MY ID IS "+id);
        System.out.println("AND MY NAME IS "+name);
    }
    public int getsalary(){
        return salary;
    }
}
public class java50 {
    public static void main(String[] args) {
        System.out.println("THIS IS OUR CUSTOM CLASS.");
        employee akshay = new employee();//INSTANTIATING A NEW EMPLOYEE OBJECT.
        employee john = new employee();
        //SETTING PROPERTIES OR ATTRIBUTES NOW.
        akshay.id=12;
        akshay.name="AKSHAY ANAND";
        akshay.salary=39;
        john.id=19;
        john.name="JOHN SANCHEZ";
        john.salary=45;
        //PRINTING THE ATTRIBUTES NOW.
//        System.out.println(akshay.id);
//        System.out.println(akshay.name);
        akshay.printdetails();
        john.printdetails();
        int salary=john.getsalary();
        System.out.println(salary);
    }
}
