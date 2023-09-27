import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();

        CalculateElectricityBill method = new CalculateElectricityBill();

        System.out.println(method.calculateBill(value));
    }
}