package ArrayPart1;

public class SplitTask {
    public static void main(String[] args) {
        String st = "Your thesis, encapsulated in your thesis statement, is the central point" +
                " you’re trying to make. The thesis of Bertrand Russell’s essay “In Praise of " +
                "Idleness,” for example, is that people focus too much on work and don’t value " +
                "time spent idly. Essays can occasionally stray and go into related tangents, " +
                "but they always come back to that one core idea in the thesis. ";
        String [] aray = st.split(" ");
        System.out.println(aray.length);
            System.out.println(aray[62]);
        System.out.println(st.substring(st.length()-8));
        }
    }

