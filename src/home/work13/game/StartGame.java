package home.work13.game;

public class StartGame {
    public static void main(String[] args) {
        Menu menu = new Menu();
        home.work13.character.Character character = menu.characterSelection();
        menu.selectAction(character);
    }
}
