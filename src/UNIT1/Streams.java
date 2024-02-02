package UNIT1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streams {
    public  static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(12);
        al.add(18);
        al.add(1);
        al.add(7);

        Stream<Integer> str = al.stream();

//        str.forEach(x -> System.out.println(x));
        str = str.distinct().sorted();
        System.out.println("After Sorted and distinct");
        str.forEach(x-> System.out.println(x));
    }
}
