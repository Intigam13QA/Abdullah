package OOPReview.CallCenter;

public class CallCenter {
    public static void main(String[] args) {

        WhatsApp wp = new WhatsApp();
        wp.call("Ali");
        wp.launch();
        wp.sendMessage("Assalamu Aleykum");
        wp.call("0516043615");
        wp.videoCall();
        MessagingApp a = new WhatsApp();
        a.sendMessage("ABdullah");
        ((WhatsApp)a).videoCall();
        System.out.println(wp.APP_TYPE);
        System.out.println(((WhatsApp) a).q);
        wp.accept();
        wp.allOCCompatible= true;
       VoiceCallable.decline();
        System.out.println(VoiceCallable.can_cal);
        wp.getCount();
        wp.setCount(4);

        System.out.println("_________________");
        VoiceCallable obj = new WhatsApp();
        //obj.launch();
        ((WhatsApp)obj).launch();
        ((WhatsApp)obj).allOCCompatible=false;
        System.out.println(((WhatsApp)obj).allOCCompatible);
        //((MessagingApp)obj).videoCall();
        ((VideoCallable)obj).videoCall();
        ((WhatsApp)obj).videoCall();

    }
}
