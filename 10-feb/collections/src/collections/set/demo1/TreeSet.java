package collections.set.demo1;

import java.util.HashSet;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {

        Set<String> names = new HashSet();

        names.add("Zara");
        names.add("Amit");
        names.add("Neha");

        System.out.println(names); // sorted output
    }
}
