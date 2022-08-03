class cellphone{
    public void ringing(){
        System.out.println("RINGING.");
    }
    public void vibrating(){
        System.out.println("VIBRATING.");
    }
    public void calling(){
        System.out.println("CALLING.");
    }
}
public class Main
{
	public static void main(String[] args) {
		cellphone ph = new cellphone();
		ph.calling();
		ph.vibrating();
		ph.ringing();
	}
}
