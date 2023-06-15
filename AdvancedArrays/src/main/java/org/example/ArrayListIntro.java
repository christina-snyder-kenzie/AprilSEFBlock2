package org.example;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<String> superHeroes = new ArrayList<String>();

        superHeroes.add("spiderman");
        superHeroes.add("captain marvel");
        superHeroes.add("batman");
        superHeroes.add("captain america");
        promoteTheCaptains(superHeroes);

        System.out.println(superHeroes);

        superHeroes.add(0, "ironman");
        System.out.println(superHeroes);

        String hero = superHeroes.get(3);
        System.out.println(hero);

        int batLocator = superHeroes.indexOf("batman");
        System.out.println(batLocator);

        String removed = superHeroes.remove(batLocator);
        System.out.println(superHeroes);
        System.out.println("First remove: " + removed);

        String removedAgain = superHeroes.remove(3); //batLocator
        System.out.println(superHeroes);
        System.out.println("Removed: " + removedAgain);

        //String removeThirdTime = superHeroes.remove(3); OOB

        ArrayList<String> copyOfSuperHeroes = new ArrayList<String>(superHeroes);
        removeMan(superHeroes);
        System.out.println(superHeroes);
        System.out.println(copyOfSuperHeroes);

        promoteTheCaptains(copyOfSuperHeroes);
        System.out.println(copyOfSuperHeroes);
    }

    //GOAL: Update all superheroes from captains to commodores
    //captain marvel -> commodore marvel
        //String hero = ?
        //hero = hero.replace("captain", "commodore");
    public static void promoteTheCaptains(ArrayList<String> heroes){
        for (int i = 0; i < heroes.size(); i++){
            String hero = heroes.get(i);
            hero = hero.replace("captain", "commodore");
/*
            if (!hero.contains("commodore")){
                hero = "commodore " + hero;
            }
*/
            heroes.set(i, hero);
        }
    }



    //GOAL: remove any super hero that contains "man"
        //how do we find "man"?
            //replace?
            //substring?
            //indexOf?
        //if (hero.indexOf("man") != -1)
            //contains()

    //hello.indexOf("e") -> 1
    //hello.indexOf("ll") -> 2
    //hello.indexOf("zed") -> -1

    /*
        loop so we can look at everybody
            grab the current hero
            if (it has "man") {
                list.remove(i)
                dont' forget i--
            }
     */
    public static void removeMan(ArrayList<String> heroes){
        for (int i = 0; i < heroes.size(); i++){
            String currentHero = heroes.get(i);
            if (currentHero.indexOf("man") != -1){
                heroes.remove(i);
                i--;
            }
        }
    }

    public static void removeLASTman(ArrayList<String> heroes){
        for (int i = heroes.size() - 1; i >= 0; i--){
            String currentHero = heroes.get(i);
            if (currentHero.contains("man")){
                heroes.remove(i);
                return;
            }
        }
    }


}
