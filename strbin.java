import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='1'||str.charAt(i)=='0')
			count++;
		}
		if(count==str.length())
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
