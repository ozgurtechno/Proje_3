package entity;

public class CartItem{

    // TODO Bu class a dokunmayiniz
    //----------------------Fields ---------------------------------------------------------------------
    private Item item;
    private int quantity;

    // TODO Bu class a dokunmayiniz
    //----------------------Constructor ---------------------------------------------------------------------
    public CartItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    // TODO Bu class a dokunmayiniz
    //----------------------Getter and Setter ---------------------------------------------------------------------
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
