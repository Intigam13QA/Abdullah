package ClassAndObjekts;

public class ContactEmail {
    public static void main(String[] args) {
        Contact phone = new Contact();

        phone.email = "info.ru";
        phone.name = "App";
        phone.phoneNumber = "099909090";

        phone.call();
        phone.sendMessage();
        phone.sendEmail();
    }
}
