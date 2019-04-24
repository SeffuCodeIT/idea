package ads;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<test> list;
        list = new ArrayList<>();
        test watu;

        watu = new test("kamau","kenya",21,777);
        list.add(watu);

        watu = new test("nelly","kenya",22,222);
        list.add(watu);

        watu = new test("claire","kenya",23,333);
        list.add(watu);

        watu = new test("joy","kenya",24,1223);
        list.add(watu);

        watu = new test("king","kenya",25,334);
        list.add(watu);
        System.out.println(list.toString());

    }
}
