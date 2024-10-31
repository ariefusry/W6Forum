public class Bat extends Mammal implements CanFly {
    public Bat(String nama) {
        super(nama);
    }

    public void infoBat(){
        System.out.println(nama+" adalah hewan mamalia");
    }

    @Override
    public void fly(){
        System.out.println(nama+" sedang terbang");
    }
}
