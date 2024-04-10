package exercise;

// BEGIN
public class Circle {
    private Point center;
    private Integer radius;

    public Circle(Point center, Integer radius) {
        this.center = center;
        this.radius = radius;
    }

    public Integer getRadius() {
        return this.radius;
    }

    public Double getSquare() throws NegativeRadiusException {
        if (this.radius < 0) {
            throw new NegativeRadiusException("Error");
        }

        return Math.PI * radius * radius;
    }
}
// END
