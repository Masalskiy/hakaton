import java.util.HashMap;
import java.util.Map;

public class AllBounds {

    private static AllBounds instance;
    private final Map<String, Bound> bounds = new HashMap<>();

    private AllBounds() {
    }

    public static AllBounds getInstance() {
        if (instance == null) {
            instance = new AllBounds();
        }
        return instance;
    }

    public Map<String, Bound> getBounds() {
        return bounds;
    }
    public Bound getBoundByName(String name) {
        return bounds.get(name);
    }
    public void addInAllBounds(Bound bound){
        bounds.put(bound.getName(), bound);
    }
}
