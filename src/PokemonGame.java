import Pokemons.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your pokemonster. 1) Pikachu  2) Squirtle  3)Charizard : ");
        int select = scanner.nextInt();

        Pokemon playerPokemon;
        if(select == 1)
            playerPokemon = new Pikachu();
        else if (select == 2)
            playerPokemon = new Squirtle();
        else if (select == 3)
            playerPokemon = new Charizard();

        while(true){
            System.out.println("pass");
            break;
        }
    }
}