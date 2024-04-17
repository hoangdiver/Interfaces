package advance.dev;

class Triangle extends Shape implements IShape {
    private double a, b, c; // Độ dài 3 cạnh của tam giác

    // Constructor
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Phương thức tính chu vi của tam giác
    @Override
    public double chuVi() {
        return a + b + c;
    }

    // Phương thức tính diện tích của tam giác (sử dụng công thức Heron)
    @Override
    public double dienTich() {
        double p = chuVi() / 2; // Nửa chu vi
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // Phương thức nhập thông tin tam giác từ bàn phím
    @Override
    public void input() {
        // Nhập thông tin tam giác từ bàn phím
        // Implement logic nhận đầu vào từ bàn phím và gán giá trị cho các biến a, b, c
    }

    // Phương thức xuất thông tin tam giác
    @Override
    public void print() {
        // Xuất thông tin tam giác ra console
        // In ra các cạnh và kết quả tính toán (chu vi và diện tích)

    	        System.out.println("Loại hình: Tam giác");
    	        System.out.println("Cạnh a: " + a);
    	        System.out.println("Cạnh b: " + b);
    	        System.out.println("Cạnh c: " + c);
    	        System.out.println("Chu vi: " + chuVi());
    	        System.out.println("Diện tích: " + dienTich());
    	    }
    }


