package com.company;
//Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность. Написать 2 разных конструктора
// для создания объекта. В одном конструкторе задаются все поля, в другом только здоровье и урон. Добавить в класс Hero
// геттеры для всех полей.
public class hero {
    private int health;
    private int damage;
    private String superPower;

    public hero(){

    }

    public hero( int health, int damage){
    this.health = health;
    this.damage = damage;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

}

