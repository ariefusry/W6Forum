//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // mammal
        Whale w = new Whale("Whale");
        Bat b = new Bat("Bat");
        Tiger t = new Tiger("Tiger");

        // birds
        Eagle e = new Eagle("Eagle");
        Ostrich o = new Ostrich("Ostrich");
        Penguin p = new Penguin("Penguin");

        //whale
        w.infoWhale();
        w.swim();
        w.dive();
        System.out.println(" ");

        //bat
        b.infoBat();
        b.fly();
        System.out.println(" ");

        //tiger
        t.infoTiger();
        t.eatMeat();
        System.out.println(" ");

        //eagle
        e.infoEagle();
        e.eatMeat();
        e.fly();
        System.out.println(" ");

        //ostrich
        o.infoOstrich();
        System.out.println(" ");

        //penguin
        p.infoPenguin();
        p.eatMeat();
        p.swim();
        p.dive();

    }
}