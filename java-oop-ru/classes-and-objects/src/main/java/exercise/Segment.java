package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;

    public Segment(Point begin, Point end) {
        this.beginPoint = begin;
        this.endPoint = end;
    }

    public Point getBeginPoint() {
        return this.beginPoint;
    }

    public Point getEndPoint() {
        return this.endPoint;
    }

    public Point getMidPoint() {
        var x = (endPoint.getX() + beginPoint.getX()) / 2;
        var y = (endPoint.getY() + beginPoint.getY()) / 2;

        return new Point(x, y);
    }
}
// END
