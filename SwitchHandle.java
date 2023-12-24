import java.util.ArrayList;
import java.util.Iterator;
public class SwitchHandle {


    public void removeBadPairs(ArrayList<Integer> list)
    {

        Iterator<Integer> itr = list.iterator();
        int size = list.size();
        if(size % 2!=0)
        {
            list.remove(size-1);
        }
        int i = 0;
        while (i < list.size()-1)
        {
            if(list.get(i)>list.get(i+1))
            {
                list.remove(i);
                list.remove(i);
            }else
                i+=2;
        }
        System.out.println(list);
    }
}
