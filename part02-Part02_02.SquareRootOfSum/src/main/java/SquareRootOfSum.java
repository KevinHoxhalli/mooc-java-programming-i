
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());
        int sum = a + b;
        double sqrt = Math.sqrt(sum);
        System.out.println(sqrt);
    }
}
