package UNIT1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartionByGroupBy {

    public static void main ( String[] args ) {

        ArrayList < Mobile > mobile = new ArrayList <> ( );

        mobile.add ( new Mobile ( "Iphone " , 1200 , "snapdragon" , 6 ) );
        mobile.add ( new Mobile ( "Nokia " , 900 , "Intel" , 6 ) );
        mobile.add ( new Mobile ( "Sony " , 1600 , "AI-5" , 8 ) );
        mobile.add ( new Mobile ( "onepluse " , 1400 , "AI-9" , 16 ) );

        Map < Boolean, List < Mobile > > mp = mobile.stream ( )
                .sorted ( ( m1 , m2 ) -> m2.ram > m1.ram ? 1 : -1 )
                .collect ( Collectors.partitioningBy ( e -> e.processor.equals ("processor" ) ) );

        List < Mobile > ls = mp.get ( true );
        for ( Mobile i : ls ) {
            System.out.println ( i.name + " : " + i.ram );
        }



    }
}
