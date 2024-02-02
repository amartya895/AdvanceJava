package UNIT1;

import java.util.ArrayList;
import java.util.Optional;

public class IsPresent {

    public static void main ( String[] args ) {
        ArrayList < Integer > intList = new ArrayList <> ( );
        intList.add ( 13 );
        intList.add ( 11 );
        intList.add ( 24 );

        intList.add ( 9 );
        intList.add ( 10 );

        Optional < Integer > reduce = intList.stream ( ).filter ( e -> e % 2 == 1 ).reduce ( ( x , y ) -> x + y );

        if (reduce.isPresent ( )) {
            System.out.println ( reduce.get ( ) );
        } else {
            System.out.println ( "Not Present" );
        }
    }
}
