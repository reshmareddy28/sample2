import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int count = 0;
		while (temp>0)
		{
			count++;
			temp = temp / 10;
		}
		double num = Math.pow(10, count-1);
		int i = (int)num;
		for (;i>0;i/=10)
		{
			System.out.print(n/i%10+"\t");
		}
	}
}
