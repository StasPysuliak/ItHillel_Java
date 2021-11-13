package home.work13.game;

import home.work13.character.King;
import home.work13.character.Knight;
import home.work13.character.Queen;
import home.work13.character.Troll;
import home.work13.weapon.*;

public class StartGame {
    public static void main(String[] args) {
        home.work13.character.Character king = new King();
        home.work13.character.Character knight = new Knight();
        home.work13.character.Character queen = new Queen();
        home.work13.character.Character troll = new Troll();

        king.setWeapon(new SwordBehavior());
        king.fight();
        queen.setWeapon(new KnifeBehavior());
        queen.fight();
        troll.setWeapon(new AxeBehavior());
        troll.fight();
        knight.setWeapon(new BoxAndArrowBehavior());
        knight.fight();

    }
}
