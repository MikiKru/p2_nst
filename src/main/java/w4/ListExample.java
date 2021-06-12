package w4;

import w2.Auto;

import java.util.*;

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
        // osbługa wyjątków
        Scanner scanner = new Scanner(System.in);
        while (!autos.isEmpty()) {
            autos.forEach(System.out::println);
            try {
                // kod w którym mogą występować wyjątki
                System.out.println("Wrpowadź indeks do usuniecia: ");
                int index = scanner.nextInt();
                System.out.println("Usuwanie na indeksie " + index);
                autos.remove(index);
                // tutaj kod się wykonał w całości bez błędów i nie wykonujemy catch
            } catch (IndexOutOfBoundsException ex) { // obsługa błędów
                System.err.println("Błąd indeksowania - brak wartości na indeksie 10");
                ex.printStackTrace();
            } catch (InputMismatchException ex) {
                System.err.println("Błędny typ dla indeksu - musi byc liczba naturalna");
                scanner.nextLine();
            } catch (Exception ex){
                ex.printStackTrace();
            }

        }
        System.out.println("Już jest OK");
        System.out.println(autos);
        scanner.close();
    }
}
