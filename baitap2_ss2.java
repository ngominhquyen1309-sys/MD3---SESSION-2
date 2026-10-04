import java.util.Scanner;

public class baitap2_ss2 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào một số từ 1 đến 7:");

        int num = sc.nextInt();

        switch (num) {

            case 1:
                System.out.println("Chủ Nhật");
                break;
            case 2:
                System.out.println("Thứ hai");
                break;
            case 3:
                System.out.println("Thứ ba");
                break;
            case 4:
                System.out.println("Thứ tư");
                break;
            case 5:
                System.out.println("Thứ năm");
                break;
            case 6:
                System.out.println("Thứ sáu");
                break;
            case 7:
                System.out.println("Thứ bảy");
                break;
            default:
                System.out.println("Yêu cầu của bạn không hợp lệ!");
                break;
        }
        sc.close();
    }

}
