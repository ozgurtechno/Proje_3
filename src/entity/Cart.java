package entity;

import java.util.ArrayList;
import java.util.List;

public class Cart{

    // TODO Bu class a dokunmayiniz
    //----------------------Fields-------------------------------------------------------------------------
    private List<CartItem> items = new ArrayList<>();
    private double totalCartCost;

    //----------------------Constructor---------------------------------------------------------------------

    // TODO Bu class a dokunmayiniz
    public Cart() {
    }

    // TODO Bu class a dokunmayiniz
    //----------------------Instance Methods----------------------------------------------------------------
    public void addToCart(CartItem item){
        for (CartItem cartItem : items){
            if (item.getItem().equals(cartItem.getItem())){
                cartItem.setQuantity(cartItem.getQuantity() + item.getQuantity());
                calculateTotalCartCost();
                return;
            }
        }
        this.items.add(item);
        calculateTotalCartCost();
    }

    private void calculateTotalCartCost() {
        this.totalCartCost = 0;
        for(CartItem cartItem: items){
            totalCartCost += cartItem.getQuantity() * cartItem.getItem().getPrice();
        }
    }

    public void emptyCart(){
        this.items.clear();
    }


    //----------------------Getter and Setter ---------------------------------------------------------------------

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public double getTotalCartCost() {
        return totalCartCost;
    }

    public void setTotalCartCost(double totalCartCost) {
        this.totalCartCost = totalCartCost;
    }
}
