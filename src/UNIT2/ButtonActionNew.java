package UNIT2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionNew {

    public static void main ( String[] args ) {
        JFrame jf = new JFrame ( "New Button Actions" );
        jf.setBounds ( 400 , 400 , 800 , 600 );
        jf.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );


        Container cont = jf.getContentPane ( );
        jf.setLayout ( null );

        JButton btnSubmit = new JButton ( "Submit" );
        btnSubmit.setBounds ( 200 , 100 , 200 , 50 );

        cont.add ( btnSubmit );

        btnSubmit.addActionListener ( new ActionListener ( ) {
            @Override
            public void actionPerformed ( ActionEvent e ) {
                System.out.println ( "Clicked me " );
            }
        } );


        jf.setVisible ( true );
    }
}
