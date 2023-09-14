package ArrayLIST;

import java.util.ArrayList;

public class ArrayListPr3 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Baku");
        cities.add("Istanbul");
        cities.add("Landon");
        cities.add("Dc");
        cities.add("Berlin");
        cities.add("Baku");
        System.out.println(cities.toString());
        for (String city : cities){
            System.out.println(city+ " ");
        }
        System.out.println("----------");
        for (int i=0; i<cities.size();i++){
            System.out.println(cities.get(i));
        }
        System.out.println("Removing Baku");
        cities.remove("Baku");
        cities.remove("NewYork");
        System.out.println(cities.remove("Baku"));
        cities.add(0,"Alingdom");
        cities.add(1,"Islamabad");
        cities.add(2,"Ankara");
        cities.add(cities.size(),"Baku");
        System.out.println(cities.toString());
        System.out.println("---------");
        int indefIs = cities.indexOf("Istanbul");
        System.out.println("index of Istanbul " +indefIs);
        int indexBu = cities.indexOf("Bursa");
        System.out.println("Index of Bursa is " +indexBu);

        System.out.println("-------------");
        ArrayList<String> items = new ArrayList<>();
        items.add("Paper");
        items.add("book");
        items.add("letter");
        items.add("netbook bag");
        items.add("phen buuk");
        items.add("pensile");
        System.out.println("size of item is " +items.size());
        System.out.println(items.toString());
        for (String value : items){
            System.out.print(value+", ");
        }
        System.out.println();
        for (int i = 0; i<items.size();i++){
            if (i==0 || i==items.size()-1){
                System.out.print(items.get(i) +" ");
            }
        }
        System.out.println();
        System.out.print(items.get(0)+" "+items.get(items.size()-1));
        System.out.println();
        items.remove("book");
        items.remove("phen buuk");
        System.out.println(items.toString());
        System.out.println(items.get(0)+" "+ items.get(items.size()-1));
        items.remove(0);
        System.out.println(items.toString());
        System.out.println("---");
        System.out.println(items);
        System.out.println(cities);



    }
}
