package UNIT1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Mobile {

    String name;
    int price;
    String processor;
    int ram;

    public Mobile ( String name , int price , String processor , int model ) {
        this.name = name;
        this.price = price;
        this.processor = processor;
        this.ram = model;
    }

    void showMobile () {
        System.out.println ( name + " : " + price + " : " + processor + " : " + ram );

    }

}

public class ToArray {

    public static void main ( String args[] ) {

        Mobile m1 = new Mobile ( "Iphone 7+" , 2300 , "Intel" , 16 );
        List < Mobile > mobileList = new ArrayList <> ( );

        mobileList.add ( m1 );
        mobileList.add ( new Mobile ( "Samsung" , 1400 , "snapdragon" , 8 ) );

        mobileList.add ( new Mobile ( "Onepluse" , 1200 , "Intel Core" , 8 ) );
        mobileList.add ( new Mobile ( "Iphone 11" , 1800 , "ios15" , 16 ) );
        mobileList.add ( new Mobile ( "CustomIphone" , 1000 , "ios20" , 64 ) );

        Stream < Mobile > mobileStream = mobileList.stream ( ).sorted ( ( x , y ) -> x.price >= y.price ? 1 : -1 );

        Object[] arr = mobileStream.toArray ( );

        for ( Object obj : arr ) {
            Mobile mobile = (Mobile) obj;
            mobile.showMobile ( );
        }


    }
}
