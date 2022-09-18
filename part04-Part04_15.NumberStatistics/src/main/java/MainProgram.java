
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics st1 = new Statistics();
        Statistics st2 = new Statistics();
        Statistics st3 = new Statistics();
        System.out.println("Enter numbers:");
        int i = scanner.nextInt();
        while(i!=-1){
            st1.addNumber(i);
            if(i%2==0) {
                st2.addNumber(i);
            } else {
                st3.addNumber(i);
            }
            i = scanner.nextInt();
        }
        
        System.out.println("Sum: "+st1.sum());
        System.out.println("Sum of even numbers: "+st2.sum());
        System.out.println("Sum of odd numbers: "+st3.sum());
    }
}
