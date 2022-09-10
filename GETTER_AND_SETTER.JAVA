/******************************************************************************
GETTER AND SETTER METHOD IN JAVA.
*******************************************************************************/
class Data{
    private String name;
    public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name=name;
    }
}
public class Main
{   
	public static void main(String[] args) {
		Data d = new Data();
		d.setname("AKSHAY.");
		System.out.println(d.getname());
	}
}
