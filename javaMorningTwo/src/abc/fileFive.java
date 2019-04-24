package abc;


import java.util.Scanner;

public class fileFive {
    public static void main(String[] args) {
        Double x,y,answer;
        Scanner chukua;
        chukua = new Scanner(System.in);
        System.out.println("first number");
        x = chukua.nextDouble();
        System.out.println("second number");
        y = chukua.nextDouble();
        answer = x*y;
        System.out.println("the product is "+answer);
    }
}
