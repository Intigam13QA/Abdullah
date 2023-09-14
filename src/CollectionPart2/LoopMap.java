package CollectionPart2;

import java.util.HashMap;
import java.util.Map;

public class LoopMap {
    public static void main(String[] args) {
        Map<String ,String > dataMap = new HashMap<>();
        dataMap.put("Abdullah","Ismayilli");
        dataMap.put("Username","Abdul13");
        dataMap.put("Pasword","aaabbb");
        dataMap.put("Status","Tester");
        dataMap.put("Salary","$ 3000");

        for (String key : dataMap.keySet()){
            System.out.println(key);
        }
        System.out.println("____________");
        for (String value : dataMap.values() ){
            System.out.println(value);
        }
        System.out.println("________");
        for (String key : dataMap.keySet()){
            System.out.println(key+" "+ dataMap.get(key));
        }

    }
}
