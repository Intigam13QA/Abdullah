package StringManuplation1;

public class Replace {
    public static void main(String[] args) {

        String str = "Moscow is capital of Russa of Russa";// str in the Pool
        str = str.replace("Moscow", "Baku").replace("Russa", "Azerbaijan");
        System.out.println(str);

        String email = "firstName_lastName@gmail.com";
        String company = "capitalone";
        String newemail = email.replace("gmail", company);
        System.out.println(newemail);
        System.out.println(email);

        String sentences = "My name Is slave of my Sustainer";
        String newsentences = sentences.replace(" ", "");
        System.out.println(newsentences);



        String data = "26/10/2022 09:00";
        data = data.replace("/","").replace(":","").replace(" ","");
        System.out.println(data);


    }
}
