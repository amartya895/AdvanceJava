package UNIT2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener {

    Container cont;
    JLabel lableFirst, lableSecond, labelRes;
    JTextField num1, num2;
    JButton addBtn, subBtn, mulBtn, divBtn;


    Calculator () {
        setTitle ( "Calculator" );
        setBounds ( 100 , 100 , 600 , 500 );
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

        cont = getContentPane ( );
        cont.setLayout ( null );

        Font font = new Font ( "Arial" , Font.BOLD , 11 );
        Font f = new Font ( "Arial" , Font.BOLD , 34 );

        // lable properties

        lableFirst = new JLabel ( "First Number :  " );
        lableFirst.setBounds ( 50 , 50 , 150 , 50 );
        cont.add ( lableFirst );
        lableSecond = new JLabel ( "Second Number :  " );
        lableSecond.setBounds ( 50 , 150 , 150 , 50 );
        cont.add ( lableSecond );

        // result

        labelRes = new JLabel ( "Result : " );

        labelRes.setBounds ( 50 , 350 , 700 , 50 );
        cont.add ( labelRes );
        labelRes.setFont ( font );
        labelRes.setFont ( f );
        labelRes.setForeground ( Color.RED );

        // properties to textField

        num1 = new JTextField ( );
        num1.setBounds ( 200 , 50 , 100 , 50 );

        cont.add ( num1 );

        num2 = new JTextField ( );
        num2.setBounds ( 200 , 150 , 100 , 50 );
        cont.add ( num2 );

        // button properties

        addBtn = new JButton ( "+" );
        addBtn.setBounds ( 50 , 250 , 150 , 50 );
        addBtn.addActionListener ( this );
        cont.add ( addBtn );


        subBtn = new JButton ( "-" );
        subBtn.setBounds ( 250 , 250 , 150 , 50 );
        subBtn.addActionListener ( this );
        cont.add ( subBtn );

        mulBtn = new JButton ( "*" );
        mulBtn.setBounds ( 50 , 300 , 150 , 50 );
        mulBtn.addActionListener ( this );
        cont.add ( mulBtn );


        divBtn = new JButton ( "/" );
        divBtn.setBounds ( 250 , 300 , 150 , 50 );
        divBtn.addActionListener ( this );
        cont.add ( divBtn );


        setVisible ( true );
    }

    @Override
    public void actionPerformed ( ActionEvent e ) {

        int x = Integer.parseInt ( num1.getText ( ) );
        int y = Integer.parseInt ( num2.getText ( ) );

        int z;

        try {
            if (e.getSource ( ) == addBtn) {

                z = x + y;
                labelRes.setText ( "Result : " + z );
            } else if (e.getSource ( ) == subBtn) {
                z = x - y;
                labelRes.setText ( "Result : " + z );
            } else if (e.getSource ( ) == mulBtn) {
                z = x * y;
                labelRes.setText ( "Result : " + z );
                ;
            } else if (e.getSource ( ) == divBtn) {
                z = x / y;
                labelRes.setText ( "Result : " + z );
            }

        } catch (NumberFormatException ne) {
            labelRes.setText ( "Result : enter numeric value only.." );

        } catch (ArithmeticException ee) {
            labelRes.setText ( "Result : enter non zero value in text 2 only.." );
        }

    }
}


public class MyCalculator {
    public static void main ( String[] args ) {

        new Calculator ( );
    }
}
