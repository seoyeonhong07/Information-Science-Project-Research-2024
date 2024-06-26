package Pokemons;

import java.util.ArrayList;
import java.util.Arrays;

public class Charizard extends Pokemon {
    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
        this.attackPoint = 25;
        this.skills = new ArrayList<>(Arrays.asList("claw", "dragon's breath", "flare drive"));
        this.skillPoints = new ArrayList<>(Arrays.asList(40, 60, 120));

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
    public void attack(Pokemon targetPokemon, int s) {
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint + this.skillPoints.get(s)));
        System.out.println(this.getName() + " fires a " + this.skills.get(s) + " at "+ targetPokemon.getName() +".");
        System.out.println("The Hp of the Pokemon " + targetPokemon.getName() + "was reduced to " + targetPokemon.getHp() + " due to " + this.getName() + "'s attack.");
    }
}