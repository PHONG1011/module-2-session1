//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập phân số 1
        System.out.print("Nhập tử số của phân số 1: ");
        int tu1 = scanner.nextInt();
        System.out.print("Nhập mẫu số của phân số 1: ");
        int mau1 = scanner.nextInt();

        // Nhập phân số 2
        System.out.print("Nhập tử số của phân số 2: ");
        int tu2 = scanner.nextInt();
        System.out.print("Nhập mẫu số của phân số 2: ");
        int mau2 = scanner.nextInt();

        // Tính tử và mẫu của kết quả
        int tuKQ = tu1 * mau2 + tu2 * mau1;
        int mauKQ = mau1 * mau2;

        // Rút gọn phân số
        int ucln = timUCLN(tuKQ, mauKQ);
        tuKQ /= ucln;
        mauKQ /= ucln;

        System.out.println("Tổng hai phân số là: " + tuKQ + "/" + mauKQ);
    }

    // Hàm tìm ước chung lớn nhất
    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
