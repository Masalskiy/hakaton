import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Algorithm {
    //не забыть сбросить флаги
    private final Stack<Long> stack = new Stack<>();
    //private final Queue<Long> queue = new PriorityQueue<>();//добавление в очередь по порядку
    private final Queue<Long> queue = new ConcurrentLinkedQueue<>();

    private final int INFINITY = 100000000; // это число у нас будет служить в качестве "бесконечности"
    private int countOfVertexInTree; // количество рассмотренных вершин в дереве
    private List<Long> shortestPaths = new ArrayList<>(); // список данных кратчайших путей

    public void dfs(Long startWith) { // обход в глубину
        AllPoints.getInstance().getPointByName(startWith).visit();//берем первую вершину
        System.out.print(AllPoints.getInstance().getPointByName(startWith).getName() + " ");
        stack.push(startWith);
        while (!stack.empty()) {
            long v = getAdjUnvisitedVertex(stack.peek());
            if (v == -1) { // если непройденных смежных вершин нету
                stack.pop(); // элемент извлекается из стека
            } else {
                AllPoints.getInstance().getPointByName(v).visit();
                System.out.print(AllPoints.getInstance().getPointByName(v).getName() + " ");
                stack.push(v); // элемент попадает на вершину стека
            }
        }
    }

    //для dfs
    private long getAdjUnvisitedVertex(long v) {
        //извините за нечитаемый код:(
        Map<Long, Bound> temp = AllPoints.getInstance().getPointByName(v).getBounds();
        //все связи точки
        for (Map.Entry<Long, Bound> boundMap : temp.entrySet()) {
            if (!AllPoints.getInstance().getPointByName(boundMap.getKey()).isVisited()) {
                return boundMap.getKey();
            }
        }
        return -1;
    }

    public void bfc(Long startWith) { // обход в глубину
        AllPoints.getInstance().getPointByName(startWith).visit();//берем первую вершину
        System.out.print(AllPoints.getInstance().getPointByName(startWith).getName() + " ");
        queue.add(startWith);
        long v2;

        while (!queue.isEmpty()) {
            long v = queue.remove();
            while ((v2 = getAdjUnvisitedVertex(v)) != -1) {
                AllPoints.getInstance().getPointByName(v2).visit();
                System.out.print(AllPoints.getInstance().getPointByName(v2).getName() + " ");
                queue.add(v2);
            }
        }
    }

    public void resetVisits() {
        Map<Long, Point> points = AllPoints.getInstance().getPoints();
        for (Map.Entry<Long, Point> temp : points.entrySet()) {
            temp.getValue().resetVisit();
        }
    }


}

