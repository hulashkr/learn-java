import java.lang.*;
import java.util.Scanner;

class AreaOfTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float base,height;
        base = sc.nextFloat();
        height = sc.nextFloat();
        float area = base*height/2;
        System.out.println(area);
    }
}