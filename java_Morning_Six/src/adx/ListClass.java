package adx;

import javax.swing.*;
import java.util.ArrayList;

public class ListClass {
    public static void main(String[] args) {
        ArrayList<Item> list;
        list = new ArrayList<>();
        Item kitu;
        kitu = new Item("Soap",1,200);
        list.add(kitu);

        kitu = new Item("Sugar",1,100);
        list.add(kitu);

        kitu = new Item("Salt",2,50);
        list.add(kitu);
        JOptionPane.showMessageDialog(null,list.toString());
    }
}
