package com;

public class Main {

    public static void main(String[] args) {

        HavingSuperAbility[] havingSuperAbilities = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            System.out.println(havingSuperAbilities[i].applySuperAbility("Forceage"));

        }
    }

}
