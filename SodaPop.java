public class SodaPop {

    public static void main(String[] args) {
        // Iterate through the numbers from 5 to 49
        for (int i = 5; i <= 49; i++) {
            // Check if the number is divisible by both 3 and 4
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print("Lemon ");
            }
            // Check if the number is divisible only by 3
            else if (i % 3 == 0) {
                System.out.print("Soda ");
            }
            // Check if the number is divisible only by 4
            else if (i % 4 == 0) {
                System.out.print("Pop ");
            }
            // If the number is divisible by neither, print the number
            else {
                System.out.print(i + " ");
            }
        }
    }
}
