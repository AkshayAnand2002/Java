class myemployee{
    private int id;
    private String name;
    public void setname(String n){
        name=n;
    }
    public void setid(int i){
        id=i;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
}
public class Main
{
	public static void main(String[] args) {
		myemployee akshay = new myemployee();
		//akshay.id=45;
		//akshay.name="Akshay Anand";
		//BOTH THE ABOVE LINES THROW ERROR 
		//BECOZ OF PRIVATE ACCESS MODIFIER.
		akshay.setname("AKSHAY ANAND");
		System.out.println(akshay.getname());
		akshay.setid(12);
		System.out.println(akshay.getid());
	}
}
