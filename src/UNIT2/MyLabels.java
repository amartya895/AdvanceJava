package UNIT2;

import javax.swing.*;
import java.awt.*;

public class MyLabels {

    public static void main ( String[] args ) {
        JFrame jf = new JFrame ( "First Desktop App" );
        jf.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        jf.setBounds ( 350 , 100 , 800 , 600 );
        Container cont = jf.getContentPane ( );
        cont.setLayout ( null );

        ImageIcon icon = new ImageIcon ( "/Users/amartyasen/Downloads/appstore.png" );
        JLabel label = new JLabel ( "username : " , icon , JLabel.RIGHT );

//        label.setBounds ( 100, 200 , icon.getIconWidth (), icon.getIconHeight ());
        label.setBounds ( 100 , 200 , 200 , 100 );

        Font font = new Font ( "Calibri" , Font.BOLD , 24 );
        label.setFont ( font );


        cont.add ( label );

        jf.setVisible ( true );

    }
}
