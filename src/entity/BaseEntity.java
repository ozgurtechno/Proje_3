package entity;

public abstract class BaseEntity {

    // TODO Bu class yeni eklenmis olup, her item ve user a id saglanabilmesi maksadiyla kullanilmaktadir...
    // TODO Bu class a dokunmayiniz
    int id;

    public BaseEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // TODO Bu class a dokunmayiniz...
}
