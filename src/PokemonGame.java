import Pokemons.*;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(32);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your pokemonster. 1) Pikachu(default)  2) Squirtle  3)Charizard : ");
        int select = scanner.nextInt();

        Pokemon playerPokemon, wildPokemon;
        if(select == 1)
            playerPokemon = new Pikachu("Pikachu", 50);
        else if (select == 2)
            playerPokemon = new Squirtle("Squirtle", 55);
        else if (select == 3)
            playerPokemon = new Charizard("Charizard", 74);
        else
            playerPokemon = new Pikachu("Pikachu", 50);   // default

        System.out.println("A wild Pokemon has appeared.");
        select = random.nextInt(3);
        if(select == 0)
            wildPokemon = new Pikachu("Pikachu", 50);
        else if (select == 1)
            wildPokemon = new Squirtle("Squirtle", 55);
        else if (select == 2)
            wildPokemon= new Charizard("Charizard", 74);
        else
            wildPokemon = new Pikachu("Pikachu", 50);


        while(true){
            System.out.print("1) Battle  2) Run away  3) quit : ");
            int menu = scanner.nextInt();
            if(menu == 3){
                System.out.println("Exit the program...");
                break;
            } else if (menu == 1) {
                playerPokemon.attack(wildPokemon);
                wildPokemon.attack(playerPokemon);
            } else if (menu == 2) {
                System.out.println("The Player Pokemon runs away.");
            }
        }
    }
}