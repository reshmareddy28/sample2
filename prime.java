import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int count=0;
		for(int i=1;i<=num1;i++)
		{
				if(num1%i==0)
				count++;
		}
		if(count==2)
			System.out.println("even");
		else
			System.out.println("odd");
	}
}
