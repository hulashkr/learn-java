import java.lang.*;
import java.util.*;

class KeybRead
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a,b,sum;
        a = s.nextInt();
        b = s.nextInt();
        sum = a + b;
        System.out.println("Sum of a and b is " + sum);
    }
}