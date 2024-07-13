import java.lang.*;
import java.util.Scanner;

class AreaOfTriangle2
{
    public static void main(String[] args)
    {
        float a,b,c;
        System.out.println("Enter three sides of a triangle : ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        float s = (a+b+c)/2f;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of the triangle is  " + area);
    }
}