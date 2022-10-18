
import entity.*;
import exception.ItemNotFoundException;
import service.*;

public class ApplicationRunner {

    // TODO Bu class a dokunmayiniz
    public static void main(String[] args) throws ItemNotFoundException {

        UserService userService = new UserServiceImpl();
        ShoppingServiceImpl shoppingService = new ShoppingServiceImpl();
        Cart shoppingCart = new Cart();


        System.out.println("Alisveris yapabilmek icin kayit olusturmaniz gereklidir...");
        User currentUser = userService.addUser();
        System.out.println("Kayit oldugunuz icin tesekkur ederiz... Iyi alisverisler..");

        shoppingService.completePurchase(currentUser, shoppingCart);
        System.out.println("Iyi gunler dileriz...");

        // TODO Buradaki kod service siniflarinda olusturulmali ki program gecen haftaki gibi calissin...
        // TODO Hangi method hangi parametre aliyor geriye ne donduruyor inceleyin...

    }
}
