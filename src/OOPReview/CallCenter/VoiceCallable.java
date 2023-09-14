package OOPReview.CallCenter;

public interface VoiceCallable {
     public static final boolean can_cal = true;

    public abstract void call(String contact);

    public static void decline(){
        System.out.println("Mike declined voice call...");
    }
      public default void accept(){
          System.out.println("Mike finally accepted voice call...");
      }
}
