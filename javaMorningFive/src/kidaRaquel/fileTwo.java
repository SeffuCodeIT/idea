package kidaRaquel;

public class fileTwo {
    public static void main(String[] args) {
      majina("raquel","Burns");
      majina(" Brooklyn","Wyatt");
      hesabu(25366,783764);
      avg(6553,74734,83465);
    }
    public static String majina(String x, String y){
        String jibu  = x+" "+y;
        System.out.println("Your name is"+jibu);
        return jibu;
    }
    public static Integer hesabu(int a, int b){
        int jibu = a+b;
        System.out.println("The answer is "+jibu);
        return jibu;

    }
    public static Double avg(double m,double k, double g){
        double answer = (m+k+g)/3.0;
        System.out.println("The average is"+answer);
        return answer;
    }
    public static Double volume(double radius,double height){
        double jibu = Math.PI* Math.pow(radius,2)*height;
        System.out.println("Volume = "+jibu);
        return jibu;
    }





}
