//LEFT AND RIGHT ROTATION OF STRING
import java.util.*;
public class Main
{   static String leftrotate(String str,int d){
    String ans = str.substring(d)+str.substring(0,d);
    return ans;
    }
    static String rightrotate(String str,int d){
        return leftrotate(str,str.length()-d);
    }

	public static void main(String[] args) {
		String str1 = "geeksforgeeks";
		System.out.println(leftrotate(str1,2));
		String str2 = "geeksforgeeks";
		System.out.println(rightrotate(str2,2));
	}
}
/*
OUTPUT->
eksforgeeksge
ksgeeksforgee
*/
