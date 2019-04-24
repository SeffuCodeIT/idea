package abx;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Scanner;

public class file_Five {
    public static void main(String[] args) {
        String[] players;
        Integer number;
        Scanner ingiza;
        ingiza = new Scanner(System.in);
        String x = JOptionPane.showInputDialog("How many players do you have?");
        number = Integer.parseInt(x);
        players = new String[number];
        for (int i = 0; i<number; i++) {
            players[i] = JOptionPane.showInputDialog("enter player"+(i+1));

        }
        for (int i = 0; i < number; i++) {
            JOptionPane.showMessageDialog(null, players[i]);
        }
    }
}
