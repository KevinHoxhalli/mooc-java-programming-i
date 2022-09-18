
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countP = 0;
        double sumP = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else if (num > 0){
                sumP = sumP + num;
                countP++;
            }
        }
        if (sumP == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sumP/countP);
        }
    }
}
