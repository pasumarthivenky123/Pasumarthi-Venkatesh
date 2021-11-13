package assignment1;
import java.util.Scanner;
public class user3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int product;
		int n=5;
		for(int i=1;i<=num;i++)
		{
			product=n*i;
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
}
