package w4;

import w2.Auto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A","B"));
        list.add("C");
        System.out.println(list);
        System.out.println("Długość:" + list.size());
        list.set(1, "B1");
        System.out.println("Wartość na elemencie o indeksie 1:" + list.get(1));
        System.out.println(list);
        list.remove("B1");
        System.out.println(list);
        System.out.println("PĘTLA");
        for (String element : list) {
            System.out.println(element);
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        // lista obiektów klasy auto
        List<Auto> autos = new ArrayList<>(
                Arrays.asList(
                        new Auto("VW","Passat",150_000),
                        new Auto("BMW","5",250_000)
                        )
        );
        autos.add(new Auto("Mercedes","GLE", 400_000));
        System.out.println(autos);
    }
}
