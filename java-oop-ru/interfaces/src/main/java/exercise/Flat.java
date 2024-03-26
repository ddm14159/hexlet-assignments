package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private Integer floor;

    public Flat(double area, double balconyArea, Integer floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }
    public String toString() {
        return "Квартира площадью " + this.getArea() + " метров на " + this.floor + " этаже";
    }

    public double getArea() {
        return area + balconyArea;
    }

    public Integer compareTo(Home another) {
        if (this.getArea() > another.getArea()) {
            return 1;
        }

        if (this.getArea() < another.getArea()) {
            return -1;
        }

        return 0;
    }
}
// END
