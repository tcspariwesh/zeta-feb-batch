package collections.map.demo1;

import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args) {

        Map<Integer, Integer> marks = new HashMap<>();

        marks.put(101, 85);
        marks.put(102, 90);
        marks.put(90, 900);
        marks.put(103, 78);

        System.out.println("Marks of 102: " + marks.get(102));

        for (Map.Entry<Integer, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

