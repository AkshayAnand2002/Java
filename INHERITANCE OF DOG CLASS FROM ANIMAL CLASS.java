class Animal{
    public Animal(){
        System.out.println("My class consists of all the animals as the name speaks for itself");
    }
    public void location(){
        System.out.println("We live in the jungle");
    }
}

class Dog extends Animal{
    public Dog(){
        System.out.println("Bow Bow");
    }
    public void speak(){
        System.out.println("Hi, My name is lewis");
    }
}
public class Main
{
	public static void main(String[] args) {
	      Dog obje=new Dog();
          obje.location();//INHERITED FROM ANIMAL class
}
}
  
