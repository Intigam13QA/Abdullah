package CollectionPart2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMap {
    public static void main(String[] args) {
        List<Map<String, String>> employees = new ArrayList<>();

        Map<String, String> emploData = new HashMap<>();
        emploData.put("EmpoID", "123");
        emploData.put("EmploName", "Abdullah");
        emploData.put("EmploStatus", "Dev");
        emploData.put("EmploSalary", "80000");

        Map<String, String> emploData2 = new HashMap<>();
        emploData2.put("EmpoID", "333");
        emploData2.put("EmploName", "Ali");
        emploData2.put("EmploStatus", "Tes");
        emploData2.put("EmploSalary", "85000");

        employees.add(emploData);
        employees.add(emploData2);
        System.out.println(employees.toString());
        System.out.println(employees.size());
        System.out.println(employees.get(1).get("EmploName"));
        System.out.println("__________");

        for (Map<String, String> emp : employees){
            System.out.println(emp.get("EmpoID"));

        }
        System.out.println("___________");
        int total = 0;
        for (Map<String, String> emp : employees){
            total+=Integer.parseInt(emp.get("EmploSalary"));

        }
        System.out.println("Total salary is "+total);
    }
}
