package service;

import entity.Cart;
import entity.CartItem;
import entity.Item;
import entity.User;
import exception.ItemNotFoundException;

public class ShoppingServiceImpl extends AbstractService implements ShoppingService{

    ItemService itemService = new ItemServiceImp();

    // Bu service class inda ShoppingService icerisinde tanimli govdesiz methodlarin implementationunu yapacaksiniz...
    // Class ismindeki KIRMIZI ikaza giderseniz 'implement mothods' secenegini goreceksiniz... Onu secin ve baslayin...


    // completePurchase methodu cagirildiginda, daha once ApplicationRunner sinifinda bulunan butun alisveris yapma
    // kodunu bunyesinde barindirir... Scanner ile kullaniciya urun secimi yapma, sepete ekleme vs hususlarinda ihtiyac duydugu
    // Scanner objesine AbstractService i extend ederek ulasir...
    // Return tipi viod bir method olup, ApplicationRunner sinifinda gecen hafta kullandigimiz kodun bu class a tasinmasindan ibarettir..
    // Yukarida tanimlanan itemService, daha once Database sinifinda yer alan fakat yeniden yapilandirilarak ItemService icersinde
    // tanimlanan getItemById(), getAllItems() vb. methodlara ulasabilmek maksadiyla eklenmistir...
    // TODO itemService implementation sinifindaki odevleriniz bitmeden baslamayiniz...
}
