package com;

public abstract class Hero implements HavingSuperAbility{
    private int health;
    private int damage;
    private String heroesAttackType;

    public String getHeroesAttackType() {
        return heroesAttackType;
    }

    public void setHeroesAttackType(String heroesAttackType) {
        this.heroesAttackType = heroesAttackType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
