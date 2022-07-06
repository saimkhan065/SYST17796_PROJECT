package Project;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public abstract class Dictionary<K,V> {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ace", 10);
        map.put("King", 10);

        System.out.println(map.entrySet());
    }
}
