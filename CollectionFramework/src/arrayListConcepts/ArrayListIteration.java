package arrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

    public static void main(String[] args)
    {

        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("John");
        studentNames.add("Prince");
        studentNames.add("Doe");
        studentNames.add("Lisa");

        // Typical For Loop

        for(int i =0; i<studentNames.size() ; i++)
        {
            System.out.println(studentNames.get(i));
        }

        System.out.println("-----------------");

        // For Each Loop

        for(String sNames : studentNames)
        {
            System.out.println(sNames);
        }

        System.out.println("-----------------");
        // Using Streams with Lambda -JDK 8
        studentNames.stream().forEach(ele-> System.out.println(ele));

        System.out.println("-----------------");
        // Using Iterator

        Iterator<String> it = studentNames.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
