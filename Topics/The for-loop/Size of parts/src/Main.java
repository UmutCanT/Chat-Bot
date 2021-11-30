import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pReady = 0;
        int pFix = 0;
        int pDeny = 0;
        int numberOfElements = scanner.nextInt();
        int partToCheck;

        for (int i = 0; i < numberOfElements; i++) {
            partToCheck = scanner.nextInt();

            switch (partToCheck) {
                case 1:
                    pFix++;
                    break;
                case 0:
                    pReady++;
                    break;
                case -1:
                    pDeny++;
                    break;
                default:
                    break;
            }
        }

        System.out.println(pReady + " " + pFix + " " + pDeny);
    }
}