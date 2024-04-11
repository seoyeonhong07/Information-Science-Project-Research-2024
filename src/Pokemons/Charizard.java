package Pokemons;

import java.util.ArrayList;

public class Charizard extends Pokemon {
    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
        this.attackPoint = 25;
//        this.skills = new String[]{"claw", "dragon's breath", "flare drive"};
//        this.skillPoints = new Integer[]{40, 60, 120};
        this.skills = new ArrayList<>();
        this.skills.add("claw");
        this.skills.add("dragon's breath");
        this.skills.add("flare drive");

        this.skillPoints = new ArrayList<>();
        this.skillPoints.add(40);
        this.skillPoints.add(60);
        this.skillPoints.add(120);

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
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint + this.skillPoints[s]));
        System.out.println(this.getName() + " fires a " + this.skills[s] + " at "+ targetPokemon.getName() +".");
        System.out.println("The Hp of the wild Pokemon" + targetPokemon.getName() + "was reduced to " + targetPokemon.getHp() + " due to " + this.getName() + "'s attack.");
    }
}