package adx;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.ArrayList;

public class file_Two {
    public static void main(String[] args) {
        ArrayList<file_One> list;
        list = new ArrayList<>();
        file_One  person;
        person = new file_One("Seffu","seffu@gmail.com","seffu123");
        list.add(person);

        person = new file_One("king","king@gmail.com","king124");
        list.add(person);

        person = new file_One("joy","joy@gmail.com","joy125");
        list.add(person);

        person = new file_One("nelly","nelly@gmail.com","nelly126");
        list.add(person);

        person = new file_One("king","king@gmail.com","king124");
        list.add(person);

        person = new file_One("king","king@gmail.com","king124");
        list.add(person);

        person = new file_One("king","king@gmail.com","king124");
        list.add(person);

        person = new file_One("king","king@gmail.com","king124");
        list.add(person);

        JOptionPane.showMessageDialog(null,list.toString());
    }
}
