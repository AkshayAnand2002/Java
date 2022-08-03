//Write a function to convert Celsius temperature into Fahrenheit.
public class java48 {
    static float fahrenheit(float cel) {
        float fahren = (cel * (9/5.0f)) + 32.0f;
        return fahren;
    }
    public static void main(String[] args) {
        float celsius = 15.7f;
        System.out.println(celsius + " °C" + " -> " + fahrenheit(celsius) + " °F");
    }
}
