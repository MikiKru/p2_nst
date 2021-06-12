package w4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> numbers1 = new HashSet<>(Arrays.asList(1,2,3,4,4,4,4));
        Set<Integer> numbers2 = new HashSet<>(Arrays.asList(3,4,6,7));
        numbers1.add(5);
        System.out.println(numbers1);
        System.out.println("Czy jest w zbiorze liczba 3 " + numbers1.contains(3));
        System.out.println("Czy jest w zbiorze liczba 7 " + numbers1.contains(7));
        System.out.println(numbers1.size());
        // suma
        Set<Integer> addAllSet = new HashSet<>();
        addAllSet.addAll(numbers1);
        addAllSet.addAll(numbers2);
        System.out.println(addAllSet);
        // róznica
        Set<Integer> removeAllSet = new HashSet<>();
        removeAllSet.addAll(numbers1);
        removeAllSet.removeAll(numbers2);
        System.out.println(removeAllSet);
        // część wspólna
        Set<Integer> retainAllSet = new HashSet<>();
        retainAllSet.addAll(numbers1);
        retainAllSet.retainAll(numbers2);
        System.out.println(retainAllSet);

    }
}
