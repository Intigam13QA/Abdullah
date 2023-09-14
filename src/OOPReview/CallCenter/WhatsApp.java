package OOPReview.CallCenter;

public class WhatsApp extends MessagingApp implements VideoCallable, VoiceCallable {
    public int q = 13;


    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsApp sending a message " + msg + "...");
    }

    @Override
    public void videoCall() {
        System.out.println("WhatsApp doing a video, call Mr.Tom");
    }

    @Override
    public void call(String contact) {
        System.out.println("WhatsApp calling " + contact + "...");
    }


}
