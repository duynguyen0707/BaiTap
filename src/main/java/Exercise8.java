import java.util.Scanner;

public class Exercise8 {
    public static void main (String[] args){
//        Nhập bán kính của đường tròn. Tính chu vi và
//        diện tích của hình tròn đó.
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.print("Nhập đường kính hình tròn:");
 r=sc.nextDouble();

 double s;
 double c;
        s = r*r*Math.PI;
        c=r*2*Math.PI;

        System.out.println("Diện tích hình tròn:" + s);
        System.out.println("Chu Vi hình tròn:" + c);

    }

}
