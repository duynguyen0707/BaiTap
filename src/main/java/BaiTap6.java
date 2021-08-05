import java.util.Scanner;

public class BaiTap6 {
    public static void main (String[] args){
//        Nhập tên sản phẩm, số lượng và đơn giá.
//        Tính tiền và thuế giá trị gia tăng phải trả, biết:
//        a. tiền = số lượng * đơn giá
//        b. thuế giá trị gia tăng = 10% tiền
        String name;
        int unit;
        double price;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm:");
                name=sc.nextLine();
        System.out.print("Nhập số lượng:");
        unit=sc.nextInt();
        System.out.print("Nhập đơn giá:");
        price=sc.nextDouble();
        
        double total;
        total=price*unit;
        double vat;
     vat=total*0.1;
        System.out.println("Tổng tiền:" + total);
        System.out.println("VAT:" + vat);
    }
}
