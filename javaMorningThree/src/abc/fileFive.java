package abc;

import javax.swing.*;

public class fileFive {
    public static void main(String[] args) {
        String w,h;
        Double wConv,hConv,jibu;
        w = JOptionPane.showInputDialog("Enter the weight in kgs");
        h = JOptionPane.showInputDialog("Enter the height in metres");
        wConv = Double.parseDouble(w);
        hConv = Double.parseDouble(h);
        jibu = wConv/Math.pow(hConv,2);
        if (jibu<18.5){
            JOptionPane.showMessageDialog(null,"Underweight");
        }else if (jibu<30){
            JOptionPane.showMessageDialog(null,"Healthy weight");
        }else if (jibu<35){
            JOptionPane.showMessageDialog(null,"Obese(class 1)");
        }else if (jibu<40){
            JOptionPane.showMessageDialog(null,"Obese (class 2)");
        }else if (jibu<50){
            JOptionPane.showMessageDialog(null,"Obese (class 3)");
        }else {
            JOptionPane.showMessageDialog(null,"Super Obese (class 4)");
        }
    }
}
