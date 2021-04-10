package w3;

import java.util.Map;

public class Main {

    public boolean compareObjects(Simple s1, Simple s2){
        try {
            // tutaj identyfikujemy wyjątek
            return s1.getTitle().length() > s2.getTitle().length();
        } catch (NullPointerException ex){
            // tutaj obsługujemy wyjątek, ale tylko gdy wystąpi
            System.out.println("Pole jest null");
            return false;
        }
    }

    public static void main(String[] args) {
//        Object object = new Object();
//        Simple simple = new Simple();
//        SubSimple subSimple = new SubSimple();
//        SubSimple subSimple2 = new SubSimple("X",1);
//        System.out.println(object.toString());
//        System.out.println(simple.toString());
//        subSimple.setTitle("Example title");
//        subSimple.setNumber(5);
//        System.out.println(subSimple.toString());
//        System.out.println(subSimple2.toString());

        // POLIMORFIZM
        Object simpleObject = new Simple();
        Simple simple = new Simple("X");
        Simple subSimple = new SubSimple("XXX",1);

        System.out.println(simpleObject.getClass());
        System.out.println(simple.getClass());
        System.out.println(subSimple.getClass());

        Main main = new Main();
        System.out.println("PORÓWNANIE: " + main.compareObjects(simple, subSimple));
        System.out.println("PORÓWNANIE: " + main.compareObjects(subSimple, simple));
        System.out.println("PORÓWNANIE: " + main.compareObjects(subSimple, (Simple) simpleObject));

    }
}
