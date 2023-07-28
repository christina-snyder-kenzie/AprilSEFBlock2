package org.example;

public class Zoo {
    public static void main(String[] args) {
        Animal kanga = new Animal(2, "fur", 100, true, false);

        Animal roo = new Animal(2, "fur", 40, true, false);

        System.out.println("Kanga");
        System.out.println(kanga.getWeight());
        kanga.eat();
        kanga.sleep();
        System.out.println(kanga.getWeight());
        System.out.println("--------------");

        System.out.println("Roo");
        System.out.println(roo.getExterior());
        roo.breathe();


        kanga.fight(roo);
        System.out.println("---------------");

        kanga.talk();

        Fish albert = new Fish(0, "scales", 1, true, true, "blue", false, true);

        albert.talk();
        albert.swim();

        kanga.breathe();
        albert.breathe();

        System.out.println("------------------");

        Shark scar = new Shark(0, "sharkskin", 500, true, false, "gray", false, true, 3);

        scar.swim();
        // scar.bite();



        // fight requires another Animal - is scar (a Shark) an Animal?
        System.out.println(scar instanceof Animal);
        roo.fight(scar);

    }
}
