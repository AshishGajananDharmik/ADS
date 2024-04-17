import java.util.Scanner;
public class Main
{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter lower case:");
String str=sc.next();
String ans="";
for(int i=0;i<str.length();i++)
{
 char ch=str.charAt(i);
ans+=(char)(ch-32);
}
System.out.println(ans);
}
}