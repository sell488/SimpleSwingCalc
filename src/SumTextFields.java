/**
 * Created by sell4_8aha on 10/28/2017.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SumTextFields extends JFrame implements ActionListener {
    private JTextField num1;
    private JTextField num2;
    private JTextField sum1;

    private JTextField num3;
    private JTextField num4;
    private JTextField prod1;

    private JLabel equals1;
    private JButton plus1;

    private JLabel equals2;
    private JButton times1;

    public static void main(String[] args) {
        SumTextFields frame = new SumTextFields();
        frame.setSize(400, 500);
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        num1 = new JTextField(7);
        window.add(num1);

        plus1 = new JButton("+");
        window.add(plus1);
        plus1.addActionListener(this);

        num2 = new JTextField(7);
        window.add(num2);

        equals1 = new JLabel(" = ");
        window.add(equals1);

        sum1 = new JTextField(7);
        window.add(sum1);


        num3 = new JTextField(8);
        window.add(num3);

        times1 = new JButton("*");
        window.add(times1);
        times1.addActionListener(this);

        num4 = new JTextField(8);
        window.add(num4);

        equals2 = new JLabel(" = ");
        window.add(equals2);

        prod1 = new JTextField(8);
        window.add(prod1);


    }
    public void actionPerformed(ActionEvent event) {
        int number1 = Integer.parseInt(num1.getText());
        int number2 = Integer.parseInt(num2.getText());
        int number3 = Integer.parseInt(num3.getText());
        int number4 = Integer.parseInt(num4.getText());

        sum1.setText(Integer.toString(number1 + number2));

        prod1.setText(Integer.toString(number3 * number4));
    }


}
