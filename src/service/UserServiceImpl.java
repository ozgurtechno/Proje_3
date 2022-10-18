package service;

import database.Database;
import entity.Address;
import entity.User;
import enums.City;
import exception.UserNotFoundException;

import java.util.List;

public class UserServiceImpl extends AbstractService implements UserService{

    int randomId = (int) (Math.random() * 100);

    // UserService icerisinde tanilanmis govdesiz tum methodlarin implementation unu bu class da yapacaksiniz...
    // Class ismindeki KIRMIZI ikaza giderseniz 'implement mothods' secenegini goreceksiniz... Onu secin ve baslayin...





    // GetAllUsers methodu Database e gidip oradan butun user lari alir ve bir List olarak return eder...






    // getUserById methodu parametre olarak aldigi 'id' ile Database de boyle bir user var mi diye kontrol eder,
    // yoksa, UserNotFound exception firlatir, varsa ilgili user i return eder...







    // addUser methodu, ApplicationRunner Class inda kullaniciya sorarak olusturdugumuz tum User olusturma kodunu bunyesinde
    // barindirir... Bunun icin Scanner a ihtiyac duyar ve bu Scanner'i Abstract Service i extend ederek oradaki Scanneri kullanir
    // User icin 'id' belirlenirken yukaridaki 'randomid' degiskenini kullanir...
    // Kullanici olusturulduktan sonra Database deki users listesine ekler..Son olarak o useri return eder...





    // deleteUserById methodu parametre olarak aldigi 'id; ile Database de o user i arar, bulamazsa UserNotFound exception firlatir
    // ilgili user mevcut ise onu Database users list inden siler...






    // updateUser methodu parametre olarak aldigi User i Database de arar, yoksa UserNotFound exception firlatir,
    // Varsa Datalase deki users listesinden silip, guncel halini Database users List ine ekler...


}
