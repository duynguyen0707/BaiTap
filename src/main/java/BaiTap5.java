import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiTap5 {
    public static void main (String[] args){
        //nhập năm sinh của 1 người
        //tính tuổi của người đó
//        int age;
//        int year;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập năm sinh:");
//        year=sc.nextInt();
//        age=2021-year;
//        System.out.println("Số tuổi:" + age);
//tuoi();

        calculate();

    }
//static void tuoi(){
//    int age;
//    int year;
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Nhập năm sinh:");
//    year=sc.nextInt();
//    age=2021-year;
//    System.out.println("Số tuổi:" + age);
//}

//    Nhập 2 số a và b.
//    Tính tổng, hiệu, tính và thương của hai số đó.

    static void calculate (){
        int a=0;
        int b=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chữ số a:");

        try {
            a= sc.nextInt();

        } catch (InputMismatchException e){
            System.out.println("Please valid number");//java.util.InputMismatchException: For input string: "5464645645"
            return;
        }

        System.out.print("Nhập chữ số b:");
        try {
            b=sc.nextInt();
        } catch (InputMismatchException e){
                System.out.println("Please valid number");
                return;
        }
        int sum;
        sum= a+b;
        System.out.println("Tổng của hai số là:" + sum);

        int sub;
        sub = a-b;
        System.out.println("Hiệu của hai số là:" + sub);

        int mul;
        mul = a*b;
        System.out.println("Tích của hai số là:" + mul);

        int dev;
        dev=a/b;
        System.out.println("Hiệu của hai số là:" + dev);
    }
}
