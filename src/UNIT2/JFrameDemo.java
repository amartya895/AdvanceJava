package UNIT2;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {

    public static void main ( String[] args ) {
        JFrame jf = new JFrame ( );

        jf.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

        jf.setSize ( 800 , 600 );
        jf.setTitle ( "First Desktop App" );
//        jf.setLocation ( 350 , 100 );

        jf.setBounds ( 350 , 100 , 800 , 600 );

        ImageIcon icon = new ImageIcon ( "/Users/amartyasen/Downloads" );
        jf.setIconImage ( icon.getImage ( ) );
        Container cont = jf.getContentPane ();
        cont.setBackground ( Color.blue );
        jf.setResizable ( false );
        jf.setVisible ( true );
    }
}
