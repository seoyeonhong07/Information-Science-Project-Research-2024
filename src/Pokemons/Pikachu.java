package Pokemons;

public class Pikachu extends Pokemon {
    public Pikachu() {
        System.out.println("Pika Pika~");
    }

    public Pikachu(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Nofly());
        this.attackPoint = 15;
        System.out.println("Pika Pika~");
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
        targetPokemon.setHp(targetPokemon.getHp() - this.attackPoint);
        System.out.println(this.getName() + " makes a lightning attack at " + targetPokemon.getName() + ".");
        System.out.println("The Hp of the wild Pokemon" + targetPokemon.getName() + "was reduced to " + targetPokemon.getHp() + " due to " + this.getName() + "'s attack.");
    }
}