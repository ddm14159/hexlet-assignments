package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private Integer floorCount;

    public Cottage(double area, Integer floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public String toString() {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }

    public double getArea() {
        return area;
    }

    public Integer compareTo(Home another) {
        return Double.compare(this.getArea(), another.getArea());

    }
}
// END
