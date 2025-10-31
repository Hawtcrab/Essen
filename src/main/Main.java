package main;

import main.game.Find;
import main.game.characters.PlayerCharacter;
import main.game.gui.screens.MainScreen;
import main.game.locations.BaseLocation;
import main.game.locations.SubwayLocation;
import main.game.gui.screens.LocationScreen;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Initialize();
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(Find.screen);
        frame.setVisible(true);

    }

    public static void Initialize() {
        Find.screen = new LocationScreen();
        Find.character = new PlayerCharacter();
        Find.location = new SubwayLocation();
    }




}