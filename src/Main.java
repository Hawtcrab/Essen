import game.Core;
import game.gui.screens.MainScreen;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void Initialize() {
        Core.currentScreen = new MainScreen();
    }


}