import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.print("Nhập chiều dài của a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double S = a*a;
        double C = a*4;

        System.out.println("Diện tích của hình vuông là :"+S);
        System.out.println("Chu vi của hình vuông là :"+C);

    }
}
