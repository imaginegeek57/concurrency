package ru.job4j.middle.multithreading.threadIssue.strategy;

import ru.job4j.middle.multithreading.threadIssue.strategy.weapons.AK47;
import ru.job4j.middle.multithreading.threadIssue.strategy.weapons.M4;
import ru.job4j.middle.multithreading.threadIssue.strategy.weapons.Shotgun;

public class App {

    public static void main(String[] args) {
        Player player = new Player();

        AK47 ak47 = new AK47();
        M4 m4 = new M4();
        Shotgun shotgun = new Shotgun();

        player.useWeapon();
        player.dropWeapon();

        player.receiveWeapon(ak47);
        player.useWeapon();

        player.receiveWeapon(m4);
        player.useWeapon();

        player.receiveWeapon(shotgun);
        player.useWeapon();
        player.useWeapon();

    }

}
