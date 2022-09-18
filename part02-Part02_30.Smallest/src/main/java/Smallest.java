
public class Smallest {

    public static int smallest(int number1, int number2) {
        int min =  number1;
        if (number1 > number2) {
            min = number2;
        } else if (number1 < number2) {
            min = number1;
        }
        return min;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
