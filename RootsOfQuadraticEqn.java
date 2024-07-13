import java.lang.*;
import java.util.Scanner;

class RootsOfQuadraticEqn
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter coefficients of quadratic eqn ax^2 + bx + c ");
        System.out.println("Enter value of a : ");
        a = sc.nextInt();
        System.out.println("Enter value of b : ");
        b = sc.nextInt();
        System.out.println("Enter value of c : ");
        c = sc.nextInt();

        double r1,r2;
        r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Roots are " + r1 + " and " + r2);
    }
}