import java.util.HashMap;
import java.util.Map;

public class AllPoints {
    private static AllPoints instance;
    private final Map<Long, Point> points = new HashMap<>();

    private AllPoints() {
    }

    public static AllPoints getInstance() {
        if (instance == null) {
            instance = new AllPoints();
        }
        return instance;
    }

    public Map<Long, Point> getPoints() {
        return points;
    }

    public Point getPointByName(long name) {
        return points.get(name);
    }

    public void loadData() {
        points.put(1L, new Point(1L, 1, 1));
        points.put(2L, new Point(2L, 2, 3));
        points.put(3L, new Point(3L, 3, 4));
        points.put(4L, new Point(4L, 4, 5));
        points.put(5L, new Point(5L, 5, 3));
        points.put(6L, new Point(6L, 4, 2));
        points.put(7L, new Point(7L, 3, 1));
        points.put(8L, new Point(8L, 2, 2));

        points.get(1L).addBounds(8);
        points.get(2L).addBounds(8L, 3L);
        points.get(3L).addBounds(2L, 6L, 4L);
        points.get(4L).addBounds(3, 5);
        points.get(5L).addBounds(4,6);
        points.get(6L).addBounds(3,5,7);
        points.get(7L).addBounds(8,6);
        points.get(8L).addBounds(1, 7, 2);
    }

}
