import java.util.Scanner;

public class Calculator {
    public static double Calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select value of A");
        double a = sc.nextDouble();
        System.out.println("Please select value of B");
        double b = sc.nextDouble();
        System.out.println("Please select operation. 1-4 respectfully follows(+-*/)");
        int operation = sc.nextInt();

        double netice = 0;
        switch (operation) {
            case 1:
                netice = math_utils.topla(a, b);
                return netice;
            case 2:
                netice = math_utils.cix(a, b);
                return netice;
            case 3:
                netice = math_utils.vur(a, b);
                return netice;
            case 4:
                netice = math_utils.bol(a, b);
                return netice;
            default:
                netice = 0;
        }
        return netice;
    }
}

