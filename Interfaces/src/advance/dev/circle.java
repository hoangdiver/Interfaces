package advance.dev;

class Circle extends Shape implements IShape {
    private double r; // Bán kính của hình tròn

    // Constructor và các phương thức khác

    // Phương thức tính chu vi của hình tròn
    @Override
    public double chuVi() {
        return 2 * Math.PI * r;
    }

    // Phương thức tính diện tích của hình tròn
    @Override
    public double dienTich() {
        return Math.PI * r * r;
    }

    // Phương thức nhập thông tin hình tròn từ bàn phím
    @Override
    public void input() {
        // Implement logic nhập thông tin hình tròn từ bàn phím
    }

    // Phương thức xuất thông tin hình tròn
    @Override
    public void print() {
        // Implement logic xuất thông tin hình tròn ra console
    }
}

