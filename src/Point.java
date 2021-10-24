import exceptions.BoundAlreadyExistException;
import exceptions.NoExistPointException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Point {
    private Integer distance = Integer.MAX_VALUE;
    private static long id = 0;
    private final double latitude;
    private final double longitude;//долгота
    private final long name;
    private final Map<Long,Bound> bounds;
    private boolean isVisited = false;

    public Point(long name, double latitude, double longitude, long... boundWith) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.bounds = new HashMap<>();
        this.name = name;
        addBounds(boundWith);
        id++;
    }

    public Point(long name, double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.bounds = new HashMap<>();
        this.name = name;
        id++;

    }
    public boolean isVisited() {
        return isVisited;
    }

    public boolean visit() {
        return isVisited = true;
    }
    public void resetVisit(){
        isVisited = false;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public long getName() {
        return name;
    }

    public Map<Long,Bound> getBounds() {
        return bounds;
    }

    public void addBound(long name) throws BoundAlreadyExistException, NoExistPointException {
        Point destPoint = AllPoints.getInstance().getPointByName(name);
        if (destPoint == null) {
            throw new NoExistPointException();
        }
        if (!destPoint.equals(this)) {//если точка отличается, то ребро существует
            Bound temp = new Bound(this, destPoint);
            if (bounds.containsValue(temp)) {
                throw new BoundAlreadyExistException();
            }
            bounds.put(name, temp);
            if(!destPoint.getBounds().containsValue(temp)) {// нужно для того чтобы в AllBounds не хранились одинаковые ребра
                AllBounds.getInstance().addInAllBounds(temp);
            }
        }
    }

    public void addBounds(long... names) {
        for (long name : names) {
            try {
                addBound(name);
            } catch (BoundAlreadyExistException e) {
                System.out.println("Связь между точками " + this + " " + AllPoints.getInstance().getPointByName(name) + "уже существует");
            } catch (NoExistPointException e) {
                System.out.println("Создай точку с именем" + name);
            }
        }
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) longitude;
        result = 31 * result + (int) latitude;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Point))
            return false;
        Point other = (Point) obj;
        return (other.getLongitude() == this.getLongitude()) && (other.getLatitude() == this.getLatitude());
    }

    @Override
    public String toString() {
        return String.format("id=%s [%f, %f]", name, longitude, latitude);
    }
}
