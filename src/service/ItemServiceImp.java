package service;

import database.Database;
import entity.Item;
import exception.ItemNotFoundException;

import java.util.List;

public class ItemServiceImp implements ItemService{

    // ItemService icerisinde tanilanmis govdesiz tum methodlarin implementation unu bu class da yapacaksiniz...
    // Class ismindeki KIRMIZI ikaza giderseniz 'implement mothods' secenegini goreceksiniz... Onu secin ve baslayin...





    // GetAllItems methodu Database e gidip oradan butun item lari alir ve bir List olarak return eder...






    // getItemById methodu parametre olarak aldigi id ile Database de boyle bir item var mi diye kontrol eder,
    // yoksa, ItemNotFound exception firlatir, varsa ilgili item i return eder...







    // addItem methodu, parametre olarak aldigi item i Database deki items listesine ekler...





    // deleteItemById methodu parametre olarak aldigi id ile Database de o urunu arar, bulamazsa ItemnotFound exception firlatir
    // ilgili item mevcut ise onu Database list inden siler...






    // updateItem methodu parametre olarak aldigi Item i Database de arar, yoksa ItemNotFound exception firlatir,
    // Varsa Datalase deki items listesinden silip, guncel halini Database List ine ekler...

}
