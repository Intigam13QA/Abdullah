package CollectionPart2;

import java.util.HashSet;
import java.util.*;
import CollectionPart1.Product;
public class HashSetOfProduct {
    public static void main(String[] args) {
        Set<Product> proSet = new HashSet<>();
        proSet.add(new Product("Book",8.9));
        proSet.add(new Product("Book", 56.7));
        proSet.add(new Product("Magazine",54.6));
        System.out.println(proSet.toString());
        System.out.println();
        proSet.forEach(m-> System.out.println(m.toString()));
        System.out.println();
        
        for (Product p : proSet){
            System.out.println(p.getPrice());
        }
        proSet.forEach(n-> System.out.println(n.getName()));



    }
}
