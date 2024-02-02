package UNIT1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
    public static void main (String[] args) {
        List<Integer> myList = Arrays.asList(12 , 4, 7 ,3,9 ,12,6,8,3,4,45 , 37 ,87,23,92,64);
        List<Integer> square = myList.stream().map(x -> x*x).collect(Collectors.toList());
            System.out.println(square);
//            List<Integer> newList = new ArrayList<>();
//            newList.add(10);
//            newList.add(17);
//            newList.add(5);
//            newList.add(8);
//
//            List<Integer> evenList = new ArrayList<>();
//
//            myList.forEach(x -> {
//                if(x%2 == 0)
//                {
//                    evenList.add(x);
//                }
//            });
//
//            System.out.println(myList);
//             System.out.println(evenList);
//
//        Stream<Integer> stream1 = myList.stream();
//         List<Integer> collect1 = stream1.filter(n -> n % 2 == 0).toList();
//
//     System.out.println(collect1+"Collected1\n");
//
//        Stream<Integer> stream2 = myList.stream();
//        List<Integer> collect2 = stream2.filter(n -> n % 2 != 0).toList();
//
//        System.out.println(collect2+"Collected2 \n");
//
//        Stream<Integer> stream3 = myList.stream();
//        List<Integer> collect3 = stream3.filter(x -> x > 25).toList();
//        System.out.println(collect3+"Collected3\n");
//
//        String[] name = {"Aman" , "Ronit" , "Rahul" , "Amar"};
//
//        List<String> myFriend = Stream.of(name).toList();
//
//        String[] name2 = {"shyam" , "sonu" , "rohan" , "raj"};
//        Stream<String> str1 = Stream.of(name);
//        str1.forEach(e -> {
//            System.out.println(e);
//        });
//
//        Stream<Object> emptyStream = Stream.empty();
//        emptyStream.forEach(x->{r
//            System.out.println(x);
//        });
//
//      IntStream stream1 = Arrays.stream(new int[] { 8 , 4, 9 ,3,7,});
//
//               stream1.forEach(e->{
//                    System.out.println(e);
//               });
//
//               Stream<String > stream2 = Arrays.stream(new String[]{"CSE" , "ECE","MTH" ,"MEC"});
//
//        List<Integer> newList = new ArrayList<>();
//
//        newList.add(50);
//        newList.add(54);
//        newList.add(15);
//        newList.add(5);
//        Stream<Integer> stream3 = newList.stream();
//        stream3.forEach(e->{
//            System.out.println(e);
//        });

//        List< String > string1 = Arrays.asList ("Ram", "Mohan", "Sohan", "Rohan");
//        List< String > s2 = string1.stream ().filter (e -> e.startsWith ("S")).collect (Collectors.toList ());
//        System.out.println (s2);


    }
}
