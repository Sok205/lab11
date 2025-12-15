import java.util.List;

public class ListSummer {
    public static double sum(List<? extends Number> list) {
        double total = 0.0;
        for (Number num : list) {
            total += num.doubleValue();
        }
        return total;
    }
}
