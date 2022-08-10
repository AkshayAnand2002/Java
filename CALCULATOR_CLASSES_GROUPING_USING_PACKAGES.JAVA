//CREATE 3 CLASSES FOR CALCULATOR AND GROUP INTO 1 PACKAGE.
package calc;
class calculator1{
    public void calculate(int a,int b){
        System.out.println("RESULT OF ADDITION: "+ a+b);
    }
}
class scientific{
    public void calculate(int a,int b){
        System.out.println("SCIENTIFIC CALCULATOR");
        System.out.println("RESULT OF MULTIPLICATION OF SUM BY 2: "+ 2*(a+b));
        System.out.println("RESULT OF SINE: "+ Math.sin(a+b));
    }
}
class hybrid{
    public void calculate(int a,int b){
        System.out.println("HYBRID CALCULATOR");
        System.out.println("RESULT OF ADDITION: "+ a+b);
        System.out.println("RESULT OF MULTIPLICATION OF SUM BY 2: "+ 2*(a+b));
        System.out.println("RESULT OF SINE: "+ Math.sin(a+b));
        System.out.println("RESULT OF COSINE: "+ Math.cos(a+b));
    }
}
public class calculator {
    public static void main(String[] args){
        System.out.println("#CALCULATOR"); 
    }
}
//javac calculator.java //TO GET calculator.class
//javac -d . calculator.java //Creates a package calc which contains or groups all the classes in 
//the program calculator.java i.e. calculator.class,calculator1.class,hybrid.class,scientific.class.
//HENCE GROUPED INTO 1 PACKAGE calc.
//java calc/calculator //TO RUN THE ABOVE PROGRAM WHICH HAS CLASSES STORED IN PACKAGE calc.
//USED ABOVE: java <package-name>/<java file name>.
//OUTPUT->
//#CALCULATOR
