package Pokemons;

import java.util.Random;
import java.util.Scanner;

public class PokemonGame {
    static Pokemon wildPokemon;
    public static void produceEnemyPokemon(){
        Random random = new Random();
//        random.setSeed(32);

        System.out.println("A wild Pokemon has appeared.");
        int select = random.nextInt(3);
        if(select == 0)
            wildPokemon = new Pikachu("Pikachu", 50);
        else if (select == 1)
            wildPokemon = new Squirtle("Squirtle", 55);
        else if (select == 2)
            wildPokemon= new Charizard("Charizard", 74);
        else
            wildPokemon = new Pikachu("Pikachu", 50);
    }
    public static void main(String[] args) {
//        Random random = new Random();
//        random.setSeed(32);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your pokemonster. 1) Pikachu(default)  2) Squirtle  3)Charizard : ");
        int select = scanner.nextInt();

        Pokemon playerPokemon;
        if(select == 1)
            playerPokemon = new Pikachu("Pikachu", 50);
        else if (select == 2)
            playerPokemon = new Squirtle("Squirtle", 55);
        else if (select == 3)
            playerPokemon = new Charizard("Charizard", 74);
        else
            playerPokemon = new Pikachu("Pikachu", 50);   // default

        //      Enemy Pokemon
        produceEnemyPokemon();

        while(true){
            System.out.print("1) Battle  2) Run away  3) quit : ");
            int menu = scanner.nextInt();
            if(menu == 3){
                System.out.println("Exit the program...");
                break;
            } else if (menu == 1) {
//                System.out.print("\t1) " + playerPokemon.skills[0]+ "  2) " + playerPokemon.skills[1] + "  3) " + playerPokemon.skills[2] + "  : ");
                System.out.print("\t1) " + playerPokemon.skills.get(0)+ "  2) " + playerPokemon.skills.get(1) + "  3) " + playerPokemon.skills.get(2) + "  : ");
                int skill = scanner.nextInt() -1;
                playerPokemon.attack(wildPokemon, skill);
                System.out.println("=====================");
                wildPokemon.attack(playerPokemon, skill);
            } else if (menu == 2) {
                System.out.println("The player's Pokemon runs away.");
                produceEnemyPokemon();
            }
        }
    }
}