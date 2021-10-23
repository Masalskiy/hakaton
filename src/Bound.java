public class Bound {
    private final Point point1;
    private final Point point2;
    private double weight;
    private double distance;
    private boolean isVisited = false;
    private final String name;

    public Bound(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
        weight = Math.pow(Math.pow(point1.getLatitude() - point2.getLatitude(), 2)
                + Math.pow(point1.getLongitude() - point2.getLongitude(), 2), 0.5);//sqrt((x1^2-x2^2)^2 + (y1^2-y2^2)^2)
        //расстояние между точками
        distance = weight;
        this.name = point1.getName() + "-" + point2.getName();
    }

    public Bound(Point point1, Point point2, int weight) {
        this.point1 = point1;
        this.point2 = point2;
        this.weight = weight;
        this.name = point1.getName() + " - " + point2.getName();
        this.distance = Math.pow(Math.pow(point1.getLatitude() - point2.getLatitude(), 2)
                + Math.pow(point1.getLongitude() - point2.getLongitude(), 2), 0.5);//sqrt((x1^2-x2^2)^2 + (y1^2-y2^2)^2)

    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public boolean visit() {
        return isVisited = true;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (point1 != null) {
            result += point1.hashCode();
        }
        if (point2 != null) {
            result += point2.hashCode();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Bound))
            return false;
        Bound other = (Bound) obj;
        boolean firstPoint = other.point1.equals(this.point1) || other.point1.equals(this.point2);
        boolean secondPoint = other.point2.equals(this.point1) || other.point2.equals(this.point2);

        return firstPoint == secondPoint & firstPoint;
    }

    @Override
    public String toString() {
        return String.format("%s={%s\n\t %s}", name, point1, point2);

    }
}
