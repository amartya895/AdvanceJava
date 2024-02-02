package UNIT1;

import java.util.Arrays;
import java.util.List;

public class FilterSortMap {

    public static void main ( String[] args ) {
        List < Integer > num = Arrays.asList ( 8 , 5 , 4 , 7 , 9 , 6 );

        num.stream ( )
                .filter ( e -> e % 2 == 0 )
                .sorted ( )
                .map ( e -> e * e )
                .forEach ( e -> System.out.println ( e ) );

    }
}
