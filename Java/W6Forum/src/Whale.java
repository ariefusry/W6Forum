public class Whale extends Mammal implements Aquatic {
    public Whale(String nama) {
        super(nama);
    }

    public void infoWhale(){
        System.out.println(nama+" adalah hewan mamalia");
    }

    @Override
    public void swim(){
        System.out.println(nama+" sedang berenang");
    }

    @Override
    public void dive(){
        System.out.println(nama+" sedang melakukan dive");
    }
}
