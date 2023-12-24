import java.util.ArrayList;

public class SwitchHandler {
    public void SwitchPairs(ArrayList<String> list)
    {
        int size = list.size();
        int i=0;
        int pair=size/2;
        while(i<pair*2) {
            String s =  list.get(i);
            list.set(i, list.get(i+1));
            list.set(i+1,s);
             i+=2;
            }
        System.out.println(list);
        }
    }

