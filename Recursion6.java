import java.util.Scanner; 
public class Recursion6{
	
	
	public static float GCD(int a,int b)
	{
		if(a>b)
		{
			if(a%b==0)
			return b;
			else
			return GCD(b,a%b);
		}
		else{
			if(b%a==0)
			return a;
			else
			return GCD(a,b%a);

		
			}
	}
	public static void main(String args[])
	{
		System.out.println("Enter the two number");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		float num3=(num1*num2)/GCD(num1,num2);
		System.out.println("LCM of two number are"+num3);
	}
}