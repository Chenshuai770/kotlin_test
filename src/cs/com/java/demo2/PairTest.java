package cs.com.java.demo2;

import javafx.util.Pair;

import java.util.AbstractMap;

public class PairTest {


    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "one");
        Integer key = pair.getKey();
        String value = pair.getValue();
        System.out.println(key);
        System.out.println(value);

        AbstractMap.SimpleEntry<Integer, String> entry = new AbstractMap.SimpleEntry<>(2, "two");
        Integer keyMap = entry.getKey();
        String valueMap = entry.getValue();
        System.out.println(keyMap);
        System.out.println(valueMap);



    }
}
