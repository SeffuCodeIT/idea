package ads;

public class test {
    public static void main(String[] args) {
        bmi(89.5,1.76);
        area(77,98);
    }

    public static Double bmi(double weight, double height) {
        double bmi = weight/Math.pow(height,2);
        System.out.println("Your bmi is " + bmi);
        return bmi;
    }

    public static Integer area(int length,int height) {
        int area = (height*length)/2;
        System.out.println("Your area is " + area);
        return area;
    }


}
