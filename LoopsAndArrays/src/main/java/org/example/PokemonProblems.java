package org.example;

import java.util.Arrays;

public class PokemonProblems {
    public static void main(String[] args) {
        String[] pokemon = {"snorlax", "pikachu", "caterpie", "squirtle", "chimecho", "charmander"};

        //I want to pull out the pokemon that start with the letter 'c'

            //SIDEBAR: HOW do I know if something starts with c?
                    //starts with -> first letter is
                //String x = "chello";
                //String y = "hello";
                //boolean startsWithC = str.substring(0, 1).equalsIgnoreCase("c");

        //Count the number of pokemon that start with c
        //Make a new Array-> we gotta know the size
        //Fill it up

        int counter = 0;
        for (int i = 0; i < pokemon.length; i++) {
            String curr = pokemon[i];
            String firstLetter = curr.substring(0, 1);
            if (firstLetter.equals("c")){
                counter++;
            }
        }
        System.out.println(counter + " pokemon start with c");

        String[] pokemonWithCs = new String[counter];

        int C_Index = 0;
        for (int i = 0; i < pokemon.length; i++){
            if (pokemon[i].substring(0, 1).equals("c")){
                pokemonWithCs[C_Index] = pokemon[i];
                C_Index++;
            }
        }
        System.out.println(Arrays.toString(pokemonWithCs));
        System.out.println(pokemonWithCs);

    } //ends the main method
} //ends the class/file
