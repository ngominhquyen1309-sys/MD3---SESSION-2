import java.util.Scanner;

public class baitap1_ss2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên:");

        int num = scanner.nextInt();

       if (num == 0) {
            System.out.print("Số bạn nhập không phải số chẵn cũng không phải lẻ");
       } else  if(num % 2 == 0){
           System.out.printf("Số %d là số chẵn",num);
       } else {
            System.out.printf("Số %d là số lẻ",num);
        }
    }
}