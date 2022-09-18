
import java.util.ArrayList;


public class GradeStatistics {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passingGrades;
    private ArrayList<Integer> gradesPoint;
    public GradeStatistics() {
        this.grades = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
        this.gradesPoint = new ArrayList<>();
    }
    
    public void addGrade(int value) {
        if(value < 0  || value > 100)
            return;
        if(value >= 50) {
            this.passingGrades.add(value);
        }
        this.grades.add(value);
        this.gradesPoint.add(pointsToGrade(value));
    }
    
    public void average() {
        double avg = 0;
        for(Integer i: this.grades) {
            avg +=i;
        }
        System.out.println("Point average (all): "+avg/this.grades.size());
        
    }
    
    public void averageByPassing() {
        if(this.passingGrades.isEmpty())
            System.out.println("Point average (passing): -");
        else {
            double avg = 0;
            for(Integer i: this.passingGrades) {
                avg +=i;
            }
            System.out.println("Point average (passing): "+avg/this.passingGrades.size());
        }
        double passPerc = 100.0 * this.passingGrades.size()/ this.grades.size() ;
        System.out.println("Pass percentage: "+passPerc);
            
    }
    
    public int pointsToGrade(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade; 
    }
    
    public int totalGradesFromPoints(int grade) {
        int total = 0;
        for (Integer received : this.gradesPoint) {
            if (received == grade) {
                total++;
            }
        }
        return total;
    }
    
}
