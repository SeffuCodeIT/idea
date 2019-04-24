package ads;

public class test {
    String name,hostel;
    Integer age,admno;

    public test(String name, String hostel, Integer age, Integer admno) {
        this.name = name;
        this.hostel = hostel;
        this.age = age;
        this.admno = admno;
    }

    public String toString(){
        return "\n"+name+"\t"+hostel+"\t"+age+"\t"+admno;
    }
}

