import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Four");
        list.add("Score");
        list.add("And");
        list.add("Seven");
        list.add("years");
        list.add("Ago");
        list.add("AL0");


        SwitchHandler s = new SwitchHandler();
        s.SwitchPairs(list);
    }
}
