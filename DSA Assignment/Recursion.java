import java.util.Scanner; 
public class Recursion{
public static double series(int n)
{	
if(n==1)
return 1;
else{
	if(n%2==0){
	return series(n-1) -1.0/n;
	}else{
		return series(n-1)+1.0/n;
	}	
}
}


public static void main(String args[])
{
	System.out.println("enter the number ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
double result =series(num);
System.out.println("The sum of the series up to " + num + " is: " + result);
    

}

}