package service;

import entity.Cart;
import entity.User;
import exception.ItemNotFoundException;

public interface ShoppingService {

    // TODO Bu class a dokunmayiniz....OOP Abstraction

    void completePurchase(User currentUser, Cart shoppingCart) throws ItemNotFoundException;
}
