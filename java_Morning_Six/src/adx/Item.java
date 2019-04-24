package adx;

public class Item {
    String name;
    Integer qtty,price;

    public Item(String name, Integer qtty, Integer price) {
        this.name = name;
        this.qtty = qtty;
        this.price = price;
    }

    public String toString(){
        return "\n"+name+"\t"+qtty+"\t"+price+"\n\n";
    }
}
