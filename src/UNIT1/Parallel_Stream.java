package UNIT1;

import java.util.Arrays;
import java.util.List;

class StudentNew {

    private String name;
    private int score;

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public void setScore ( int score ) {
        this.score = score;
    }

    public int getScore () {
        return score;
    }

    public StudentNew ( String name , int score ) {
        this.name = name;
        this.score = score;
    }


}

public class Parallel_Stream {
    public static void main ( String[] args ) {

//        IntStream is = IntStream.range ( 1,5 );
//        System.out.println ("Sequential Stream" );
//        is.forEach ( System.out::println );
//
//        IntStream ps = IntStream.rangeClosed ( 1,5 );
//        System.out.println ("Parallel Stream" );
//        ps.parallel ().forEach ( System.out::println );

        List < StudentNew > s = Arrays.asList (
                new StudentNew ( "Shivam" , 20 ) ,
                new StudentNew ( "Lakshay" , 21 ) ,
                new StudentNew ( "Shubham" , 23 ) ,
                new StudentNew ( "Amartya" , 27 ) ,
                new StudentNew ( "Saurav" , 22 ));


        System.out.println ("Sequential Stream" );

        s.parallelStream ().filter ( e -> e.getScore () >= 22 )
                .limit ( 3 )
                .forEach ( t -> System.out.println ("Name : " + t.getName () + " -> " + "Score : "+t.getScore () ) );


        System.out.println ("Parallel Stream" );

        s.stream ().filter ( e -> e.getScore () >= 22 )
                .limit ( 3 )
                .forEach ( t -> System.out.println ("Name : " + t.getName () + " -> " + "Score : "+t.getScore () ) );
    }

}
