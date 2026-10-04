import java.util.Scanner;

public class baitap3_ss2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào một số nguyên dương: ");

        int inputNum = sc.nextInt();

        if (inputNum <= 0) {
            System.out.print("Số bạn nhập vào không hợp lệ!");
        }else {
            int sum = 0;

            for(int i = 1; i <= inputNum; i++){
                sum += i;
            }

        System.out.printf("Tổng các số từ 1 đến %d là %d%n", inputNum,sum);
        }

    }
}
