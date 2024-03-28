package Pokemons;

public class Nofly implements Flyable{
    @Override
    public void fly() {
        System.out.println("Pokémon can't fly.");
    }
}