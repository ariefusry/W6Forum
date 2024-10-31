public class Eagle extends Birds implements CanFly, Carnivorous {
    public Eagle(String nama) {
        super(nama);
    }

    public void infoEagle(){
        System.out.println(nama+" adalah hewan bertipe burung dan bertelur");
    }

    @Override
    public void fly(){
        System.out.println(nama+" sedang terbang");
    }

    @Override
    public void eatMeat(){
        System.out.println(nama+" sedang memakan daging");
    }
}
