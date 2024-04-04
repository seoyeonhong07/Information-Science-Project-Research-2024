package Pokemons;

public class Charizard extends Pokemon {
    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
        this.attackPoint = 25;
        this.skills[0] = "claw";
        this.skills[1] = "dragon's breath";
        this.skills[2] = "flare drive";
        this.skillPoints[0] = 40;
        this.skillPoints[1] = 60;
        this.skillPoints[2] = 120;
        System.out.println("Riza~~");
    }

    public Charizard() {
        System.out.println("Riza~~");
    }

    @Override
    public void attack() {
        System.out.println("Wide area fire attack~");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        targetPokemon.setHp(targetPokemon.getHp() - this.attackPoint);
        System.out.println(this.getName() + " fires a flamethrower attack at "+ targetPokemon.getName() +".");
        System.out.println("The Hp of the wild Pokemon" + targetPokemon.getName() + "was reduced to " + targetPokemon.getHp() + " due to " + this.getName() + "'s attack.");
    }
}