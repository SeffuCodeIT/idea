package abc;

import java.util.Scanner;

public class fileSeven {
    public static void main(String[] args) {
        Double  p,r,t,i,a;
        Scanner ingiza;
        ingiza = new Scanner(System.in);
        System.out.println("Enter the principle");
        p = ingiza.nextDouble();
        System.out.println("Enter the rate per year");
        r = ingiza.nextDouble();
        System.out.println("Enter the time in years");
        t = ingiza.nextDouble();
        i = (p*r*t)/100.0;
        System.out.println("Your interest is"+i);
        a = i+p;
        System.out.println("Your total is "+a);
    }
}
