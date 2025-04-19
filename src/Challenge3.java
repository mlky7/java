import java.util.Arrays;
import java.util.Random;

public class Challenge3{
    public static void main(String[] args) {

        int[] nums = getRandomArray(5); // Corrected array assignment
        System.out.println("Original array: " + Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
        reverseArray(nums); // Reverse the sorted array

        System.out.println("Sorted array (descending): " + Arrays.toString(nums));
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = random.nextInt(100);
        }
        return newArray;
    }

    private static void reverseArray(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        for(int i = 0; i< array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 -i];
            array[array.length - 1 - i] = temp;
        }

    }
}
