import Pokemons.*;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(31);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your pokemonster. 1) Pikachu  2) Squirtle  3)Charizard : ");
        int select = scanner.nextInt();

        Pokemon playerPokemon, wildPokemon;
        if(select == 1)
            playerPokemon = new Pikachu();
        else if (select == 2)
            playerPokemon = new Squirtle();
        else if (select == 3)
            playerPokemon = new Charizard();

        System.out.println("A wild Pokemon has appeared.");
        select = random.nextInt(3);
        if(select == 0)
            wildPokemon = new Pikachu();
        else if (select == 1)
            wildPokemon = new Squirtle();
        else if (select == 2)
            wildPokemon= new Charizard();


        while(true){
            System.out.println("pass");
            break;
        }
    }
}