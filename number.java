package assignment1;
public class number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
 for(int i=1;i<=n;i++)
 {
	 for(int j=1;j<i;j++)
	 {
		 System.out.print(" ");
	 }
	 for(int k=i;k<=n;k++)
	 {
		 System.out.print(i+" ");
	 }
	 System.out.println(" ");
 }
 for(int i=1;i<=n;i++)
 {
	 for(int j=1;j<i;j++)
	 {
		 System.out.print(" ");
	 }
	 for(int k=i;k<=n-i+1;k++)
	 {
		 System.out.print(k+" ");
	 }
	 System.out.println(" ");
 }
	}

}
