package abc;

import javax.swing.*;

public class fileFour {
    public static void main(String[] args) {
        String r,h;
        Double rconv,hconv,answer;
        r = JOptionPane.showInputDialog("Enter radius");
        h = JOptionPane.showInputDialog("Enter height");
        rconv = Double.parseDouble(r);
        hconv = Double.parseDouble(h);
        answer = Math.PI*Math.pow(rconv,2)*hconv;
        JOptionPane.showMessageDialog(null,String.valueOf(answer));
    }
}
