

public class FromParameterToOne {

    public static void main(String[] args) {
        int num = 8;
        printFromNumberToOne(num);

    }
    
    public static void printFromNumberToOne(int number) {
        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }

}
