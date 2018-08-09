import java.time.temporal.ValueRange;
import java.util.Scanner;
class Ideone {

    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
        System.out.println(hasTeen(n));
       

    }


    public static boolean hasTeen(int n)
    {

        ValueRange range = ValueRange.of(1, 10);
        if (range.isValidIntValue(n) ) {
            return true;
        } else
            return false;
    }
}

	
