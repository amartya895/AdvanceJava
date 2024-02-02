package UNIT1;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    double price;

    public Product ( int id , String name , double price ) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Object_filter {


    public static void main ( String args[] ) {
        List < Product > p = new ArrayList <> ( );

        p.add ( new Product ( 101 , "HP" , 2300 ) );
        p.add ( new Product ( 102 , "DELL" , 2800 ) );
        p.add ( new Product ( 103 , "ACER" , 1200 ) );
        p.add ( new Product ( 104 , "MI" , 1800 ) );
        p.add ( new Product ( 105 , "MACOS" , 4200 ) );

        p.stream ( )
                .filter ( t -> t.price > 2000 )
                .forEach ( e -> System.out.println ( e.name + " : " + e.price ) );


    }


}
