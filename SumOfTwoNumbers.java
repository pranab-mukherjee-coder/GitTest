import java.lang.*;
import java.util.*;

public class SumOfTwoNumbers
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int a,b,c;
		boolean result;
		System.out.println("Enter two nos");
		
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		
		System.out.println("sum is "+c);
		result=s.hasNextInt();
		System.out.println("Result is an integer: "+result);
	}
}