import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bán kính đường tròn");
        double r = sc.nextDouble();
        double chuvi = 2*Math.PI*r;
        double dientich = Math.PI*Math.pow(r,2);
        System.out.println("Chu vi của đưởng tròn là :"+chuvi);
        System.out.println("Diện tích của đưởng tròn là :"+dientich);


    }
}
