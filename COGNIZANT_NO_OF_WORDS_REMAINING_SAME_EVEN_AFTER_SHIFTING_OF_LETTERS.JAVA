/*
Vira writes an apology letter to anu. However, before Anu can read it, Vira’s enemy Rohan takes it and rotates the characters of each word left to right N times. Find the number of words that remain the same even after this shifting of letters.

Input Specification:

input1: String of words
input2: N, number of times rotation happens
Output Specification:

Your function should return the number of correct words.
Example 1:

input1: llohe ereth
input2: 2

Output : 2

Example 2:

input1: Sorry
input2: 2

Output : 0
*/
import java.util.*;
public class Main
{   static String leftrotate(String str,int d){
    String ans = str.substring(d)+str.substring(0,d);
    return ans;
    }
    // static String rightrotate(String str,int d){
    //     return leftrotate(str,str.length()-d);
    // }

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str1 = sc.nextLine();
		int n =sc.nextInt();
		String rotate=leftrotate(str1,n);
		char ch1[]=str1.toCharArray();
		char ch2[]=rotate.toCharArray();
		int count=0;
		for(int i=0;i<str1.length();i++){
        if(ch1[i]==ch2[i]){
            count++;
        }
    }
    System.out.println(count);
	}
}
