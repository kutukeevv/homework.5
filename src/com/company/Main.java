package com.company;
//В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
//Затем распечатать всю информацию о боссе.
import com.company.boss;

public class Main {

    public static void main(String[] args) {
    boss boss = new boss();
    boss.setDamage(25);
    boss.setHealth(700);
    boss.setTypeDefence("Magical");
    System.out.println("health: " + boss.getHealth() + "damage:" + boss.getDamage() + "Type defence: " + boss.getTypeDefence());



    }
}
