package app;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    private final List<String> list;
    // Метод повертає список імен
    public DataRepository ()  {
        list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Lucy");
        list.add("Denis");
        list.add("Tom");
    }

    public List<String> getData() {
        return list;
    }
}
