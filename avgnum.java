import java.util.Scanner;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;int res=0;
	
       Scanner sc=new Scanner(System.in);
 
       
       n=sc.nextInt();
 
       int a[]=new int[n];
 
      
 
       for(int i=0;i<n;i++)
	   a[i]=sc.nextInt();
 
       for(int i=0;i<n;i++)
	   res =res+a[i];
 	 	    
        System.out.println(res/n);
 
    }
}
