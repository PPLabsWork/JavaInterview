package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

    public static void main(String[] args)
    {
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("A");
        ar1.add("B");
        ar1.add("C");
        ar1.add("D");
        ar1.add("E");

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("a");
        ar2.add("b");
        ar2.add("c");
        ar2.add("d");
        ar2.add("e");

        // addAll - combine 2 arrayList

        //ar1.addAll(ar2);
        // function overloading
        ar1.addAll(2, ar2);
        System.out.println(ar1);

        // clear
        ar2.clear();
        System.out.println(ar2);
        // Clone
        ArrayList<String> clonedArray =  (ArrayList<String>)ar1.clone();
        System.out.println(clonedArray);
        // contains - true/false
        System.out.println(ar1.contains("d"));
        System.out.println(ar1.contains("g"));

        // indexOf - true/false
        System.out.println(ar1.indexOf("d")>2);
        System.out.println(ar1.indexOf("A")>2);

        //asList
        ArrayList<String> list =  new ArrayList<>(Arrays.asList("X","Y","Z","X","Z","X"));
        System.out.println(list);

        // LastIndexOf
        System.out.println(list.lastIndexOf("X"));

        //remove

        list.remove("Z");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        //removeIf
        ArrayList<Integer> numberList =  new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numberList.removeIf(num->num%2!=0);
        System.out.println(numberList);

        // Sub list
        ArrayList<Integer> numberSubList =  new ArrayList<>(numberList.subList(1,4));
        System.out.println(numberSubList);

        //retainAll - give collection object
        ArrayList<String> nameList =  new ArrayList<>(Arrays.asList("John","Tom","Kelly","Lisa","Prince","Tom"));
        System.out.println(nameList);
        // From list give only Tom
        nameList.retainAll(Collections.singleton("Tom"));
        System.out.println(nameList);

        list.retainAll(Collections.singleton("X"));
        System.out.println(list);

        // Return toArray -Single Dimension Object
        ArrayList<String> newList =  new ArrayList<>(Arrays.asList("John","Tom","Kelly","Lisa","Prince","Tom"));
        Object arr[] = newList.toArray();
        System.out.println(Arrays.toString(arr));

        for(Object o: arr)
        {
            System.out.println(o);
            System.out.println((String)o);
        }







    }
}
