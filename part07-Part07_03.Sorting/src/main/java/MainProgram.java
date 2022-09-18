
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        int[] numb = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numb, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numb, 1));
        System.out.println(indexOfSmallestFrom(numb, 2));
        int[] num = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(num));

        MainProgram.swap(num, 1, 0);
        System.out.println(Arrays.toString(num));

        MainProgram.swap(num, 0, 3);
        System.out.println(Arrays.toString(num));
        int[] n = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(n);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i=1; i<array.length; i++) {
            if(array[i] < smallest)
                smallest = array[i];
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){ 
        int smallest = 0;
        for(int i=1; i<array.length; i++) {
            if(array[i] < array[smallest])
                smallest = i;
        }
        return smallest;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = startIndex;
        for(int i=startIndex+1; i<table.length; i++) {
            if(table[i] < table[smallest])
                smallest = i;
        }
        return smallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        
        for(int i=0; i<array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
            if(i>0)
                System.out.println(Arrays.toString(array));
        }
        
    }

}
