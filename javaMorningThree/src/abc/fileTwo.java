package abc;

import javax.swing.*;

public class fileTwo {
    public static void main(String[] args) {
        String num1,num2;
        Double num1conv,num2conv,jibu;
        num1 = JOptionPane.showInputDialog("Enter the first number");
        num2 = JOptionPane.showInputDialog("Enter the second number");
        num1conv = Double.parseDouble(num1);
        num2conv = Double.parseDouble(num2);
        jibu = num1conv + num2conv;
        JOptionPane.showMessageDialog(null,String.valueOf(jibu));

    }
}
