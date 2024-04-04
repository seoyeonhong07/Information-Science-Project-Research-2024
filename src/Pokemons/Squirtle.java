package Pokemons;

public class Squirtle extends Pokemon{
    public Squirtle() { System.out.println("Crrrrrrrr~"); }

    public Squirtle(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Nofly());
        this.attackPoint = 12;
        this.skills[0] = "body slam";
        this.skills[1] = "water canon";
        this.skills[2] = "hydro pump";
        this.skillPoints[0] = 35;
        this.skillPoints[1] = 40;
        this.skillPoints[2] = 110;
        System.out.println("Crrrrrrrr~");
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
        targetPokemon.setHp(targetPokemon.getHp() - this.attackPoint);
        System.out.println(this.getName() + " attacks " + targetPokemon.getName() + " with a water cannon.");
        System.out.println("The Hp of the wild Pokemon" + targetPokemon.getName() + "was reduced to " + targetPokemon.getHp() + " due to " + this.getName() + "'s attack.");
    }
}