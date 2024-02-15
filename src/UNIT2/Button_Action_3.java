package UNIT2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RedClass implements ActionListener {

    @Override
    public void actionPerformed ( ActionEvent e ) {

        Button_Action_3.cont.setBackground ( Color.RED );
    }
}

class YellowClass implements  ActionListener{

    @Override
    public void actionPerformed ( ActionEvent e ) {
        Button_Action_3.cont.setBackground ( Color.yellow );
    }
}

class  GreenClass implements  ActionListener{

    @Override
    public void actionPerformed ( ActionEvent e ) {
        Button_Action_3.cont.setBackground(Color.green);
    }
}

public class Button_Action_3 {

    public static Container cont;

    public static void main ( String[] args ) {


        JFrame jf = new JFrame ( "Button Action 3" );
        jf.setBounds ( 100 , 200 , 700 , 600 );
        jf.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        cont = jf.getContentPane ( );
        cont.setLayout ( null );

        JButton btnRed = new JButton ( "RED" );
        JButton btnYellow = new JButton ( "YELLOW" );
        JButton btnGreen = new JButton ( "GREEN" );


        btnRed.setBounds ( 100 , 50 , 100 , 50 );
        btnYellow.setBounds ( 200 , 50 , 100 , 50 );

        btnGreen.setBounds ( 300 , 50 , 100 , 50 );

        cont.add ( btnRed );
        cont.add ( btnYellow );
        cont.add ( btnGreen );


        btnRed.addActionListener ( new RedClass () );
        btnYellow.addActionListener ( new YellowClass () );
        btnGreen.addActionListener ( new GreenClass () );

        jf.setVisible ( true );
    }
}
