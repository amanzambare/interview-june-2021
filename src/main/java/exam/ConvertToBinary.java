package exam;
import java.util.*;


  public class ConvertToBinary 
{
    public static void main(String[] args) 
    {
        int n, m;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Decimal Number:");
        n = s.nextInt();
        while(n > 0)
        {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        System.out.println(x);
    }
}

