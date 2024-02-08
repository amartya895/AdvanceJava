package UNIT2;

import javax.swing.*;
import java.awt.*;

public class MyTextField {
    public static void main ( String[] args ) {

        JFrame jf = new JFrame ( "First Desktop App" );
        jf.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        jf.setBounds ( 350 , 100 , 800 , 600 );
        Container cont = jf.getContentPane ( );
        cont.setLayout ( null );


        JTextField jTxt = new JTextField ( );
        jTxt.setBounds ( 200 , 200 , 300 , 50 );
        jTxt.setText ( "Enter username " );
        Font f = new Font ( "Arial" , Font.BOLD , 30 );
        jTxt.setFont ( f );


        jTxt.setForeground ( Color.blue );
        jTxt.setBackground ( Color.yellow );
        jTxt.setEditable ( false );

        cont.add ( jTxt );

        JPasswordField pwd = new JPasswordField ( );
        pwd.setBounds ( 200 , 300 , 300 , 50 );
        pwd.setText ( "123456" );

        pwd.setEchoChar ( '$' );
        pwd.setFont ( f );

        cont.add ( pwd );


        jf.setVisible ( true );

    }
}
