package ads;

public class file_Three {
    public static void main(String[] args) {
        average(5.0,9.5,8.6);
        average(5.0,9.5,9.6);

        average(5,9,8);
        average(8,9,8);
    }
    public static Integer average(int x,int y ,int z){
        int jibu = (x+y+z)/3;
        System.out.println("Integer answer is "+jibu);
        return jibu;
    }

    public static Double average(double x, double y, double z){
        double jibu = (x+y+z)/3.0;
        System.out.println("Double answer is "+jibu);
        return jibu;
    }
}
