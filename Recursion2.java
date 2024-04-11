import java.util.Scanner; 
public class Recursion2{
	public static void series(int n,int m)
	{	if(m<=10){
			System.out.println(n+"*"+m+"="+(n*m));
			series(n,m+1);
			}
	}






public static void main(String args[])
{
	System.out.println("enter the number ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	 System.out.println("Multiplication Table of " + num + ":");
series(num,1);
 

}

}