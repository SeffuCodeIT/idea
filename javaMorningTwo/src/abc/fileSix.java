package abc;

import java.util.Scanner;

public class fileSix {
    public static void main(String[] args) {
        Double r,h,volume;
        Scanner ingiza;
        ingiza = new Scanner(System.in);
        System.out.println("enter the radius");
        r = ingiza.nextDouble();
        System.out.println("Enter the height");
        h = ingiza.nextDouble();
        volume = Math.PI *Math.pow(r,2)*h;
        System.out.println("Volume is"+volume);
    }
}
