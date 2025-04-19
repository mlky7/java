import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
//
//        int[] myArray = new int[5];
//        int[] anotherArray = myArray;
//        System.out.println(Arrays.toString(myArray));
//        System.out.println(Arrays.toString(anotherArray));
//
//        anotherArray[0] = 1;
//        myArray[4] = 4;
//
//        System.out.println(Arrays.toString(myArray));
//        System.out.println(Arrays.toString(anotherArray));
//
//        String[] splitString = "Hello World again! 1111 !!!!!!!!!!!!!!!!!!".split(" ");
//        printText(splitString);
//
//        System.out.println("@".repeat(20));
//        printText("helllooo", "World", "meoeoowowowowow");
//        printText(" ", " ", "!!!!");

        int[] values = readIntegers();
        int min = findMin(values);
        System.out.println("Minimum value: " + min);
    }
//
//    private static void printText(String... textList) {
//        for (String t : textList) {
//            System.out.println(t);
//        }
//    }

    private static int[] readIntegers() {
        System.out.println("Enter your numbers, separated by commas:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static void reverseArray(int[] arr){
        for(int i = arr.length-1; i >0; i--){
            System.out.println(i);
        }
    }
}
