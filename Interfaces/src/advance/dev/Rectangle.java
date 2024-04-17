package advance.dev;

class Rectangle extends Shape implements IShape {
    private double width, height; // Chiều rộng và chiều cao của hình chữ nhật

    // Constructor và các phương thức khác

    // Phương thức tính chu vi của hình chữ nhật
    @Override
    public double chuVi() {
        return 2 * (width + height);
    }

    // Phương thức tính diện tích của hình chữ nhật
    @Override
    public double dienTich() {
        return width * height;
    }

    // Phương thức nhập thông tin hình chữ nhật từ bàn phím
    @Override
    public void input() {
        // Implement logic nhập thông tin hình chữ nhật từ bàn phím
    }

    // Phương thức xuất thông tin hình chữ nhật
    @Override
    public void print() {
        // Implement logic xuất thông tin hình chữ nhật ra console
    }
}

