import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public void Calculate() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please select value of A");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("Please select value of B");
        double b = Double.parseDouble(reader.readLine());
        System.out.println("select one of the operators + / * - %");
        String operation = reader.readLine();

        switch (operation) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> System.out.println(a / b);
            case "%" -> System.out.println(a % b);
            default -> System.out.println("error");
        }
    }
}

