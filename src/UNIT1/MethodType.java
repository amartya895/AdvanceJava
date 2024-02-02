package UNIT1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodType {
    public static void main ( String[] args ) {

        //Non - terminal -> filter , map , distinct , limit
        // Terminal -> collect , count , min , max , forEach , toArray

//        List < String > list = Arrays.asList ( "Car" , "bike" , "Bus" , "bike" , "car" , "Cycle" , "Cycle" );
//
//        List < String > collect = list.stream ( ).distinct ( ).collect ( Collectors.toList ( ) );
//        System.out.println ( collect );

//        list.stream ().distinct ().forEach ( System.out::println);

//        long itemCount = list.stream ( ).distinct ( ).count ( );
//        System.out.println (itemCount );

//        long x = list.stream ().count ();

//        long y = list.stream ( ).distinct ( ).count ( );
//        System.out.println (x );
//        System.out.println (y );

//        list.stream ( ).limit ( 2 ).forEach ( System.out::println );


//        List < Integer > numLis = Arrays.asList ( 2 , 3 , 8 , 6 , 4 , 2 , 8 , 12 , 16 , 15 , 13 , 1 );
//        long evenCount = numLis.stream ( ).filter ( x -> x % 2 == 0 ).count ( );
//        System.out.println ( evenCount );
//
//        Optional < Integer > m = numLis.stream ( ).min ( Integer::compareTo );
//        System.out.println ( m.get ( ) );


        //reduce

        List < String > list1 = Arrays.asList ( "A" , "B" , "C" , "D" , "1" , "2" , "3" );

        Optional < String > alphaNum = list1.stream ( ).reduce (
                ( val , comb ) -> {
                    return val + comb;
                }
        );

        System.out.println ( alphaNum.get ( ) );


        List < Integer > lisInt = Arrays.asList ( 1 , 2 , 4 , 9 , 8 );

        Optional < Integer > sum = lisInt.stream ( ).reduce (
                ( val , add ) -> {
                    return val + add;
                }
        );

        System.out.println ( sum.get ( ) );


        //toArray

        Object arr[] = list1.stream ().toArray ();
        System.out.println (arr.length );
        for ( Object x : arr )
        {
            System.out.println (x );
        }


    }
}
