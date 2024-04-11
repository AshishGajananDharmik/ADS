import java.util.Scanner; 
public class Recursion5{
	
	static int fib(int n)
	{
		if (n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Enter the number to print febonanic");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			System.out.print(fib(i) + " ");
		}
	}
}