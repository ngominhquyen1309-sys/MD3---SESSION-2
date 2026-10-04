import java.util.Scanner;

public class baitap6_ss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên N: ");
        int n = scanner.nextInt();

        // Nhớ: Công thức số âm thì chuyển thành số dương
        n = Math.abs(n);

        int sum = 0;

        while (n > 0) {
            int digit = n % 10; // Nhớ: Công thức lấy chữ số cuối cùng
            sum += digit;
            n = n / 10;         // Nhớ: Công thức bỏ chữ số cuối cùng
        }

        System.out.println("Tổng các chữ số là: " + sum);

        scanner.close();
    }
}