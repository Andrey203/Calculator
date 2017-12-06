import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Администратор on 15.03.2017.
 */
public class CalculatorEngine implements ActionListener {
    Calculator parent;
    //@Override
    char selectAction = ' ';
    char sign = ' ';
    double currentResult = 0;
    CalculatorEngine(Calculator parent) {
        this.parent = parent;
    }
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String displayText = parent.display.getText();
        String clickedButtonLabel = clickedButton.getText();
        double displayValue = 0;
        char searchPoint = '.';
        Object src = e.getSource();
        if (!"".equals(displayText)) {
            displayValue = Double.parseDouble(displayText);
        }
        /*for (int i = 0; i < displayText.length(); i++) {
            if (displayText.charAt(i) == searchPoint) {
                parent.buttonPoint.setAction();
            }
        }*/
        if (src == parent.buttonReset) {
            selectAction = ' ';
            currentResult = 0;
            sign = selectAction;
            parent.display.setText("0");
        } else if (src == parent.buttonPlus) {
            selectAction = '+';
            currentResult = displayValue;
            sign = selectAction;
        } else if (src == parent.buttonMinus) {
            selectAction = '-';
            currentResult = displayValue;
            sign = selectAction;
        } else if (src == parent.buttonMultiply) {
            selectAction = '*';
            currentResult = displayValue;
            sign = selectAction;
        } else if (src == parent.buttonDivide) {
            selectAction = '/';
            currentResult = displayValue;
            sign = selectAction;
        } else if (src == parent.buttonEquel) {
            if (selectAction == '+') {
                currentResult += displayValue;
                parent.display.setText("" + currentResult);
            } else if (selectAction == '-') {
                currentResult -= displayValue;
                parent.display.setText("" + currentResult);
            } else if (selectAction == '*') {
                currentResult *= displayValue;
                parent.display.setText("" + currentResult);
            } else if (selectAction == '/') {
                currentResult /= displayValue;
                parent.display.setText("" + currentResult);
            }
        } else if (sign != ' ') {
            parent.display.setText("" + clickedButtonLabel);
            sign = ' ';
        }
        else {
            parent.display.setText(displayText + clickedButtonLabel);
        }
    }
}