import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất (firstNumber): ");
        int firstNumber = sc.nextInt();

        System.out.print("Nhập số thứ hai (secondNumber): ");
        int secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;

        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println("--- Kết quả các phép tính ---");
        System.out.println("Số thứ nhất: " + firstNumber);
        System.out.println("Số thứ hai: " + secondNumber);
        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        System.out.println("Thương: " + quotient);
        System.out.println("Phần dư: " + remainder);
        sc.close();
    }
}
