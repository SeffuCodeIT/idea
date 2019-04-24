package ads;

public class file_Two {
    public static void main(String[] args) {
        majina("Seffu" ,"kamau");
        hesabu(34,78);
        hesabu(304,778);
        nambari(88 ,62);
        nambari(88.98 ,62.576);
        volume(34,76);
    }

    public static String majina(String x,String y) {
        System.out.println(x+" "+y);
        return null;
    }

    public static Integer hesabu(int x, int y){
        int jibu = x+y;
        System.out.println(jibu);
        return jibu;
    }

    public static Double nambari(double x,double y){
        double jibu = (x*y)/2.0;
        System.out.println("Your product is "+jibu);
        return jibu;
    }
    public static Double volume(double radius,double height){
        double vol = Math.PI*Math.pow(radius,2)*height;
        System.out.println("Your volume is"+vol);
        return vol;
    }

}
