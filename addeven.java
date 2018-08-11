import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=num1+num2;
		if(sum%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}
}
