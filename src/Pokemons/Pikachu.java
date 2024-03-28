package Pokemons;

public class Pikachu extends Pokemon {
    public Pikachu() {
    }

    public Pikachu(String name, int hp) {
        super(name, hp);
    }

    public Pikachu(String name, int hp, Nofly nofly) {
        super(name, hp);
        super.setFlyable(nofly);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Type : Electric");
    }

    @Override
    public void attack() {
        System.out.println("Wide area lightning attack~");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        System.out.println(this.getName() + " makes a lightning attack at " + targetPokemon.getName() + ".");
    }
}