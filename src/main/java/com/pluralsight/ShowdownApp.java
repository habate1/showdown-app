package com.pluralsight;

public class ShowdownApp {
    public static void main(String[] args) {

        /*
        // create a super person
        SuperPerson superPerson = new SuperPerson();
        // set the super persons attributes using the setters
        superPerson.setName("SuperHanna");
        superPerson.setHealth(100);
        superPerson.setExperiencePoints(0);

         */

        // better to only create super heroes and villains
        SuperHero superHero = new SuperHero();
        superHero.setName("SuperHanna");
        superHero.setHealth(100);
        superHero.setExperiencePoints(0);

        SuperVillain superVillain = new SuperVillain();
        superVillain.setName("EvilHanna");
        superVillain.setHealth(100);
        superVillain.setExperiencePoints(50);

        superHero.fight(superVillain);
        superVillain.takeDamage(15);
        superHero.takeDamage(20);

        superHero.fight(superVillain);
        System.out.println(superHero.getStatus() + "\n");
        //superHero.getStatus();
        System.out.println(superVillain.getStatus() + "\n");

    }
}
