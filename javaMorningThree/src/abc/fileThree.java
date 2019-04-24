package abc;

import javax.swing.*;

public class fileThree {
    public static void main(String[] args) {
        String p,r,t;
        Double pConv,tConv,rConv,answer;
        p = JOptionPane.showInputDialog("Enter principal");
        r = JOptionPane.showInputDialog("Enter the rate per year");
        t = JOptionPane.showInputDialog("Enter time in years");
        pConv = Double.parseDouble(p);
        rConv = Double.parseDouble(r);
        tConv = Double.parseDouble(t);
        answer = (pConv*rConv*tConv)/100.0;
        JOptionPane.showMessageDialog(null,String.valueOf(answer));
    }
}
