class Rectangle extends Shape {
    private double l;
    private double w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }
    @Override
    public double calculateArea() {
        return l * w;
    }
    @Override
    public String toString() {
        return "Rectangle with params " + l + ", " + w;
    }
}
