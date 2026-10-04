import java.util.Scanner;

public class baitap4_ss2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int age = 0; // nếu chỗ này để scanner.nextInt() thì sẽ báo lỗi nếu người dùng nhập chữ hoặc để trống

        while (age <= 0){

            System.out.print("Hãy nhập vào tuổi của bạn:");

            if(scanner.hasNextInt()){

                age = scanner.nextInt();

                if (age <= 0){

                    System.out.println("Dữ liệu bạn nhập vào không hợp lệ. Vui lòng nhập vào một số nguyên  và lớn hơn 0");

                }

            } else{

                System.out.println("Dữ liệu bạn nhập vào không hợp lệ %n.  Vui lòng nhập vào một số nguyên  và lớn hơn 0");
                scanner.next();

            }
        }
        System.out.println("Tuổi của bạn là:" + age +"!");
        scanner.close();

    }
}
