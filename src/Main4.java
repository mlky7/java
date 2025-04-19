import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int nums[] = new int[10];
        nums[5] = 50;

        double doublenums[] = new double[10];
        doublenums[2] = 3.4;
        System.out.println(doublenums[2]);

        int[] newNums = {1, 2, 3, 4, 5, 5, 7, 6, 2226};

        for (int ele : newNums) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("last = " + newNums[newNums.length-1]);


        String[] names = {"Abraham", "Jane", "Mark", "Rose", "Ishant"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        if(Arrays.binarySearch(names, "lllll") >=0){
            System.out.println("lllll is found");
        }else{
            System.out.println("llll not found");
        }
    }
}