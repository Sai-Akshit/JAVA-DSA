package problems;

import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();

        double d = Math.sqrt( (b*b) - (4*a*c) );
        double x1 = 0;
        double x2 = 0;

        if (d > 0.0) {
            x1 = ( ((-1*b) + d) / 2*a );
            x2 = ( ((-1*b) - d) / 2*a );
            System.out.println("The roots are "+x1+"and "+x2);
        } else if (d == 0) {
            x1 = ( ((-1*b) - d) / 2*a );
            System.out.println("The roots are "+x1);
        } else {
            System.out.println("Complex Roots");
        }
    }
}
