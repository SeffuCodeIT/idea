package ads;

public class fileTwo {
    public static void main(String[] args) {
       try {
           System.out.println(5/0);
       }catch (Exception e){
           System.out.println("infinity"+e);
       }
    }
}
