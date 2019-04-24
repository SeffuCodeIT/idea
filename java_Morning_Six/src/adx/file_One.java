package adx;

public class file_One {
    String name,email,password;

    public file_One(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String toString(){
        return "\n"+name+" "+email+" "+password+"\n\n";
    }
}
