import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra ");
        boolean check = true;
        int num = scanner.nextInt();
        if (num < 2) {
            System.out.print("Khong phai so nguyen to");
        } else {

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                }
            }

        }
        if (check) {
            System.out.print("is prime");
        } else {
            System.out.print("is not prime");
        }

    }
}
