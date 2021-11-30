import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int numberOfElements = scanner.nextInt();

        for (int i = 0; i < numberOfElements; i++) {
            int numberToCheck = scanner.nextInt();

            if(numberToCheck % 4 == 0 && numberToCheck >= max) {
                max = numberToCheck;
            }
        }

        System.out.println(max);
    }
}