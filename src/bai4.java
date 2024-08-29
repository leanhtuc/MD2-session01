import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số điểm môn Toán");
        Scanner sc = new Scanner(System.in);
        int toan = sc.nextInt();
        System.out.println("Nhập vào số điểm môn Văn");
        Scanner sc2 = new Scanner(System.in);
        int van = sc2.nextInt();
        System.out.println("Nhập vào số điểm môn Anh");
        Scanner sc3 = new Scanner(System.in);
        int anh = sc3.nextInt();

        System.out.println("Điểm Toán:"+toan);
        System.out.println("Điểm Văn:"+van);
        System.out.println("Điểm Anh:"+anh);
        double DTB =(double)(toan+van+anh)/3;
        System.out.println("Điểm trung bình của cả 3 Môn là :"+DTB);

    }
}
