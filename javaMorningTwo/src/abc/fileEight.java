package abc;

import java.util.Scanner;

public class fileEight {
    public static void main(String[] args) {
        Double w,h,bmi;
        Scanner chukua;
        chukua = new Scanner(System.in);
        System.out.println("Enter the weight in kg's");
        w = chukua.nextDouble();
        System.out.println("Enter the height in centimetres");
        h = chukua.nextDouble();
        bmi = w/Math.pow(h,2);
        System.out.println("your bmi is "+bmi);
    }
}
