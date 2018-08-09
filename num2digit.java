import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int number = 0;
            	Scanner scanner = new Scanner(System.in);
            	number = scanner.nextInt();
            	while(number!=-1)
            	{
            		if(number>=0 && number<=999)
            		{
            			if(number==0)
            			{
                        			System.out.print("Zero");
            			} 
            			else 
            			{
                        			numberToWord(((number / 100) % 10), " Hundred");
                        			numberToWord((number % 100), " ");
            			}
			} 
			else
			{
            			System.out.print("NUMBER OUT OF RANGE");
            		}
     
            		number = scanner.nextInt();
            	}
	}
	public static void numberToWord(int num, String val) {
            String ones[] = {" ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten"," Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen"," Nineteen" };
            String tens[] = {" ", " "," Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };
            if (num > 19) 
            {
                System.out.print(tens[num / 10] + " " + ones[num % 10]);
            } else
            {
            	 System.out.print(ones[num]);
            }
            if (num > 0)
            {
                System.out.print(val);
            }
	}
    }
