import Pokemons.Pikachu;
import Pokemons.Pokemon;
import Pokemons.Squirtle;

public class PokemonGame {
    public static void main(String[] args) {
        Squirtle s2 = new Squirtle("Squirtle", 70);
        Pikachu p1 = new Pikachu("Pikachu", 50);
        s2.attack(p1);
        p1.attack(s2);
    }
}