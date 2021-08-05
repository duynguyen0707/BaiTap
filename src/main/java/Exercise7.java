import java.util.Scanner;

public class Exercise7 {
    public static void main (String [] args){
//        Nhập điểm thi và hệ số 3 môn Toán, Lý, Hóa
//        của một học sinh. Tính điểm trung bình của
//        học sinh đó
        Scanner sc = new Scanner(System.in);
        float math;
        float phys;
        float chem;
        System.out.print("Nhập điểm toán:");

        math=sc.nextFloat();
        System.out.print("Nhập điểm lý:");
        phys=sc.nextFloat();
        System.out.print("Nhập điểm hóa:");
        chem=sc.nextFloat();
        float total;
        total = math+phys+chem;
        System.out.print("Điểm trung bình môn:" + total/3);
    }
}
