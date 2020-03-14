package ru.job4j.middle.multithreading.threadIssue.strategy;

import ru.job4j.middle.multithreading.threadIssue.strategy.weapons.Weapon;

public class Player {

    private Weapon weapon;

    public void useWeapon() {
        if (weapon == null) {
            System.out.println("Player: - I have no weapon in my hand");
        } else {
            weapon.shoot();
        }
    }

    public void dropWeapon() {
        if (weapon == null) {
            System.out.println("Player: - I have no weapon in my hand");
        } else {
            Weapon droppedWeapon = weapon;
            weapon = null;
            System.out.printf("Player: - I have dropped my weapon '%s'\n", droppedWeapon.getClass().getSimpleName());
        }
    }

    public void receiveWeapon(Weapon weapon) {
        if (this.weapon != null) {
            dropWeapon();
        }
        this.weapon = weapon;
        System.out.printf("Player: - I get weapon '%s'\n", weapon.getClass().getSimpleName());

    }

}
