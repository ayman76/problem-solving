package DestinationCity;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> paths1 = List.of(
                List.of("London", "New York"),
                List.of("New York", "Lima"),
                List.of("Lima", "Sao Paulo")
        );
        System.out.println("Destination city for paths 1: " + solution.destCity(paths1));

        List<List<String>> paths2 = List.of(
                List.of("B", "C"),
                List.of("D", "B"),
                List.of("C", "A")
        );
        System.out.println("Destination city for paths 2: " + solution.destCity(paths2));

        List<List<String>> paths3 = List.of(
                List.of("A", "Z")
        );
        System.out.println("Destination city for paths 3: " + solution.destCity(paths3));
    }
}
