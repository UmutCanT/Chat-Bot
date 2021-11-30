import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();

        final int h2s = 3600;
        final int m2s = 60;

        System.out.println(h2s * (h2 - h1) + m2s * (m2 - m1) + (s2 - s1));
    }
}