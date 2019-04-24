package ads;

import java.util.Scanner;

public class interest extends functionclass{
    public static void main(String[] args) {
            Scanner chukua;
            chukua = new Scanner(System.in);
            Double p,r,t;
            System.out.println("enter principle");
            p = chukua.nextDouble();
            System.out.println("enter rate");
            r = chukua.nextDouble();
            System.out.println("enter time");
            t = chukua.nextDouble();
            interest(p,r,t);
        }

    }

