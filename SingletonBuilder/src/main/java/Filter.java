import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filter(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> filtered = new ArrayList<>();

        logger.log("Фильтрация массива запущена");

        for (Integer i : source) {
            if (i > treshold) {
                filtered.add(i);
                logger.log("Элемент: " + i + " проходит");
            } else {
                logger.log("Элемент: " + i + " не проходит");
            }
        }

        logger.log("Фильтрация массива завершена");

        return filtered;
    }
}
