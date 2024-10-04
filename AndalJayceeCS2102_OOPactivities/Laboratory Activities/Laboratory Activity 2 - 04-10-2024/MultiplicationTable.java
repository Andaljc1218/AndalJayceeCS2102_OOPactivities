import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int maxNumber = scanner.nextInt();

        int[][] multiplicationTable = new int[maxNumber][maxNumber];

        for (int i = 0; i < maxNumber; i++) {
            for (int j = 0; j < maxNumber; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Multiplication Table: ");
        for (int i = 0; i < maxNumber; i++) {
            for (int j = 0; j < maxNumber; j++) {
                System.out.printf("%4d", multiplicationTable[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}