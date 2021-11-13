package assignment1;
import java.util.Scanner;
public class user1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
     System.out.println(sum);
	}

}
