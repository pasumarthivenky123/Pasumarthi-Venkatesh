package assignment1;
public class reversepyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("*"+" ");
			}
		System.out.println(" ");		
		}
	}
}
