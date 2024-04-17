package advance.dev;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // Khai báo mảng 10 phần tử Shape
        Shape[] shapes = new Shape[10];

        // Gọi phương thức input() để nhập thông tin cho các hình
        input(shapes);

        // Gọi phương thức print() để in thông tin của các hình
        print(shapes);

        // Gọi phương thức findMaxArea() để tìm hình có diện tích lớn nhất
        findMaxArea(shapes);

        // Gọi phương thức findMaxAreaOfEachShape() để tìm diện tích lớn nhất của mỗi loại hình
        findMaxAreaOfEachShape(shapes);
    }

    // Phương thức nhập thông tin cho mảng shapes
    public static void input(Shape[] shapes) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Nhập thông tin cho hình thứ " + (i + 1));
            System.out.println("Chọn loại hình (1 - Tam giác, 2 - Hình tròn, 3 - Hình chữ nhật): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập độ dài cạnh a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Nhập độ dài cạnh b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Nhập độ dài cạnh c: ");
                    double c = scanner.nextDouble();
                    shapes[i] = new Triangle(a, b, c);
                    break;
                case 2:
                    System.out.print("Nhập bán kính r: ");
				shapes[i] = new Circle();
                    break;
                case 3:
                    System.out.print("Nhập chiều dài: ");
				System.out.print("Nhập chiều rộng: ");
				shapes[i] = new Rectangle();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    i--; // Lặp lại lần nhập cho phần tử này
                    break;
            }
        }
    }

    // Phương thức in thông tin của mảng shapes
    public static void print(Shape[] shapes) {
        System.out.println("Danh sách các hình:");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Thông tin hình thứ " + (i + 1) + ":");
            shapes[i].print();
            System.out.println();
        }
    }

    // Phương thức tìm hình có diện tích lớn nhất trong mảng shapes
    public static void findMaxArea(Shape[] shapes) {
        Shape maxAreaShape = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].dienTich() > maxAreaShape.dienTich()) {
                maxAreaShape = shapes[i];
            }
        }
        System.out.println("Hình có diện tích lớn nhất:");
        maxAreaShape.print();
        System.out.println();
    }

    // Phương thức tìm diện tích lớn nhất của mỗi loại hình trong mảng shapes
    public static void findMaxAreaOfEachShape(Shape[] shapes) {
        double maxTriangleArea = -1;
        double maxCircleArea = -1;
        double maxRectangleArea = -1;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Triangle) {
                double area = shapes[i].dienTich();
                if (area > maxTriangleArea) {
                    maxTriangleArea = area;
                }
            } else if (shapes[i] instanceof Circle) {
                double area = shapes[i].dienTich();
                if (area > maxCircleArea) {
                    maxCircleArea = area;
                }
            } else if (shapes[i] instanceof Rectangle) {
                double area = shapes[i].dienTich();
                if (area > maxRectangleArea) {
                    maxRectangleArea = area;
                }
            }
        }
        System.out.println("Diện tích lớn nhất của mỗi loại hình:");
        System.out.println("Hình tam giác: " + maxTriangleArea);
        System.out.println("Hình tròn: " + maxCircleArea);
        System.out.println("Hình chữ nhật: " + maxRectangleArea);
    }
}
