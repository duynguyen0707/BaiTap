import java.time.Year;
import java.util.Scanner;

public class BaiTap2 {
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
tuoi();
 }
    static void tuoi(){
    int age;
    int year;
        int currentyear = Year.now().getValue();
        System.out.println(currentyear);
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập năm sinh:");
    year=sc.nextInt();

    age=currentyear-year;
    System.out.println("Số tuổi:" + age);
}

}
