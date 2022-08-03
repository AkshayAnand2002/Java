class mymainemployee{
    private int id;
    private String name;
    // public mymainemployee(){
    //     id=45;
    //     name="AKSHAY ANAND";
    // }
    public mymainemployee(String myname){
        id=45;
        name=myname;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        this.name=n;
    }
    public void setid(int i){
        this.id=i;
    }
    public int getid(){
        return id;
    }
}
public class Main
{
	public static void main(String[] args) {
	    mymainemployee akshay = new mymainemployee("Akshay Anand");
	    //akshay.setname("Akshay Anand");
	    //System.out.println(akshay.getname());
	    //ABOVE IS THE CONVENTIONAL WAY OF GETTING AND SETTING
	    //NOW WE WILL USE CONSTRUCTOR.
	    System.out.println(akshay.getid());
	    System.out.println(akshay.getname());
}
}
  
