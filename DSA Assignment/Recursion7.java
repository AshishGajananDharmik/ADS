import java.util.Scanner; 
public class Recursion7{
	
	
	
	
	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		for(int d=2;d<=num ;++d)
		{
			while(num%d==0)
			{
				num=num/d;
				System.out.println(d);
			}
		}

	}
}