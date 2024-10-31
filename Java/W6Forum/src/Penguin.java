public class Penguin extends Birds implements Carnivorous, Aquatic {
    public Penguin(String nama) {
        super(nama);
    }

    public void infoPenguin(){
        System.out.println(nama+" adalah hewan bertipe burung dan bertelur");
    }

    @Override
    public void eatMeat(){
        System.out.println(nama+" sedang memakan daging");
    }

    @Override
    public void swim(){
        System.out.println(nama+" sedang berenang");
    }

    public void dive(){
        System.out.println(nama+" sedang melakukan dive");
    }
}
