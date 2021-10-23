import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        AllBounds allBounds = AllBounds.getInstance();
        AllPoints allPoints = AllPoints.getInstance();
        allPoints.loadData();
//        for (Map.Entry<Long, Point> pointEntry : allPoints.getPoints().entrySet()) {
//            System.out.println(pointEntry.getValue());
//        }
//
//        for (Map.Entry<String, Bound> boundEntry : allBounds.getBounds().entrySet()) {
//            System.out.println(boundEntry.getValue());
//        }

        Algorithm algorithm = new Algorithm();
        //algorithm.dfc(1L);
        //после этой штуки нужно построить обратный маршрут

        System.out.println();

    }
}
