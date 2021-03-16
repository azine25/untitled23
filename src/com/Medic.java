package com;

public class Medic extends Hero implements HavingSuperAbility{


    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Medic применил суперспособность "+ superAbilityType;
    }
}
