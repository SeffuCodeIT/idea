package ads;

import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner chukua;
        Double p,r,t;
        chukua = new Scanner(System.in);
        System.out.println("enter principle");
        p = chukua.nextDouble();
        System.out.println("enter rate");
        r = chukua.nextDouble();
        System.out.println("enter time");
        t = chukua.nextDouble();
        loan(p,r,t);
    }

    public static Double loan(double p, double r, double t){
        double i = (p*r*t)/100;
        System.out.println("Interest is"+i);
        System.out.println("Total amount is"+(i+p));
        return i;
    }
}
