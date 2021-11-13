package hello;
import java.util.Scanner;
 public class prime{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println("not a prime");
			}
		else
			{
				System.out.println("is a prime");
			}
		}
		}
		}

