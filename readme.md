 Arkadaslar merhaba,
 
Guncel yazilim dunyasinda main methodun mevcut oldugu ana class lara 
her ayrintinin altalta doldurulmasi cok yanlistir ve kullanilmaz... Bunun
yerine Service ismini verdigimiz kodun algoritmasinin bulundugu 
siniflar kullanilir...

Gecen hafta yaptigimiz projede tum algoritmamiz ApplicationRunner 
isimli Class in icerisinde idi.. Sizler eksik parcalari tamamlamistiniz.
Simdi ise kodumuzu bir ileri seviyeye ulastirip main method icerisinde bulunan 
butun kodu Service siniflarina tasiyacagiz...

ApplicationRunner sinifi gorundugu gibidir.. Orada herhangibir degisiklik yapma
yacaksiniz.. Gecen hafta ki projeden ApplicationRunner sinifindaki kodu kopyalayip
service siniflarina uygun sekilde koydugunuzda proje yine ayni sekilde calismalidir...

Service siniflarinda sizlere hazir olarak verdigimiz Interface lere dikkat 
edin.. Burada govdesiz halde abstract methodlari goreceksiniz... 
ServiceImplementation siniflari bu interfaceleri implement etmekte olup, sizin
goreviniz gozdesiz methodlarin icerisini uygun sekilde doldurmaniz...

Her methodun implementationunu yaptiginizda programimiz gecen haftaki gibi calisacaktir
Ancak dikkat etmeniz gereken hususlar var...

Mesela Scanner sinifini tasimayacaksiniz, bunun icin sizlere hazir
olusturulmus AbstractService sinifini olusturduk...Service ler halihazirda
AbstractService i extend etmis durumdalar...

UserNotFound ikazini veren Exceptioni da siz olusturacaksiniz...

Kodu iyice inceleyip, akisin nasil olmasi gerektigini tartisip, class larin birbirleri ile 
iliskisini anlamaya calisin... Bu Java ile ilgili son Projeniz... Hakkini verin...

Tabii ki sizlerin yardiminiza bizler yetisecegiz... Ama unutmayin No pain No gain!

