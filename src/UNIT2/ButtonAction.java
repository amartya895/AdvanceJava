package UNIT2;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    Container cont;
    JButton btn;

    MyFrame () {

        cont = this.getContentPane ( );
        cont.setLayout ( null );
        btn = new JButton ( "Click Me" );
        btn.setBounds ( 200 , 200 , 200 , 50 );
        btn.setFont ( new Font ( "Arial" , Font.ITALIC , 24 ) );
        cont.add ( btn );
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
