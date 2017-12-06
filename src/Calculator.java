
/**
 * Created by Администратор on 06.03.2017.
 */

import javax.swing.*;
//import javax.awt.BorderLayout;
//import.javax.awt.GridLayout;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculator {
    JPanel windowContent;
    JTextField display;
    JPanel p1, p2;
    JButton button[] = new JButton[10];
    JButton buttonPoint, buttonEquel, buttonReset, buttonPlus, buttonMinus, buttonMultiply, buttonDivide;

    Calculator() {
        CalculatorEngine calcEngine = new CalculatorEngine(this);
        windowContent = new JPanel();
        BorderLayout b1 = new BorderLayout();
        windowContent.setLayout(b1);
        display = new JTextField(30);
        windowContent.add("North", display);
        buttonReset = new JButton("C");
        windowContent.add("West", buttonReset);
        p1 = new JPanel();
        GridLayout g1 = new GridLayout(4,4);
        p1.setLayout(g1);
        String nameButton[] = {"1","2","3","4","5","6","7","8","9","0"};
        for (int i = 0; i < 10; i++) {
            button[i] = new JButton(nameButton[i]);
            p1.add(button[i]);
            button[i].addActionListener(calcEngine);
        }
        buttonPoint = new JButton(".");
        buttonEquel = new JButton("=");
        p1.add(buttonPoint);
        p1.add(buttonEquel);
        windowContent.add("Center", p1);
        p2 = new JPanel();
        GridLayout g2 = new GridLayout(4,1);
        p2.setLayout(g2);
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonMultiply);
        p2.add(buttonDivide);
        windowContent.add("East", p2);
        JFrame frame = new JFrame("myCalculator");
        frame.setContentPane(windowContent);
        frame.pack();
        frame.setVisible(true);
        buttonPoint.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonMultiply.addActionListener(calcEngine);
        buttonDivide.addActionListener(calcEngine);
        buttonEquel.addActionListener(calcEngine);
        buttonReset.addActionListener(calcEngine);
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

    }

}

