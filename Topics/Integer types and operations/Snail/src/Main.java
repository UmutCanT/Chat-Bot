import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int day = scanner.nextInt();
        int night = scanner.nextInt();
        int sumOfDis = 0;
        int dayCount = 0;

        while (sumOfDis < height - night){
            sumOfDis += day - night;
            dayCount++;
        }

        System.out.println(dayCount);
    }
}