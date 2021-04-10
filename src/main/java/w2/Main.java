package w2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // instancja klasy auto
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
        Auto auto3 = auto2;
//        auto1.model -> brak dostępu do składowej prywatnej
        auto1.setPrice(100_000);
        auto2.setBrand("VW");
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());
        Auto auto4 = new Auto("Audi","A6",200_000);
        System.out.println(auto4);
        // tablica
        int [] nubers = {1,2,3};
        Auto [] autos = {auto1,auto2,auto3,auto4};
        System.out.println("FOREACH");
        for(Auto a : autos){
            System.out.println(a);
        }
        // stream
        System.out.println("STRAM API");
        Arrays.stream(autos).forEach(System.out::println);
    }
}
