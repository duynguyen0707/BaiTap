import java.util.Scanner;

public class Exercise10 {
//    10.Nhập vào 2 số nguyên.
//    Tính min và max của hai số đó.
    public static void main (String[] args){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a:" );
        a = sc.nextInt();
        System.out.print("Nhập số b:" );
        b = sc.nextInt();

        if(a==b){
            System.out.println("Hai số bằng nhau");
        }
        if (a>b){
            System.out.println("Số lớn là" + a);
            System.out.println("Số bé là" + b);
        }
        if (a<b){
            System.out.println("Số lớn là" + b);
            System.out.println("Số bé là" + a);
        }
    }
}
