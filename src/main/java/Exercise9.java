import java.util.Scanner;

public class Exercise9 {
    public static void main (String[] args) {
//        Nhập vào số xe của bạn (gồm tối đa 5 chữ số).
//        Cho biết số xe của bạn được mấy nút?

        Scanner sc = new Scanner(System.in);
        int bsx;
        int sum = 0, sum1 = 0;
        int num = 0;
        int num1 = 0;

        System.out.print("Nhập bản số xe của bạn:");
        bsx = sc.nextInt();
        while (bsx > 0) {
            num = bsx % 10;
            bsx = bsx / 10;
            sum = sum + num;
        }

        while (sum > 10) {
            num1 = sum % 10;
            sum = sum / 10;
            sum1 = sum + num1;
        }
        if (sum1 == 10) {
            sum1 = sum1/10;
        }
        System.out.println("Con số may mắn của bạn:" + sum1);
     }
}
