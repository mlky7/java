public class Main {

    // Converts inches to centimeters
    public static double convertInchToCM(double inches) {
        return inches * 2.54;
    }

    // Converts feet and inches to centimeters
    public static double convertInchToCM(int feet, int inches) {
        return convertInchToCM((feet*12)+inches);
    }

    public static void main(String[] args) {
        System.out.println(convertInchToCM(5, 8));  // Feet & inches version
        System.out.println(convertInchToCM(68));   // Inches only version
    }
}
