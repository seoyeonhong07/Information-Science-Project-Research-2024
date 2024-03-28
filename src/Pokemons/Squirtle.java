package Pokemons;

public class Squirtle extends Pokemon {
    public Squirtle() {
    }

    public Squirtle(String name, int hp){
        super(name, hp);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Type : Water");
    }

    @Override
    public void attack() {
        System.out.println("Wide area water cannon attack~");
    }

    @Override
    public void attack(Pokemon targetPokemon) {  // LSP
        System.out.println("Performs a water cannon attack on " + targetPokemon.getName());

    }
}
