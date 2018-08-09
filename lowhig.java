import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int count,items;
		int newnum =0 ;
		int highest=0;
		int lowest =0;
		items = input.nextInt();
		for (count=0; count<items; count++)
		{
			newnum = input.nextInt();               
			if (highest<newnum)
            		highest=newnum;
			if (lowest==0)
            		lowest=newnum;
			else if (newnum<=lowest)
            		lowest=newnum;
		}
		System.out.print(lowest+"\t");
		System.out.println(highest);
	}
}
	
