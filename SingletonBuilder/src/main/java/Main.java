import java.util.ArrayList;
import java.util.List;

public class Main {

    final static int ELEMNTS = 40;
    final static int MAXIMUM = 432;

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        List<Integer> example = new ArrayList<>();
        Filter filter = new Filter(124);

        logger.log("Программа запущена");

        for (int i = 0; i < ELEMNTS; i++) {
            example.add((int) Math.round(Math.random()*MAXIMUM));
        }

        List<Integer> filtered = filter.filter(example);

        logger.log("Программа завершена");

    }
}
