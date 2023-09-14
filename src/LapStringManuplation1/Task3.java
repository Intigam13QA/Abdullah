package LapStringManuplation1;

public class Task3 {
    public static void main(String[] args) {
        String str = "The";
        String newstr = "";
        for (int i = 0; i < str.length(); i++){


            newstr = newstr.concat(str.substring(i,i+1).concat(str.substring(i,i+1)));

        }
        System.out.println(newstr);

        String st = "badhas";
        if (st.substring(0,3).equals("bad")){
            System.out.println(true);
        }else if (st.substring(1,4).equals("bad")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}