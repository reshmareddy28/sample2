import java.util.Scanner;
class Ideone 
{
   
    static int addOne(int x)
    {
         return (-(~x));
    }
    public static void main(String[] args)
    {
    	 Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        System.out.printf("%d", addOne(n));
    }
}
