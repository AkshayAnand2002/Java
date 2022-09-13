class Main{
    String language;
    Main(){
        this.language="JAVA";
    }
    Main(String language){
        this.language=language;
    }
    public void getname(){
        System.out.println("PROGRAMMING LANGUAGE: "+ this.language);
    }
    public static void main(String[] args) {
		Main obj1 = new Main();
		Main obj2=new Main("PYTHON");
		obj1.getname();
		obj2.getname();
	}
}
/*
OUTPUT->
PROGRAMMING LANGUAGE: JAVA
PROGRAMMING LANGUAGE: PYTHON
*/
