package kidaRaquel;

public class assignment1 {
    public static void main(String[] args) {
      BMI(52,180) ;
      area(564,3636);
      interest(74765,74,7);

    }
    public static Double BMI(double weight, double height){
        double answer  = weight/(Math.pow(height,2));
        System.out.println("BMI is"+answer);
        return answer;
    }
    public static Double area(double base, double height){
        double jibu = 0.5*base*height;
        System.out.println("Areae is"+jibu);
        return jibu;
    }
    public static Double interest(double p,double r,double t){
        double answer = (p*r*t)/100.0;
        System.out.println("Interest is"+answer);
        System.out.println();
        return answer;

    }
}
