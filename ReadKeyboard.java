import java.lang.*;
import java.util.*;

public class ReadKeyboard
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Tell Me Your Name");	
		String name;
		name=s.next();

		System.out.println("Welcome Mr "+name);
	}
}