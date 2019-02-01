package f_ArrayLists_2_Iterators;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(7);
        list.add(2);
        list.add(25);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()) {
            if(iterator.next()==2)
                iterator.remove();
        }

        for(Integer num : list)
            System.out.println(num);
    }
}
