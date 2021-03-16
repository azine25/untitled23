package com;

public class Magic extends Hero implements HavingSuperAbility{

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Magic применил суперспособность " + superAbilityType;
    }
}
