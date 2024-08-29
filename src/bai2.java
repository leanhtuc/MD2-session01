import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        final float tiGia =170;
        System.out.println("nhập vào số tiền ￥");
        Scanner sc = new Scanner(System.in);
        float JPY = sc.nextFloat();
        float VND = tiGia*JPY;
        System.out.println("Tỉ giá quy đổi ra VND là :"+VND+"VND");

    }
}
