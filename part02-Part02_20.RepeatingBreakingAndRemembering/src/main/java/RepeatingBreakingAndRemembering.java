
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            System.out.println(num);
            sum += num;
            count++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+count);
        double avg = 1.0 * sum / count;
        System.out.println("Average: "+avg);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
