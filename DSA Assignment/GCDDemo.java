import java.util.Scanner;

public class GCDDemo{


public static int gcd(int num1,int num2) 
{
if(num1>num2)
{
	if(num1%num2==0)
		return num2;
	else
		return gcd(num2,num1%num2);
		
}
else{
	if(num2%num1==0)
		return num1;
	else
		return gcd(num1,num2%num1);
}
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=gcd(a,b);
	System.out.println(c);
}

	}