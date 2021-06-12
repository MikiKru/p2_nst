package w4;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> romanToDecimal = new HashMap(){{
            put("I",1);
            put("II",2);
            put("III",3);
            put("IV",4);
            put("V",5);
            put("VI",6);
        }};
        System.out.println(romanToDecimal);
        romanToDecimal.put("VII",7);
        System.out.println("II w arabskiej notacji: " + romanToDecimal.get("II"));
        System.out.println(romanToDecimal);
        for (String key : romanToDecimal.keySet().stream().sorted().collect(Collectors.toList())){
            System.out.println("K:" + key + " V:" + romanToDecimal.get(key));
        }
    }

}
