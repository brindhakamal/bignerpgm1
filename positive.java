import java.io.*;
import java.util.*;
import java.util.Scanner;
public class positive {
    public static void main(String arg[])
    {
     int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a>0)
		{
		System.out.println("Positive number");
		}else if(a<0)
		{
		System.out.println("negative number");
		}else
		{
		System.out.println("Zero");
		}	
    }
}
