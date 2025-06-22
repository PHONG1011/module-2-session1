//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package exercise03;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        // Khai báo biến
        double radius;
        double area;

        // Tạo đối tượng Scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập bán kính
        System.out.print("Nhập bán kính của hình tròn: ");
        radius = scanner.nextDouble();

        // Tính diện tích hình tròn
        area = Math.PI * radius * radius; // Công thức tính diện tích

        // Hiển thị kết quả ra màn hình
        System.out.printf("Diện tích hình tròn có bán kính %.2f là: %.2f%n", radius, area);

        // Đóng scanner
        scanner.close();
    }
}