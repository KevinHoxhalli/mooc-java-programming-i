
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeStatistics grades;

    public UserInterface(Scanner scanner, GradeStatistics grades) {
        this.scanner = scanner;
        this.grades = grades;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int value = Integer.valueOf(scanner.nextLine());
            if(value == -1)
                break;
            this.grades.addGrade(value);
        }
        this.grades.average();
        this.grades.averageByPassing();
        this.printGradeDistribution();
    }
    
    public void printGradeDistribution() {

        System.out.println("Grade distribution:");

        int grade = 5;

        while (grade >= 0) {
            int stars = this.grades.totalGradesFromPoints(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade--;
    }

}

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
