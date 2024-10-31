public class Tiger extends Mammal implements Carnivorous {
    public Tiger(String nama) {
        super(nama);
    }

    public void infoTiger(){
        System.out.println(nama+" adalah hewan mamalia");
    }

    @Override
    public void eatMeat(){
        System.out.println(nama+" sedang memakan daging");
    }
}
