package home.work13.character;

public class Troll extends Character {
    @Override
    public void fight() {
        System.out.println("The Troll hits the enemy with an " + weapon.useWeapon());
    }
}
