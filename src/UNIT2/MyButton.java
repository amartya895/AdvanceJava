package UNIT2;

import javax.swing.*;
import java.awt.*;

public class MyButton {
    public static void main ( String[] args ) {
        JFrame jf = new JFrame ( "My Button Demo" );
        jf.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        jf.setBounds ( 350 , 100 , 800 , 600 );

        Container cont = jf.getContentPane ( );
        cont.setLayout ( null );

        ImageIcon img = new ImageIcon ( "/Users/amartyasen/Downloads/Hairdo/submit.png" );
        JButton btn = new JButton (  img);

        btn.setSize ( 200 , 100 );
        btn.setLocation ( 100  ,100 );


        btn.setFont ( new Font ( "Arial" , Font.PLAIN , 18 ) );

        btn.setForeground ( Color.BLUE);// Element inside color like text
        btn.setBackground( Color.yellow); // background color of element

        Cursor csr = new Cursor ( Cursor.HAND_CURSOR);

        btn.setCursor ( csr );

//        btn.setEnabled ( false );


        btn.setIcon ( img );

        cont.add ( btn );
        btn.setText ( "My Button" );




        jf.setVisible ( true );
    }
}
