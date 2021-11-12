package home.work13.character;

import home.work13.weapon.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public WeaponBehavior getWeapon() {
        return weapon;
    }
}
