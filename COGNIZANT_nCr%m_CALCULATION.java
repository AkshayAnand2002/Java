/*
Williamson is an analyst he needs to analyse a particular topic for performing analysis for that he needs to find a permutation of a given object.He don’t know how to find permutation so for simplifying his work he is hiring one software developer who can code for him and find a permutation and combination of a given object.

Consider you are giving an interview to williamson for working with him. Find a permutation of given input to proof that you are fit for his requirement.

Input Specification:
nCr where n and r are numbers given by Williamson to you
nCr is defined as n! / (r! x (n-r)!)

Here, n! denotes the factorial of a number. Also, you have to calculate this number as modulo
Input Specification:

input1: The number n.
Input2: The number r.
Input3: The number m,
.
Output specification:

The value of nCr%m.
Example 1:
Input1: 3
Input2: 2
Input3: 10000000009

Output:3

Explanation:
n=3.r=2,m=100 So, n!=3!=6, r!=2!=2, (n-1)!= 1!=1.
So, nCr = (6/(2*1))%1000000009= 3.

Example 2:
input1: 5
input2: 2
input3: 1000000009

Output: 10

Explanation:
n=5,r=2, m=100 So, n!=5!=120, r!=2=2, (n-1)!= 3!=6.
So, nCr = (120/(2*6))%1000000009= 10.
*/
import java.util.*;
public class Main
{
    static int fact(int number){
        int f=1;
        int j=1;
        while(j<=number){
            f=f*j;
            j++;
        }
        return f;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		long m=sc.nextLong();//as m's value is very large.
		int result = fact(n)/(fact(r)*fact(n-r));
		long finalresult =(long)result%m;//as m is of longtype
		//and finalresult can be of longtype so we typecasted into long.
		System.out.println(finalresult);
		//System.out.println(result);
	}
}
