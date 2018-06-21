import java.io.*;
import java.util.*;
import java.util.Scanner;
public class oddoreven
{
public static void main(String arg[])
{
int a;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if((a>0)&&(a%2==0))
{
System.out.println("even");
}
 else if((a>0)&&(a%2!=0))
{
System.out.println("odd");
}
else
{
System.out.println("Negative");
}
}
}
