package UNIT1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MethodType {
    public static void main ( String[] args ) {

        //Non - terminal -> filter , map , distinct , limit
        // Terminal -> collect , count , min , max , forEach , toArray

        List<String> list = Arrays.asList ( "Car" , "bike","Bus" , "bike" , "car","Cycle" , "Cycle" );

       List<String>collect =  list.stream ().distinct ().collect( Collectors.toList());
        System.out.println (collect );

//        list.stream ().distinct ().forEach ( System.out::println);

      long itemCount =  list.stream ().distinct ().count ();
//        System.out.println (itemCount );

//        long x = list.stream ().count ();

        long y = list.stream ().distinct ().count ();
//        System.out.println (x );
//        System.out.println (y );

        list.stream ().limit ( 2 ).forEach ( System.out::println );


        List<Integer> numLis = Arrays.asList ( 2,3,8,6,4,2,8,12,16,15,13,1 );
      long evenCount =   numLis.stream ().filter ( x -> x%2==0 ).count ();
        System.out.println (evenCount );

        Optional<Integer> m =  numLis.stream ().min ( Integer::compareTo );
        System.out.println (m.get () );

    }
}
