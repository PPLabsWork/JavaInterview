package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

    public static void main(String[] args)
    {

        //1. Sorting and then equals

        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A","D","C","E","G"));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A","D","C","E","F"));

        Collections.sort(l1);
        Collections.sort(l2);

        System.out.println(l1.equals(l2));

        ArrayList<String> l3 = new ArrayList<>(Arrays.asList("G","D","C","E","A"));
        Collections.sort(l3);

        System.out.println(l1.equals(l3));

        //2. Compare and Find out additional element
        ArrayList<String> l4 = new ArrayList<>(Arrays.asList("A","B","C","E","F"));
        ArrayList<String> l5 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        l4.removeAll(l5);
        System.out.println(l4);

        //3. Missing Element

        l5.removeAll(l4);
        System.out.println(l5);

        //4. Common Elements
        ArrayList<String> l6 = new ArrayList<>(Arrays.asList("A","B","C","E","F"));
        ArrayList<String> l7 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        l6.retainAll(l7);
        System.out.println(l6);








    }
}
