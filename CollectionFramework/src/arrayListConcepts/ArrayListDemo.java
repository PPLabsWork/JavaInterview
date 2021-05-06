package arrayListConcepts;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[]args)
    {
        //Declaring ArrayList

        //a. Default Generics
        ArrayList <Object> al = new ArrayList <>();
        al.add(100);
        al.add(200);
        al.add("Name");
        al.add("Prince");
        al.add(true);
        al.add('A');
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(4));
        System.out.println(al.get(6));
        System.out.println(al.get(-1));


    }
}
