package UNIT2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    Container cont;
    JButton redBtn;
    JButton yellowBtn;

    JButton greenBtn;


    MyFrame () {

        cont = this.getContentPane ( );
        cont.setLayout ( null );
        redBtn = new JButton ( "Red" );
        redBtn.setBounds ( 100 , 200 , 200 , 50 );
        redBtn.setFont ( new Font ( "Arial" , Font.ITALIC , 24 ) );
        cont.add ( redBtn );
        redBtn.addActionListener ( this );


        greenBtn = new JButton ( "Green" );
        greenBtn.setBounds ( 100 , 300 , 200 , 50 );
        greenBtn.setFont ( new Font ( "Arial" , Font.ITALIC , 24 ) );
        cont.add ( greenBtn );
        greenBtn.addActionListener ( this );


        yellowBtn = new JButton ( "Yellow" );
        yellowBtn.setBounds ( 100 , 400 , 200 , 50 );
        yellowBtn.setFont ( new Font ( "Arial" , Font.ITALIC , 24 ) );
        cont.add ( yellowBtn );
        yellowBtn.addActionListener ( this );

    }

    @Override
    public void actionPerformed ( ActionEvent e ) {

        if (e.getSource ( ) == redBtn) {
            cont.setBackground ( Color.red );
        } else if (e.getSource ( ) == greenBtn) {
            cont.setBackground ( Color.green );

        } else {
            cont.setBackground ( Color.yellow );
        }
    }
}

public class ButtonAction {

    public static void main ( String[] args ) {

        MyFrame frm = new MyFrame ( );
        frm.setTitle ( "Action on Button" );
        frm.setBounds ( 500 , 500 , 800 , 600 );
        frm.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        frm.setVisible ( true );


    }
}
