package numberbased;
import java.util.*;
public class Armstrong
{
    public static void main(String[] args) 
     {
        int n, count = 0, a, b, c, sum = 0;
        Scanner s=new Scanner(System.in);
        System.out.print("Armstrong numbers from 1 to 1000:");
        System.out.println("Enter the 1st and 2nd interval:");
        int strt=s.nextInt();
        int last=s.nextInt();
        for(int i = strt; i <= last; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}
