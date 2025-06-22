import java.util.Scanner;

public class excise6 {
    public static void main(String[] args) {
        // Khai báo biến
        float width, height, area, circumference;

        // Nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        width = scanner.nextFloat();
        System.out.print("Nhập chiều cao hình chữ nhật: ");
        height = scanner.nextFloat();

        // Tính diện tích và chu vi
        area = width * height;
        circumference = 2 * (width + height);

        // In kết quả
        System.out.println("Diện tích hình chữ nhật: " + area);
        System.out.println("Chu vi hình chữ nhật: " + circumference);
    }
}