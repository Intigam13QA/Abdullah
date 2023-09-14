package LapStringManuplation1;

public class Task4 {
    public static void main(String[] args) {
        String str="ma dam";
        String palin1 = "";
        for (int i = str.length()-1; i>=0; i--){
            palin1=str.charAt(i)+palin1;

        }
       if (str.replace(" ","").equalsIgnoreCase(palin1.replace(" ",""))){
           System.out.println(true);
       }else {
           System.out.println(false);

       }
    }
}
